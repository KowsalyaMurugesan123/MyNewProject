package com.example.SpringTask2.Service1;

import com.example.SpringTask2.entity.EmployeeAttendance;
import com.example.SpringTask2.resource.EmployeeAttendanceResource;

public interface EmployeeAttendanceService {

    /**
     *
     * @param employeeAttendance :An object of type  representing the details of the employee attendance to be created
     * @return                   :The newly created employee attendance object
     */
    public EmployeeAttendance createEmployeeAttendance(Long id, EmployeeAttendance employeeAttendance);

    //public EmployeeAttendance setAttendance(EmployeeAttendance attendance);

    // public EmployeeAttendanceResource createEmployeeAttendance(EmployeeAttendanceResource employeeAttendanceResource);
}
