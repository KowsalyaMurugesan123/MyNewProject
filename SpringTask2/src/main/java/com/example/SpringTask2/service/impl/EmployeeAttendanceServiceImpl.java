package com.example.SpringTask2.service.impl;

import com.example.SpringTask2.entity.EmployeeAttendance;
import com.example.SpringTask2.repository.EmployeeAttendanceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class EmployeeAttendanceServiceImpl  {

    @Autowired
    private EmployeeAttendanceRepository employeeAttendanceRepository;


    @Async
    @Transactional
    public EmployeeAttendance createEmployeeAttendance(EmployeeAttendance employeeAttendance){
        return employeeAttendanceRepository.save(employeeAttendance);
    }
}
