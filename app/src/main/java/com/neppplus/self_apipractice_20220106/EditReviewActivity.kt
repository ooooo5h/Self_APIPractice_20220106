package com.neppplus.self_apipractice_20220106

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.neppplus.self_apipractice_20220106.models.ProductData
import kotlinx.android.synthetic.main.activity_edit_review.*

class EditReviewActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_review)

        val product = intent.getSerializableExtra("product") as ProductData

        btnSubmitReview.setOnClickListener {

            val inputTitle = edtTitle.text.toString()
            val inputContent = edtContent.text.toString()
            val inputScore = ratingBar.rating

        }
    }
}