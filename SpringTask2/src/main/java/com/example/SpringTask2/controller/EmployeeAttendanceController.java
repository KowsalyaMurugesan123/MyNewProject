package com.example.SpringTask2.controller;

import com.example.SpringTask2.Service1.EmployeeAttendanceService;
import com.example.SpringTask2.Service1.impl.EmployeeAttendanceServiceImpl;
import com.example.SpringTask2.entity.EmployeeAttendance;

import com.example.SpringTask2.resource.EmployeeAttendanceResource;
import com.example.SpringTask2.resource.EmployeeResource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

//mark class as Controller
@RestController
@RequestMapping("/api/s2/EmployeeAttendance")

public class EmployeeAttendanceController {

    //autowire the  EmployeePaySlipService class
    @Autowired
    private EmployeeAttendanceService employeeAttendanceService;

    //build Create user REST API
    @PostMapping("/save/{id}")
    public ResponseEntity<EmployeeAttendance> addEmployeeAttendance(@PathVariable Long id, @RequestBody EmployeeAttendance employeeAttendance) {
        EmployeeAttendance employeeAttendance1 = employeeAttendanceService.createEmployeeAttendance(id, employeeAttendance);
        return new ResponseEntity<>(employeeAttendance1, HttpStatus.CREATED);
    }

//    @PostMapping("/attendance")
//    public ResponseEntity<EmployeeAttendance> setEmployeeAttendance(@RequestBody EmployeeAttendance employeeAttendance){
//        EmployeeAttendance attendance = employeeAttendanceService.setAttendance(employeeAttendance);
//        return new ResponseEntity<>(attendance, HttpStatus.CREATED);

//        employeeAttendanceService.setAttendance(employeeAttendance);
//        return ResponseEntity.ok("Employee attendance set successfully.");


}


