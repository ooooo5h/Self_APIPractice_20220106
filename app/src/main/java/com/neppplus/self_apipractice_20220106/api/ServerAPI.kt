package com.neppplus.self_apipractice_20220106.api

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class ServerAPI {

    companion object {

        private val BASE_URL = "https://api.gudoc.in"
        private var retrofit : Retrofit? = null

        fun getRetrofit() : Retrofit {

            if (retrofit == null) {
                retrofit = Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build()
            }

            return retrofit!!


        }
    }
}