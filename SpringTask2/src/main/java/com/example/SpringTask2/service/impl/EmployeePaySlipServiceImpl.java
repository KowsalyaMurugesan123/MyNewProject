package com.example.SpringTask2.service.impl;

import com.example.SpringTask2.entity.EmployeeAttendance;
import com.example.SpringTask2.entity.EmployeePaySlip;
import com.example.SpringTask2.repository.EmployeeAttendanceRepository;
import com.example.SpringTask2.repository.EmployeePaySlipRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class EmployeePaySlipServiceImpl  {
    @Autowired
    private EmployeePaySlipRepository employeePaySlipRepository;
    @Autowired
    private EmployeeAttendanceRepository employeeAttendanceRepository;
    @Autowired
    private EmployeeAttendanceServiceImpl employeeAttendanceService;


    public void generatePayslip(Long empEmployeeId){
        long EPS_DAILY_SALARY =500;

        List<EmployeeAttendance> attendanceList =employeeAttendanceRepository.findByEmployeeEmpEmployeeId(empEmployeeId);

        int totalPresentDays =0;
        for (EmployeeAttendance attendance : attendanceList){
            if("present".equalsIgnoreCase(attendance.getEmaAttendanceStatus())){
                totalPresentDays++;
            }
        }
        double totalSalary = totalPresentDays*EPS_DAILY_SALARY;

         EmployeePaySlip employeePaySlip = new EmployeePaySlip();
         employeePaySlip.setEpsDaysPresent(totalPresentDays);
         employeePaySlip.setEpsDailySalary(EPS_DAILY_SALARY);
         employeePaySlip.setEpsBasicSalary(totalSalary);
         employeePaySlip.setEpsCreatedDate(LocalDate.now());
         employeePaySlipRepository.save(employeePaySlip);

    }
}
