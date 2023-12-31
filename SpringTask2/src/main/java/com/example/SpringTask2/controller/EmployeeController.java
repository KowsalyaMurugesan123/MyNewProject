package com.example.SpringTask2.controller;


import com.example.SpringTask2.Service1.EmployeeService;
import com.example.SpringTask2.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

//mark class as Controller
@RestController
@RequestMapping("api/s1/Employee")
public class EmployeeController {

    //autowire the  EmployeePaySlipService class
    @Autowired
    private EmployeeService employeeService;

    //save employee details
    @PostMapping("/save")
    public ResponseEntity<Employee> addEmployee(@RequestBody Employee employee){
        Employee save=employeeService.createEmployee(employee);
        return new ResponseEntity<>(save, HttpStatus.CREATED);
    }


}
