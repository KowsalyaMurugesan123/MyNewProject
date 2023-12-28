package com.example.SpringTask2.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

//mark class as an Entity
@Entity
//defining class name as Table name
@Table(name = "EMPLOYEE")
public class Employee {
    //Defining empEmployeeId id as primary key
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "EMP_EMPLOYEE_ID")
    private Long empEmployeeId;

    @Column(name = "EMP_EMPLOYEE_NAME")
    private String empEmployeeName;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true, mappedBy = "employee")
    private List<EmployeeAttendance> employeeAttendance;
//    @OneToMany(mappedBy = "employee")
//    private List<EmployeePaySlip> employeePaySlips;

    public Employee(Long empEmployeeId, String empEmployeeName, List<EmployeeAttendance> employeeAttendance) {
        this.empEmployeeId = empEmployeeId;
        this.empEmployeeName = empEmployeeName;
        this.employeeAttendance = employeeAttendance;
    }

    public Employee() {
    }

    public Long getEmpEmployeeId() {
        return empEmployeeId;
    }

    public void setEmpEmployeeId(Long empEmployeeId) {
        this.empEmployeeId = empEmployeeId;
    }

    public String getEmpEmployeeName() {
        return empEmployeeName;
    }

    public void setEmpEmployeeName(String empEmployeeName) {
        this.empEmployeeName = empEmployeeName;
    }

    public List<EmployeeAttendance> getEmployeeAttendance() {
        return employeeAttendance;
    }

    public void setEmployeeAttendance(List<EmployeeAttendance> employeeAttendance) {
        this.employeeAttendance = employeeAttendance;
    }
}
