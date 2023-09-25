package shared

object ApiConstants {
    const val BASE_URL = "/employee"

    // Employee endpoints
    const val GET_ALL_EMPLOYEES = "$BASE_URL"
    const val GET_EMPLOYEE_BY_ID = "$BASE_URL/{id}"
    const val CREATE_EMPLOYEE = "$BASE_URL"
    const val UPDATE_EMPLOYEE = "$BASE_URL/{id}"
    const val DELETE_EMPLOYEE = "$BASE_URL/{id}"
    const val FETCH_DATA_OF_OTHER_SERVICE = "/fetch-data"


}
