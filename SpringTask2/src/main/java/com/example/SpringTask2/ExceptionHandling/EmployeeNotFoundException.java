package com.example.SpringTask2.ExceptionHandling;


public class EmployeeNotFoundException extends RuntimeException {


    // Handle the EmployeeNotFound exception
    public EmployeeNotFoundException(String message) {
        super(message);
    }
}
