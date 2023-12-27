package com.example.SpringTask2.resource;

import com.example.SpringTask2.dictionary.EmployeeAttendanceStatus;
import com.example.SpringTask2.entity.Employee;

import javax.persistence.*;
import java.time.LocalDate;

public class EmployeeAttendanceResource {

    @Id
    private Long emaId;
    private EmployeeAttendanceStatus employeeAttendanceStatus;
    private LocalDate emaCurrentDate;
    private String emaMonth;
    private Employee employee;

    public EmployeeAttendanceResource(Long emaId, EmployeeAttendanceStatus employeeAttendanceStatus, LocalDate emaCurrentDate, String emaMonth, Employee employee) {
        this.emaId = emaId;
        this.employeeAttendanceStatus = employeeAttendanceStatus;
        this.emaCurrentDate = emaCurrentDate;
        this.emaMonth = emaMonth;
        this.employee = employee;
    }

    public EmployeeAttendanceResource() {
    }

    public Long getEmaId() {
        return emaId;
    }

    public void setEmaId(Long emaId) {
        this.emaId = emaId;
    }

    public EmployeeAttendanceStatus getEmployeeAttendanceStatus() {
        return employeeAttendanceStatus;
    }

    public void setEmployeeAttendanceStatus(EmployeeAttendanceStatus employeeAttendanceStatus) {
        this.employeeAttendanceStatus = employeeAttendanceStatus;
    }

    public LocalDate getEmaCurrentDate() {
        return emaCurrentDate;
    }

    public void setEmaCurrentDate(LocalDate emaCurrentDate) {
        this.emaCurrentDate = emaCurrentDate;
    }

    public String getEmaMonth() {
        return emaMonth;
    }

    public void setEmaMonth(String emaMonth) {
        this.emaMonth = emaMonth;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
}
