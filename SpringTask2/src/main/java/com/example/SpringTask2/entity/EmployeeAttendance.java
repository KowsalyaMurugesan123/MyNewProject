package com.example.SpringTask2.entity;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "EMPLOYEE_ATTENDANCE")
public class EmployeeAttendance {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "EMA_ID")
    private Long emaId;
    @Column(name = "EMA_ATTENDANCE_STATUS")
    private String emaAttendanceStatus;
    @Column(name = "EMA_CURRENT_DATE")
    private LocalDate emaCurrentDate;
    @Column(name = "EMA_MONTH")
    private String emaMonth;
    @ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    @JoinColumn(name = "EMP_EMPLOYEE_ID")
    private Employee employee;

    public EmployeeAttendance(Long emaId, String emaAttendanceStatus, LocalDate emaCurrentDate, String emaMonth, Employee employee) {
        this.emaId = emaId;
        this.emaAttendanceStatus = emaAttendanceStatus;
        this.emaCurrentDate = emaCurrentDate;
        this.emaMonth = emaMonth;
        this.employee = employee;
    }

    public EmployeeAttendance() {
    }

    public EmployeeAttendance(Long emaId) {
        this.emaId = emaId;
    }

    public Long getEmaId() {
        return emaId;
    }

    public void setEmaId(Long emaId) {
        this.emaId = emaId;
    }

    public String getEmaAttendanceStatus() {
        return emaAttendanceStatus;
    }

    public void setEmaAttendanceStatus(String emaAttendanceStatus) {
        this.emaAttendanceStatus = emaAttendanceStatus;
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
