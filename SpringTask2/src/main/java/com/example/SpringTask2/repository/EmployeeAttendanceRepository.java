package com.example.SpringTask2.repository;

import com.example.SpringTask2.entity.Employee;
import com.example.SpringTask2.entity.EmployeeAttendance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public interface EmployeeAttendanceRepository extends JpaRepository<EmployeeAttendance,Long> {
    List<EmployeeAttendance> findByEmployeeEmpEmployeeId(Long empEmployeeId);

    // Query to retrieve distinct employee IDs from EmployeeAttendance
    @Query("SELECT DISTINCT ea.employee.empEmployeeId FROM EmployeeAttendance ea")
    List<Long> findAllEmployeeIds();

   // List<EmployeeAttendance> findByEmployeeEmpEmployeeName(Long empEmployeeName);


}
