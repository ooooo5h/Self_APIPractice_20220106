package com.neppplus.self_apipractice_20220106

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.telecom.Call
import com.neppplus.self_apipractice_20220106.models.BasicResponse
import com.neppplus.self_apipractice_20220106.models.ReviewData
import retrofit2.Response
import javax.security.auth.callback.Callback

class MainActivity : BaseActivity() {

    val mReviewList = ArrayList<ReviewData>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        apiList.getRequestAllReview().enqueue(object : retrofit2.Callback<BasicResponse>{
            override fun onResponse(
                call: retrofit2.Call<BasicResponse>,
                response: Response<BasicResponse>
            ) {

                if (response.isSuccessful) {

                    val br = response.body()!!
                    mReviewList.addAll(br.data.reviews)
                }

            }

            override fun onFailure(call: retrofit2.Call<BasicResponse>, t: Throwable) {

            }


        })
    }
}