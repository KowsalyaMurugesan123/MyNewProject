package com.example.SpringTask2.entity;

import javax.persistence.*;
import java.time.LocalDate;

//mark class as an Entity
@Entity

//defining class name as Table name
@Table(name = "EMPLOYEE_PAYSLIP")

public class EmployeePaySlip {

    //Defining epsPayslipId id as primary key
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "EPS_PAYSLIP_ID")
    private Long epsPayslipId;

    @Column(name = "EPS_CREATED_DATE")
    private LocalDate epsCreatedDate;

    @Column(name = "EPS_DAYS_PRESENT")
    private long epsDaysPresent;

    @Column(name = "EPS_DAILY_SALARY")
    private double epsDailySalary;

    @Column(name = "EPS_BASIC_SALARY")
    private double epsBasicSalary;

//    @OneToOne
//    @JoinColumn(name = "employee_id")
//    private Employee employee;

    public EmployeePaySlip(Long epsPayslipId, LocalDate epsCreatedDate, long epsDaysPresent, double epsDailySalary, double epsBasicSalary) {
        this.epsPayslipId = epsPayslipId;
        this.epsCreatedDate = epsCreatedDate;
        this.epsDaysPresent = epsDaysPresent;
        this.epsDailySalary = epsDailySalary;
        this.epsBasicSalary = epsBasicSalary;

    }

    public EmployeePaySlip() {
    }

    public Long getEpsPayslipId() {
        return epsPayslipId;
    }

    public void setEpsPayslipId(Long epsPayslipId) {
        this.epsPayslipId = epsPayslipId;
    }

    public LocalDate getEpsCreatedDate() {
        return epsCreatedDate;
    }

    public void setEpsCreatedDate(LocalDate epsCreatedDate) {
        this.epsCreatedDate = epsCreatedDate;
    }

    public long getEpsDaysPresent() {
        return epsDaysPresent;
    }

    public void setEpsDaysPresent(long epsDaysPresent) {
        this.epsDaysPresent = epsDaysPresent;
    }

    public double getEpsDailySalary() {
        return epsDailySalary;
    }

    public void setEpsDailySalary(double epsDailySalary) {
        this.epsDailySalary = epsDailySalary;
    }

    public double getEpsBasicSalary() {
        return epsBasicSalary;
    }

    public void setEpsBasicSalary(double epsBasicSalary) {
        this.epsBasicSalary = epsBasicSalary;
    }


}
