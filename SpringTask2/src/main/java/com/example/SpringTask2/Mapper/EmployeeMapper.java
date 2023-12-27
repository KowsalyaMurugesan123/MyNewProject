package com.example.SpringTask2.Mapper;

import com.example.SpringTask2.entity.Employee;
import com.example.SpringTask2.resource.EmployeeResource;

public class EmployeeMapper {
    //mapping a data employee to employeedto
    public static EmployeeResource mapToEmployeeDto(Employee employee){
        EmployeeResource employeeResource= new EmployeeResource();
        employeeResource.setEmpEmployeeId(employee.getEmpEmployeeId());
        employeeResource.setEmpEmployeeName(employee.getEmpEmployeeName());

        return employeeResource;

    }

    //mapping a data employeeDto to employee
        public static EmployeeResource mapToEmployee(EmployeeResource employeeDto) {
        Employee employee= new Employee();
        employee.setEmpEmployeeId(employeeDto.getEmpEmployeeId());
        employee.setEmpEmployeeName(employeeDto.getEmpEmployeeName());
        return employeeDto;
        }
}
