package com.example.SpringTask2.service.impl;


import com.example.SpringTask2.entity.Employee;
import com.example.SpringTask2.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl {
    @Autowired
    private EmployeeRepository employeeRepository;



    public Employee createEmployee(Employee employee){
        return employeeRepository.save(employee);
    }
}
