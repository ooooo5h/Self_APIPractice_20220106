package com.neppplus.self_apipractice_20220106

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnLogin.setOnClickListener {

            val inputEmail = edtEmail.text.toString()
            val inputPw = edtPassword.text.toString()

        }
    }
}