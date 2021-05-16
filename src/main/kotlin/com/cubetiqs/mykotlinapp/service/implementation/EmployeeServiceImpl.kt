package com.cubetiqs.mykotlinapp.service.implementation

import com.cubetiqs.mykotlinapp.exception.ResourceNotFoundException
import com.cubetiqs.mykotlinapp.model.entity.Employee
import com.cubetiqs.mykotlinapp.repository.EmployeeRepository
import com.cubetiqs.mykotlinapp.service.EmployeeService
import org.springframework.stereotype.Service

@Service
class EmployeeServiceImpl(private val employeeRepository: EmployeeRepository) : EmployeeService {

    override fun getAllEmployees(): List<Employee> = employeeRepository.findAll()

    override fun getEmployeeById(employeeId: Long): Employee = employeeRepository.findById(employeeId)
        .orElseThrow{ResourceNotFoundException("Employee Not Found")}

    override fun createEmployee(employee: Employee): Employee = employeeRepository.save(employee)

    override fun updateEmployeeById(employeeId: Long, employee: Employee): Employee {
        return if(employeeRepository.existsById(employeeId)) {
            employeeRepository.save(
                Employee(
                    id = employeeId,
                    userName = employee.userName,
                    firstName = employee.firstName,
                    middleName = employee.middleName,
                    lastName = employee.lastName,
                    emailId = employee.emailId,
                    dayOfBirth = employee.dayOfBirth,
                )
            )
        } else throw ResourceNotFoundException("Employee Not Found")
    }

    override fun deleteEmployeeById(employeeId: Long) {
        return if(employeeRepository.existsById(employeeId)) {
            employeeRepository.deleteById(employeeId)
        }else throw ResourceNotFoundException("Employee Not Found")
    }

}