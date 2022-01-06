package com.neppplus.self_apipractice_20220106

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.neppplus.self_apipractice_20220106.api.APIList
import com.neppplus.self_apipractice_20220106.api.ServerAPI
import com.neppplus.self_apipractice_20220106.models.BasicResponse
import kotlinx.android.synthetic.main.activity_login.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class LoginActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        btnLogin.setOnClickListener {

            val inputEmail = edtEmail.text.toString()
            val inputPw = edtPassword.text.toString()

            apiList.postRequestLogin(inputEmail, inputPw).enqueue(object : Callback<BasicResponse>{
                override fun onResponse(
                    call: Call<BasicResponse>,
                    response: Response<BasicResponse>
                ) {
                    if (response.isSuccessful) {
//                        Toast.makeText(this@MainActivity, "로그인 성공", Toast.LENGTH_SHORT).show()
//                        ~~님 환영합니다로 바꿔보자
                        
                        val br = response.body()!!
                        val loginUserNickname = br.data.user.nick_name
                        Toast.makeText(this@LoginActivity, "${loginUserNickname}님 환영합니다.", Toast.LENGTH_SHORT).show()
                        
//                        val myIntent = Intent(this@LoginActivity) 로그인하고 메인화면으로 이동시킬건데 this가 2개 떠서 귀찮아

                    }
                    else {
                        Toast.makeText(this@LoginActivity, "로그인 실패", Toast.LENGTH_SHORT).show()
                    }
                    
                }

                override fun onFailure(call: Call<BasicResponse>, t: Throwable) {
                    
                }


            })

        }

        btnSignUp.setOnClickListener {

            val myIntent = Intent(this, SignUpActivity::class.java)
            startActivity(myIntent)
        }
        
        
    }
}