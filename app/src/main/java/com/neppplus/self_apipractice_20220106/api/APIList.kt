package com.neppplus.self_apipractice_20220106.api

import com.neppplus.self_apipractice_20220106.models.BasicResponse
import retrofit2.Call
import retrofit2.http.*

interface APIList {

//    * 로그인
    @FormUrlEncoded
    @POST("/user")
    fun postRequestLogin(
        @Field("email") email : String,
        @Field("password") pw : String,
) : Call<BasicResponse>


//    * 회원가입
    @FormUrlEncoded
    @PUT("/user")
    fun putRequestSignUp(
        @Field("email") email : String,
        @Field("password") pw : String,
        @Field("nick_name") nick : String,
        @Field("phone") phone : String,
) : Call<BasicResponse>


//    * 중복검사
    @GET("/user/check")
    fun getRequestDuplCheck(
        @Query("type") type : String,
        @Query("value") value : String,
) : Call<BasicResponse>

}