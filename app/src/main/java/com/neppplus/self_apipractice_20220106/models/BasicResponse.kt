package com.neppplus.self_apipractice_20220106.models

class BasicResponse(
    val code : Int,
    val message : String,
    val data : DataResponse,
) {
}