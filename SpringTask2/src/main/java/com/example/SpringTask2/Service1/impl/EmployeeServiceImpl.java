package com.example.SpringTask2.Service1.impl;

import com.example.SpringTask2.Service1.EmployeeService;
import com.example.SpringTask2.dictionary.EmployeeAttendanceStatus;
import com.example.SpringTask2.entity.Employee;
import com.example.SpringTask2.entity.EmployeeAttendance;
import com.example.SpringTask2.entity.EmployeePaySlip;
import com.example.SpringTask2.repository.EmployeeAttendanceRepository;
import com.example.SpringTask2.repository.EmployeePaySlipRepository;
import com.example.SpringTask2.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.concurrent.CompletableFuture;

//defining the business logic
@Service
public class EmployeeServiceImpl implements EmployeeService {

    //autowire the  EmployeeRepository interface
    @Autowired
    private EmployeeRepository employeeRepository;

    //autowire the  EmployeeAttendanceRepository interface
    @Autowired
    private EmployeeAttendanceRepository attendanceRepository;

    //autowire the  EmployeePaySlipRepository interface
    @Autowired
    private EmployeePaySlipRepository paySlipRepository;

    //saving a payslip record by using the method save() of CrudRepository
    @Override
    public Employee createEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

//    @Async
//    @Override
//    public CompletableFuture<Employee> getEmployeeById(Long employeeId) {
//        return CompletableFuture.completedFuture(employeeRepository.findById(employeeId).orElse(null));
//    }
}
