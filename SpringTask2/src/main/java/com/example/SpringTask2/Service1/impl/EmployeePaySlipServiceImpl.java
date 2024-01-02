package com.example.SpringTask2.Service1.impl;

import com.example.SpringTask2.ExceptionHandling.EmployeeNotFoundException;
import com.example.SpringTask2.ExceptionHandling.Error;
import com.example.SpringTask2.Service1.EmployeeAttendanceService;
import com.example.SpringTask2.Service1.EmployeePaySlipService;
import com.example.SpringTask2.dictionary.EmployeeAttendanceStatus;
import com.example.SpringTask2.entity.Employee;
import com.example.SpringTask2.entity.EmployeeAttendance;
import com.example.SpringTask2.entity.EmployeePaySlip;
import com.example.SpringTask2.repository.EmployeeAttendanceRepository;
import com.example.SpringTask2.repository.EmployeePaySlipRepository;

import com.example.SpringTask2.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CompletableFuture;

//defining the business logic
@Service
public class EmployeePaySlipServiceImpl implements EmployeePaySlipService {

    //autowire the  EmployeePaySlipRepository interface
    @Autowired
    private EmployeePaySlipRepository employeePaySlipRepository;

    //autowire the  EmployeeAttendanceRepository interface
    @Autowired
    private EmployeeAttendanceRepository employeeAttendanceRepository;

    //autowire the  EmployeeRepository interface
    @Autowired
    private EmployeeRepository employeeRepository;

    //autowire the  EmployeeAttendanceService interface
    @Autowired
    private EmployeeAttendanceService employeeAttendanceService;

    @Async  //async call annotation
    @Override
    public CompletableFuture<EmployeePaySlip> generatePayslip(Long employeeId) {

        // Fetch employee attendance
        List<EmployeeAttendance> attendanceList = employeeAttendanceRepository.findByEmployeeEmpEmployeeId(employeeId);

        // Calculate total days present
        long totalDaysPresent = attendanceList.stream().filter(attendance -> attendance.getEmployeeAttendanceStatus() == EmployeeAttendanceStatus.PRESENT).count();

        //validation

        if (attendanceList.isEmpty()) {

            // Employee not found in attendance records, handle accordingly
            throw new EmployeeNotFoundException("Employee with ID " + employeeId + " not found in attendance records");
        }

        // Calculate basic salary (you may have a more complex logic here)
        double basicSalary = totalDaysPresent * 1000; // Assuming a daily rate of 1000

        // Save the payslip
        EmployeePaySlip payslip = new EmployeePaySlip();

        payslip.setEpsPayslipId(employeeId);
        payslip.setEpsCreatedDate(LocalDate.now());
        payslip.setEpsDaysPresent(totalDaysPresent);
        payslip.setEpsDailySalary(1000);
        payslip.setEpsBasicSalary(basicSalary);
        // payslip.setEmployee(attendanceList.get(0).getEmployee());
        // employeePaySlipRepository.save(payslip);

        return CompletableFuture.completedFuture(employeePaySlipRepository.save(payslip));


    }
    @Override
    @Scheduled(cron = "0 34 13 * * ?")
    public void  generatePayslipsForEmployees() {

        // Fetch all employeeIds from repository
        List<Long> employeeIds = employeeAttendanceRepository.findAllEmployeeIds();

        for (Long ids : employeeIds) {
            generatePayslip(ids);
        }
    }


//    @Override
//    public String generatePayslip(String employeeName) {
//        // Fetch employee by name
//        Employee employee = (Employee) employeeAttendanceRepository.findByEmployeeEmpEmployeeName(Long.valueOf(employeeName));
//
//        // Validate if the employee exists
//        if (employee == null) {
//            throw new EmployeeNotFoundException("Employee with name " + employeeName + " not found");
//        }
//
//        // Fetch employee attendance
//        List<EmployeeAttendance> attendanceList = employeeAttendanceRepository.findByEmployeeEmpEmployeeId(employee.getEmpEmployeeId());
//
//        // Validate if the employee has attendance records
//        if (attendanceList.isEmpty()) {
//            throw new EmployeeNotFoundException("No attendance records found for employee with ID " + employee.getEmpEmployeeId());
//        }
//
//        // Calculate total days present
//        long totalDaysPresent = attendanceList.stream()
//                .filter(attendance -> attendance.getEmployeeAttendanceStatus() == EmployeeAttendanceStatus.PRESENT)
//                .count();
//
//        // Calculate basic salary (you may have a more complex logic here)
//        double basicSalary = totalDaysPresent * 1000; // Assuming a daily rate of 1000
//
//        // Save the payslip
//        EmployeePaySlip payslip = new EmployeePaySlip();
//        payslip.setEpsPayslipId(employee.getEmpEmployeeId());
//        payslip.setEpsCreatedDate(LocalDate.now());
//        payslip.setEpsDaysPresent(totalDaysPresent);
//        payslip.setEpsDailySalary(1000);
//        payslip.setEpsBasicSalary(basicSalary);
//
//        // Save the payslip to the database
//        employeePaySlipRepository.save(payslip);
//
//
//        return "Payslip generated successfully for employee: " + employeeName;
//    }

}
