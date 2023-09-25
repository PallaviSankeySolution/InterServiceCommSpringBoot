package com.example.SpringWithMango.Modal

import org.bson.types.ObjectId
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.DBRef
import org.springframework.data.mongodb.core.mapping.Document

@Document(collection = "employees")
class employee (
    @Id
    var id: String? = null,
    var name:String,
    var age:Long,
    var username:String,
    var password:String,

){}