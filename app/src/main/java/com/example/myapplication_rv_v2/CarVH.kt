package com.example.myapplication_rv_v2

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CarVH(itemView: View) :RecyclerView.ViewHolder(itemView) {

    private val carImageView: ImageView = itemView.findViewById(R.id.car_image_view)
    private val brandTextView: TextView = itemView.findViewById(R.id.brand_text_view)

    fun bind(car: Car){
        carImageView.setImageResource(car.image)
        brandTextView.text = car.brand
    }
}