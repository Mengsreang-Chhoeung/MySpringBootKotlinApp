package com.cubetiqs.mykotlinapp.repository

import com.cubetiqs.mykotlinapp.model.entity.Employee
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface EmployeeRepository : JpaRepository<Employee, Long>