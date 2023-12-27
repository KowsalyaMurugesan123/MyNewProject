package com.example.SpringTask2.repository;

import com.example.SpringTask2.entity.EmployeeAttendance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public interface EmployeeAttendanceRepository extends JpaRepository<EmployeeAttendance,Long> {
    List<EmployeeAttendance> findByEmployeeEmpEmployeeId(Long empEmployeeId);
   // List<EmployeeAttendance> findByEmployeeEmpEmployeeName(Long empEmployeeName);


}
