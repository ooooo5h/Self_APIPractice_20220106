package com.neppplus.self_apipractice_20220106.api

import retrofit2.Retrofit

class ServerAPI {

    companion object {

        private val BASE_URL = "https://api.gudoc.in"
        private var retrofit : Retrofit? = null
    }
}