package com.example.myapplication_rv_v3


import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class Sity_VH(itemView: View) : RecyclerView.ViewHolder(itemView) {
    private val brand: TextView = itemView.findViewById(R.id.brand_text_view)
    private val comfort: TextView = itemView.findViewById(R.id.comfortLevel_text_view)
    private val price: TextView = itemView.findViewById(R.id.price_text_view)


    fun bind (sityCar :Car.CityCar){
        brand.text ="Brand - ${sityCar.brand}"
            comfort.text ="Comfort - ${sityCar.comfortLevel}"
            price.text ="Price - ${sityCar.price}$"
    }
}