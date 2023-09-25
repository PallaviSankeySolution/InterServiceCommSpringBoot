package com.example.SpringWithMango.DAO

import com.example.SpringWithMango.Modal.employee
import org.bson.types.ObjectId
import org.springframework.data.mongodb.repository.MongoRepository

interface EmployeeRepository : MongoRepository<employee, String> {
}