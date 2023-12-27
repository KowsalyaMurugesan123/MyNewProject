package com.example.SpringTask2.resource;

import javax.persistence.Id;

public class EmployeeResource {
    @Id

    private Long empEmployeeId;

    private String empEmployeeName;

    public EmployeeResource(Long empEmployeeId, String empEmployeeName) {
        this.empEmployeeId = empEmployeeId;
        this.empEmployeeName = empEmployeeName;
    }

    public EmployeeResource() {
    }

    public Long getEmpEmployeeId() {
        return empEmployeeId;
    }

    public void setEmpEmployeeId(Long empEmployeeId) {
        this.empEmployeeId = empEmployeeId;
    }

    public String getEmpEmployeeName() {
        return this.empEmployeeName;
    }

    public void setEmpEmployeeName(String empEmployeeName) {
        this.empEmployeeName = empEmployeeName;
    }
}
