package com.example.SpringTask2.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;

@Entity
@Table(name="EMPLOYEE_PAYSLIP")

public class EmployeePaySlip {
    @Id
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
