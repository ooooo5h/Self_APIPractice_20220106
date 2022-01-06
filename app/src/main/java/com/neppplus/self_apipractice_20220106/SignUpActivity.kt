package com.neppplus.self_apipractice_20220106

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.neppplus.self_apipractice_20220106.api.APIList
import com.neppplus.self_apipractice_20220106.api.ServerAPI
import kotlinx.android.synthetic.main.activity_sign_up.*

class SignUpActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        btnSignUp.setOnClickListener {

            val inputEmail = edtEmail.text.toString()
            val inputPw = edtPassword.text.toString()
            val inputNickname = edtNickname.text.toString()
            val inputPhoneNum = edtPhone.text.toString()

            val retrofit = ServerAPI.getRetrofit()
            val apiList = retrofit.create(APIList::class.java)

            apiList.

        }
    }
}