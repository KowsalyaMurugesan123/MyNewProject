package com.example.SpringTask2.controller;

import com.example.SpringTask2.Service1.EmployeeAttendanceService;
import com.example.SpringTask2.Service1.EmployeePaySlipService;
import com.example.SpringTask2.entity.Employee;
import com.example.SpringTask2.entity.EmployeeAttendance;

import com.example.SpringTask2.entity.EmployeePaySlip;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.CompletableFuture;
//mark class as Controller

@RestController
@RequestMapping("/api/s3/payslip")
public class EmployeePaySlipController {
    //autowire the  EmployeePaySlipService class
    @Autowired
    private EmployeePaySlipService employeePaySlipService;
    //autowire the EmployeeAttendanceService  class
    @Autowired
    private EmployeeAttendanceService employeeAttendanceService;

    //creating post mapping that post the generate payslip in the database
    @PostMapping("/generate")
    public CompletableFuture<EmployeePaySlip> calculateSalary(@RequestParam("empEmployeeId") Long empEmployeeId) {

        CompletableFuture<EmployeePaySlip> stringCompletableFuture = employeePaySlipService.generatePayslip(empEmployeeId);
        return stringCompletableFuture;
    }

//    @PostMapping("/employeeName")
//    public ResponseEntity<String> generatePayslip(@RequestParam("employeeName") String employeeName) {
//
//        String message = String.valueOf(employeePaySlipService.generatePayslip(employeeName));
//        return ResponseEntity.ok(message);
//    }


}