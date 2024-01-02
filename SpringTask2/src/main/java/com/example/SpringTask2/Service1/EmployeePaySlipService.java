package com.example.SpringTask2.Service1;

import com.example.SpringTask2.entity.Employee;
import com.example.SpringTask2.entity.EmployeeAttendance;
import com.example.SpringTask2.entity.EmployeePaySlip;

import java.util.concurrent.CompletableFuture;

public interface EmployeePaySlipService {

    /**
     *
     * @param empEmployeeId  :The unique identifier of the employee for whom the payslip is to be generated
     * @return               :A CompletableFuture that will eventually contain a String result indicating the status or result of the payslip generation process
     */
    public CompletableFuture<EmployeePaySlip> generatePayslip(Long empEmployeeId);


    //public CompletableFuture<String> generatePayslip(Long employeeId);

    // public String generatePayslip(String employeeName);

    public void  generatePayslipsForEmployees();
}
