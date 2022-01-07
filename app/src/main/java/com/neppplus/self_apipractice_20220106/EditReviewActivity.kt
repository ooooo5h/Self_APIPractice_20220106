package com.neppplus.self_apipractice_20220106

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.neppplus.self_apipractice_20220106.models.BasicResponse
import com.neppplus.self_apipractice_20220106.models.ProductData
import kotlinx.android.synthetic.main.activity_edit_review.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class EditReviewActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_review)

        val product = intent.getSerializableExtra("product") as ProductData

        btnSubmitReview.setOnClickListener {

            val inputTitle = edtTitle.text.toString()
            val inputContent = edtContent.text.toString()
            val inputScore = ratingBar.rating

            apiList.postRequestSubmitReview(
                product.id, inputTitle, inputContent, inputScore,"").enqueue(object : Callback<BasicResponse>{
                override fun onResponse(
                    call: Call<BasicResponse>,
                    response: Response<BasicResponse>
                ) {

                    if (response.isSuccessful) {

                        Toast.makeText(mContext, "리뷰 등록 성공", Toast.LENGTH_SHORT).show()
                        finish()
                    }


                }

                override fun onFailure(call: Call<BasicResponse>, t: Throwable) {

                }


            })

        }
    }
}