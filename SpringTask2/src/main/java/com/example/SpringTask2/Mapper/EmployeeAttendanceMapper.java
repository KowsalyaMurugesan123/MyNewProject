package com.example.SpringTask2.Mapper;

import com.example.SpringTask2.entity.EmployeeAttendance;
import com.example.SpringTask2.resource.EmployeeAttendanceResource;

public class EmployeeAttendanceMapper {


    //mapping a data employeeAttendance to employeeAttendancedto
    public static EmployeeAttendanceResource mapToAttendanceDto(EmployeeAttendance employeeAttendance){
        EmployeeAttendanceResource employeeAttendanceResource = new EmployeeAttendanceResource();
        employeeAttendanceResource.setEmployeeAttendanceStatus(employeeAttendance.getEmployeeAttendanceStatus());
        employeeAttendanceResource.setEmaCurrentDate(employeeAttendance.getEmaCurrentDate());
        employeeAttendanceResource.setEmaMonth(employeeAttendance.getEmaMonth());
        employeeAttendanceResource.setEmployee(employeeAttendance.getEmployee());

        return employeeAttendanceResource;

    }
    //mapping a data employeeAttendanceDto to employeeAttendance
    public static EmployeeAttendance mapToAttendance(EmployeeAttendanceResource employeeAttendanceResource){
        EmployeeAttendance employeeAttendance= new EmployeeAttendance();
        employeeAttendance.setEmployeeAttendanceStatus(employeeAttendanceResource.getEmployeeAttendanceStatus());
        employeeAttendance.setEmaCurrentDate(employeeAttendanceResource.getEmaCurrentDate());
        employeeAttendance.setEmaMonth(employeeAttendanceResource.getEmaMonth());
        employeeAttendance.setEmployee(employeeAttendanceResource.getEmployee());

        return employeeAttendance;

    }
}
