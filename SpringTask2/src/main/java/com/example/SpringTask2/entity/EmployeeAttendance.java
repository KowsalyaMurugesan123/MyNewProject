package com.example.SpringTask2.entity;

import com.example.SpringTask2.dictionary.EmployeeAttendanceStatus;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.time.LocalDate;
//mark class as an Entity

@Entity
//defining class name as Table name
@Table(name = "EMPLOYEE_ATTENDANCE")
public class EmployeeAttendance {

    //Defining emaId id as primary key
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "EMA_ID")
    private Long emaId;

    @Column(name = "EMA_ATTENDANCE_STATUS")
    @Enumerated(EnumType.ORDINAL)
    private EmployeeAttendanceStatus employeeAttendanceStatus;

    @Column(name = "EMA_CURRENT_DATE")
    private LocalDate emaCurrentDate;

    @Column(name = "EMA_MONTH")
    private String emaMonth;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "EMP_ID")
    @JsonIgnore
    private Employee employee;

    public EmployeeAttendance(Long emaId, EmployeeAttendanceStatus employeeAttendanceStatus, LocalDate emaCurrentDate, String emaMonth, Employee employee) {
        this.emaId = emaId;
        this.employeeAttendanceStatus = employeeAttendanceStatus;
        this.emaCurrentDate = emaCurrentDate;
        this.emaMonth = emaMonth;
        this.employee = employee;
    }

    public EmployeeAttendance() {
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
