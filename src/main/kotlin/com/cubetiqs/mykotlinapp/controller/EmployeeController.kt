package com.cubetiqs.mykotlinapp.controller

import com.cubetiqs.mykotlinapp.model.entity.Employee
import com.cubetiqs.mykotlinapp.service.EmployeeService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("api/v1/employees")
class EmployeeController (private val employeeService: EmployeeService) {

    @GetMapping
    fun getAllEmployees(): List<Employee> = employeeService.getAllEmployees()

    @GetMapping("/{id}")
    fun getEmployeeById(@PathVariable("id") employeeId: Long): Employee = employeeService.getEmployeeById(employeeId)

    @PostMapping("/create-employee")
    fun createEmployee(@RequestBody payload: Employee): Employee = employeeService.createEmployee(payload)

    @PutMapping("edit-employee/{id}")
    fun updateEmployeeById(@PathVariable("id") employeeId: Long, @RequestBody payload: Employee): Employee = employeeService.updateEmployeeById(employeeId, payload)

    @DeleteMapping("delete-employee/{id}")
    fun deleteEmployeeById(@PathVariable("id") employeeId: Long): Unit = employeeService.deleteEmployeeById(employeeId)

}