package com.neppplus.self_apipractice_20220106.models

class DataResponse(
    val user : UserData,
    val token : String,
    val reviews : List<ReviewData>
) {
}