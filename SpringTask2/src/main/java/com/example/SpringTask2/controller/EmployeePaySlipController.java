package com.example.SpringTask2.controller;

import com.example.SpringTask2.service.impl.EmployeePaySlipServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/s3/payslip")
public class EmployeePaySlipController {
    @Autowired
    private EmployeePaySlipServiceImpl employeePaySlipService;
    @PostMapping("/generate")
    public void calculateSalary(@RequestParam("empEmployeeId")Long empEmployeeId){

         employeePaySlipService.generatePayslip(empEmployeeId);
    }
}