package com.neppplus.self_apipractice_20220106

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.neppplus.self_apipractice_20220106.api.APIList
import com.neppplus.self_apipractice_20220106.api.ServerAPI
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnLogin.setOnClickListener {

            val inputEmail = edtEmail.text.toString()
            val inputPw = edtPassword.text.toString()

            val retrofit = ServerAPI.getRetrofit()
            val apiList = retrofit.create(APIList::class.java)

            apiList.postRequestLogin(inputEmail, inputPw)

        }
    }
}