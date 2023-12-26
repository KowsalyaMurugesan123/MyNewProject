package com.example.SpringTask2.repository;

import com.example.SpringTask2.entity.EmployeePaySlip;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface EmployeePaySlipRepository extends JpaRepository<EmployeePaySlip, Long> {
}
