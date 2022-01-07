package com.neppplus.self_apipractice_20220106.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.neppplus.self_apipractice_20220106.R
import com.neppplus.self_apipractice_20220106.models.ProductData
import com.neppplus.self_apipractice_20220106.models.ReviewData
import java.text.NumberFormat

class ProductAdapter(
    val mContext : Context,
    val mList : List<ProductData>,
) : RecyclerView.Adapter<ProductAdapter.MyViewHolder>() {

    inner class MyViewHolder(val row: View) : RecyclerView.ViewHolder(row) {

        val imgProduct = row.findViewById<ImageView>(R.id.imgProduct)
        val txtProductName = row.findViewById<TextView>(R.id.txtProductName)
        val txtProductPrice = row.findViewById<TextView>(R.id.txtProductPrice)
        val imgStoreLogo = row.findViewById<ImageView>(R.id.imgStoreLogo)
        val txtStoreName = row.findViewById<TextView>(R.id.txtStoreName)

        val btnWriteReview = row.findViewById<Button>(R.id.btnWriteReview)  // 어댑터에서는 버튼id같은게 자동으로 못불러옴


        fun bind(data: ProductData) {

            txtStoreName.text = data.store.name
            txtProductPrice.text = "${NumberFormat.getInstance().format(data.price)}원"
            txtProductName.text = data.name

            Glide.with(mContext).load(data.imageURL).into(imgProduct)
            Glide.with(mContext).load(data.store.logoURL).into(imgStoreLogo)

            btnWriteReview.setOnClickListener {

                Toast.makeText(mContext, "리뷰버튼눌림", Toast.LENGTH_SHORT).show()

            }


        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {

        val row = LayoutInflater.from(mContext).inflate(R.layout.product_list_item, parent, false)
        return MyViewHolder(row)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {

        holder.bind(mList[position])

    }

    override fun getItemCount(): Int {
        return mList.size
    }
}