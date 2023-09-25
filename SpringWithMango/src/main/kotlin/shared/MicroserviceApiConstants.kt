package shared

object MicroserviceApiConstants {
    const val BASE_URL = "/employee"

    // Employee endpoints
    const val GET_ALL_EMPLOYEES = "$BASE_URL/show"
    const val GET_EMPLOYEE_BY_ID = "$BASE_URL/{id}"
    const val CREATE_EMPLOYEE = "$BASE_URL/add"
    const val UPDATE_EMPLOYEE = "$BASE_URL/{id}"
    const val DELETE_EMPLOYEE = "$BASE_URL/502"
}