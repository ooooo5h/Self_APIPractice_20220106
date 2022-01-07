package com.neppplus.self_apipractice_20220106.models

import java.io.Serializable

class ReviewData(
    val id : Int,
    val title : String,
    val content : String,
    val score : Double,
    val thumbnail_img : String,
    val user : UserData,
) : Serializable {
}