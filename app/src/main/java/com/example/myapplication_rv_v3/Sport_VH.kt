package com.example.myapplication_rv_v3

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class Sport_VH(itemView: View) : RecyclerView.ViewHolder(itemView) {
    private val brand: TextView = itemView.findViewById(R.id.brand_text_view)
    private val speed: TextView = itemView.findViewById(R.id.speed_text_view)
    private val drift: TextView = itemView.findViewById(R.id.driftLavel_text_view)
    private val color: TextView = itemView.findViewById(R.id.color_text_view)

    fun bind(SportCar: Car.SportCar){
        brand.text = "Brand - ${SportCar.brand}"
            speed.text = "Speed - ${SportCar.speed}km/h"
            drift.text = "Drift lvl - ${SportCar.driftLevel}"
            color.text = "Color - ${SportCar.color}"
    }
}