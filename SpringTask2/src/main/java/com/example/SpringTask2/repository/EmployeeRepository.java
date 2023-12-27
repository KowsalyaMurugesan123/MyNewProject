package com.example.SpringTask2.repository;

import com.example.SpringTask2.entity.Employee;
import com.example.SpringTask2.entity.EmployeeAttendance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Set;

@Repository

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
