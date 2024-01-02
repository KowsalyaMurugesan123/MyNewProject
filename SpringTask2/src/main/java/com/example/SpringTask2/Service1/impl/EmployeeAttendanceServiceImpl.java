package com.example.SpringTask2.Service1.impl;

import com.example.SpringTask2.Service1.EmployeeAttendanceService;
import com.example.SpringTask2.entity.Employee;
import com.example.SpringTask2.entity.EmployeeAttendance;
import com.example.SpringTask2.repository.EmployeeAttendanceRepository;
import com.example.SpringTask2.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;


//defining the business logic
@Service
public class EmployeeAttendanceServiceImpl implements EmployeeAttendanceService {

    //autowire the  EmployeeAttendanceRepository interface
    @Autowired
    private EmployeeAttendanceRepository employeeAttendanceRepository;

    //autowire the  EmployeeRepository interface
    @Autowired
    private EmployeeRepository employeeRepository;

    //saving  employeeattendance record by using the method save() of CrudRepository
    @Override
    public EmployeeAttendance createEmployeeAttendance(Long id, EmployeeAttendance employeeAttendance) {

        Employee employee=getEmployeeById(id);

        //save the employeeattendance
        EmployeeAttendance attendance = new EmployeeAttendance();
        attendance.setEmployeeAttendanceStatus(employeeAttendance.getEmployeeAttendanceStatus());
        attendance.setEmaCurrentDate(LocalDate.now());
        attendance.setEmaMonth(employeeAttendance.getEmaMonth());
        attendance.setEmployee(employee);

        return employeeAttendanceRepository.save(attendance);
    }

//    @Override
//    public EmployeeAttendanceResource createEmployeeAttendance(EmployeeAttendanceResource employeeAttendanceResource){
//        EmployeeAttendance employeeAttendance = EmployeeAttendanceMapper.mapToAttendance(employeeAttendanceResource);
//
//        employeeAttendance.setEmployeeAttendanceStatus(employeeAttendanceResource.getEmployeeAttendanceStatus());
//        employeeAttendance.setEmaCurrentDate(LocalDate.now());
//        employeeAttendance.setEmaMonth(employeeAttendanceResource.getEmaMonth());
//        employeeAttendance.setEmployee(employeeAttendanceResource.getEmployee());
//        EmployeeAttendance saveAttendance= employeeAttendanceRepository.save(employeeAttendance);
//
//        return EmployeeAttendanceMapper.mapToAttendanceDto(saveAttendance);
//
//
//    }

//        @Override
//    public EmployeeAttendance setAttendance(EmployeeAttendance employeeAttendance) {
//        EmployeeAttendance attendance = new EmployeeAttendance();
//       // attendance.setEmployeeAttendanceStatus(attendance.getEmployeeAttendanceStatus());
//        attendance.setEmaCurrentDate(LocalDate.now());
//        attendance.setEmaMonth(employeeAttendance.getEmaMonth());
//        attendance.setEmployee(employeeAttendance.getEmployee());
//
//        // Save the attendance
//        EmployeeAttendance saveattendance = employeeAttendanceRepository.save(attendance);
//        return saveattendance;
//
//    }

    public Employee getEmployeeById(Long id){
        Employee employee = employeeRepository.findById(id).get();
        return employee;

    }
}
