package com.example.SpringTask2.resource;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;

public class EmployeePaySlipResource {

    @Id

    private Long epsPayslipId;

    private LocalDate epsCreatedDate;

    private long epsDaysPresent;

    private double epsDailySalary;

    private double epsBasicSalary;

    public EmployeePaySlipResource(Long epsPayslipId, LocalDate epsCreatedDate, long epsDaysPresent, double epsDailySalary, double epsBasicSalary) {
        this.epsPayslipId = epsPayslipId;
        this.epsCreatedDate = epsCreatedDate;
        this.epsDaysPresent = epsDaysPresent;
        this.epsDailySalary = epsDailySalary;
        this.epsBasicSalary = epsBasicSalary;
    }

    public EmployeePaySlipResource() {
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
