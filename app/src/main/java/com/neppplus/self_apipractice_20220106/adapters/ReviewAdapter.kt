package com.neppplus.self_apipractice_20220106.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.neppplus.self_apipractice_20220106.R
import com.neppplus.self_apipractice_20220106.models.ReviewData

class ReviewAdapter(
    val mContext : Context,
    val mList : List<ReviewData>,
) : RecyclerView.Adapter<ReviewAdapter.MyViewHolder>() {

    inner class MyViewHolder(val row: View) : RecyclerView.ViewHolder(row) {

        fun bind(data: ReviewData) {


        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {

        val row = LayoutInflater.from(mContext).inflate(R.layout.review_item_list, parent, false)
        return MyViewHolder(row)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {

        holder.bind(mList[position])

    }

    override fun getItemCount(): Int {
        return mList.size
    }
}