package com.example.SpringTask2.entity;

import javax.persistence.*;

@Entity
@Table(name = "EMPLOYEE")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "EMP_EMPLOYEE_ID")
    private Long empEmployeeId;
    @Column(name = "EMP_EMPLOYEE_NAME")
    private String empEmployeeName;

    public Employee(Long empEmployeeId, String empEmployeeName) {
        this.empEmployeeId = empEmployeeId;
        this.empEmployeeName = empEmployeeName;
    }

    public Employee() {
    }

    public Employee(Long empEmployeeId) {
        this.empEmployeeId = empEmployeeId;
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
