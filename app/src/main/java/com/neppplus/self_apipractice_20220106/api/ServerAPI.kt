package com.neppplus.self_apipractice_20220106.api

import android.content.Context
import com.neppplus.self_apipractice_20220106.utils.ContextUtil
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class ServerAPI {

    companion object {

        private val BASE_URL = "https://api.gudoc.in"
        private var retrofit : Retrofit? = null

        fun getRetrofit(context: Context) : Retrofit {

            if (retrofit == null) {

                val interceptor = Interceptor{
                    with(it) {

                        val newRequest = request().newBuilder()
                            .addHeader("X-Http-Token", ContextUtil.getToken(context))
                            .build()

                        proceed(newRequest)
                    }
                }
//                클라이언트의 기능을 수정해서, 위에 적은 interceptor를 적용하는 통신체계
                val myClient = OkHttpClient.Builder().addInterceptor(interceptor).build()

                retrofit = Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .client(myClient)
                    .build()
            }

            return retrofit!!


        }
    }
}