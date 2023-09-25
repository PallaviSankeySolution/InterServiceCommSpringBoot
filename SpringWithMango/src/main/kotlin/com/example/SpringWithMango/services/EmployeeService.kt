package com.example.SpringWithMango.services

import com.example.SpringWithMango.DAO.EmployeeRepository
import com.example.SpringWithMango.Modal.employee
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.stereotype.Service

@Service
class EmployeeService (private  val employeeRepository: EmployeeRepository){

    fun getAllEmployees():List<employee> {

        return employeeRepository.findAll()
    }

    fun saveEmployee(employee: employee): employee {
        return employeeRepository.save(employee)
    }
}