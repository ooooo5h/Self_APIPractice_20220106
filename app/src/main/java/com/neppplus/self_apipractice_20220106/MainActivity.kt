package com.neppplus.self_apipractice_20220106

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.telecom.Call
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.neppplus.self_apipractice_20220106.adapters.ReviewAdapter
import com.neppplus.self_apipractice_20220106.models.BasicResponse
import com.neppplus.self_apipractice_20220106.models.ReviewData
import kotlinx.android.synthetic.main.activity_main.*
import retrofit2.Response
import javax.security.auth.callback.Callback

class MainActivity : BaseActivity() {

    val mReviewList = ArrayList<ReviewData>()

    lateinit var mReviewAdapter : ReviewAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnMyProfile.setOnClickListener {

            val myIntent = Intent(mContext,MyProfileActivity::class.java)
            startActivity(myIntent)
        }


        apiList.getRequestAllReview().enqueue(object : retrofit2.Callback<BasicResponse>{
            override fun onResponse(
                call: retrofit2.Call<BasicResponse>,
                response: Response<BasicResponse>
            ) {

                if (response.isSuccessful) {

                    val br = response.body()!!
                    mReviewList.addAll(br.data.reviews)

                    mReviewAdapter.notifyDataSetChanged()
                }

            }

            override fun onFailure(call: retrofit2.Call<BasicResponse>, t: Throwable) {

            }


        })

        mReviewAdapter = ReviewAdapter(mContext, mReviewList)
        reviewRecyclerView.adapter = mReviewAdapter
        reviewRecyclerView.layoutManager = StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL)

    }
}