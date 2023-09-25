package com.example.SpringWithMango.Modal

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document(collection = "department")
class department (
    @Id
    var Id :Long,
    var departmentName:String,
    var departmentCity: String
){

}