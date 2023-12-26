package com.example.SpringTask2.controller;

import com.example.SpringTask2.entity.Employee;

import com.example.SpringTask2.service.impl.EmployeeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/s1/Employee")
public class EmployeeController {
    @Autowired
    private EmployeeServiceImpl employeeService;
    @PostMapping
    public ResponseEntity<Employee> addEmployee(@RequestBody Employee employee){
        Employee save=employeeService.createEmployee(employee);
        return new ResponseEntity<>(save, HttpStatus.CREATED);
    }
}
