package com.example.SpringTask2.Service1;

import com.example.SpringTask2.entity.Employee;

import java.util.concurrent.CompletableFuture;

public interface EmployeeService {

    /**
     *
     * @param employee :An object of type  representing the details of the employee to be created
     * @return  :The newly created employee object with updated information, including the assigned unique identifier (ID).
     */
    public Employee createEmployee(Employee employee);


    /**
     *
     * @param employeeId :A  value representing the unique identifier of the employee for whom the payslip is to be generated
     */
    //   public void generatePayslip(Long employeeId);


    /**
     *
     * @param employeeId :The unique identifier of the employee.
     * @return           :A CompletableFuture that, when completed, contains the employee with the given ID,
     *  *         or null if no employee is found
     */
    public CompletableFuture<Employee> getEmployeeById(Long employeeId);
}
