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
//    @OneToMany(mappedBy = "employee")
//    private List<EmployeeAttendance> employeeAttendance;
//    @OneToMany(mappedBy = "employee")
//    private List<EmployeePaySlip> employeePaySlips;


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


}
