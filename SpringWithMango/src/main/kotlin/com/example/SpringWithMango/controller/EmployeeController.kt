package com.example.SpringWithMango.controller

import com.example.SpringWithMango.Modal.employee
import com.example.SpringWithMango.services.EmployeeService
import com.example.SpringWithMango.webClient.WebClientService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpMethod
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import reactor.core.publisher.Mono
import shared.ApiConstants
import shared.MicroserviceApiConstants


@RestController
@RequestMapping(ApiConstants.BASE_URL)
class EmployeeController(private val employeeService:EmployeeService,
                        private val webclentService:WebClientService) {

   @GetMapping
   fun AllEmployeeData():ResponseEntity<Any>{
      val data=  employeeService.getAllEmployees()
       return ResponseEntity.ok().body(data)
   }

    @PostMapping
    fun createEmployee(@RequestBody employeeData: employee):ResponseEntity<Any>{
        println("postmapping ****")
        //call post api of other microservive

        return ResponseEntity.ok().body("inserted ....."+
            webclentService.fetchDataFromProjectB(MicroserviceApiConstants.CREATE_EMPLOYEE,employeeData, HttpMethod.POST)
        )


    }
    @GetMapping(ApiConstants.FETCH_DATA_OF_OTHER_SERVICE)
    fun fetchDataFromProjectB(): Mono<String> {
        return webclentService.fetchDataFromProjectB(MicroserviceApiConstants.GET_ALL_EMPLOYEES,null, HttpMethod.GET)
    }

    @DeleteMapping
    fun delete(): Mono<String> {
        return webclentService.fetchDataFromProjectB(MicroserviceApiConstants.DELETE_EMPLOYEE,null, HttpMethod.DELETE)
    }

}