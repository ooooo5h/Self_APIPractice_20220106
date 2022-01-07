package com.neppplus.self_apipractice_20220106.api

import com.neppplus.self_apipractice_20220106.models.BasicResponse
import retrofit2.Call
import retrofit2.Callback
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


//    * 모든 리뷰 가져오기기
    @GET("/review")
    fun getRequestAllReview() : Call<BasicResponse>

//    * 내 정보 가져오기
    @GET("/user")
    fun getRequestMyInfo() : Call<BasicResponse>

//    * 모든 상품 조회
    @GET("/product")
    fun getRequestAllProduct() : Call<BasicResponse>

//    * 리뷰 등록하기
    @FormUrlEncoded
    @POST("/review")
    fun postRequestSubmitReview(
        @Field("product_id") productId : Int,
        @Field("title") title : String,
        @Field("content") content : String,
        @Field("score") score : Float,
        @Field("tag_list") tagStr : String,
    ) : Call<BasicResponse>

}