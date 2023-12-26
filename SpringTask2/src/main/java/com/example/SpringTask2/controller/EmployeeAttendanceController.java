package com.example.SpringTask2.controller;

import com.example.SpringTask2.entity.EmployeeAttendance;
import com.example.SpringTask2.service.impl.EmployeeAttendanceServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/s2/EmployeeAttendance")

public class EmployeeAttendanceController {
    @Autowired
    private EmployeeAttendanceServiceImpl employeeAttendanceService;

    @PostMapping("/save")
    public ResponseEntity<EmployeeAttendance> addEmployeeAttendance(@RequestBody EmployeeAttendance employeeAttendance){
        EmployeeAttendance employeeAttendance1=employeeAttendanceService.createEmployeeAttendance(employeeAttendance);
        return new ResponseEntity<>(employeeAttendance1, HttpStatus.CREATED);
    }
}
