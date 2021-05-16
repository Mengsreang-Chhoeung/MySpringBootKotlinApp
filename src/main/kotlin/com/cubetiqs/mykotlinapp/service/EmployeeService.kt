package com.cubetiqs.mykotlinapp.service

import com.cubetiqs.mykotlinapp.model.entity.Employee

interface EmployeeService {

    fun getAllEmployees(): List<Employee>
    fun getEmployeeById(employeeId: Long): Employee
    fun createEmployee(employee: Employee): Employee
    fun updateEmployeeById(employeeId: Long, employee: Employee): Employee
    fun deleteEmployeeById(employeeId: Long)

}