package com.neppplus.self_apipractice_20220106

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MyProfileActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_my_profile)

        apiList.getRequestMyInfo(//토큰을 가져와야하는군)
    }
}