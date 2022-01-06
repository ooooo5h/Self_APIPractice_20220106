package com.neppplus.self_apipractice_20220106

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.neppplus.self_apipractice_20220106.api.APIList
import com.neppplus.self_apipractice_20220106.api.ServerAPI
import retrofit2.Retrofit

abstract class BaseActivity : AppCompatActivity() {

    lateinit var retrofit : Retrofit
    lateinit var apiList : APIList

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        retrofit = ServerAPI.getRetrofit()
        apiList = retrofit.create(APIList::class.java)
    }
}