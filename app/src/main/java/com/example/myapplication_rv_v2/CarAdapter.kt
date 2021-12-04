package com.example.myapplication_rv_v2

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

//Адаптер всегда принимает список
//Адаптер эо абстрактный класс
class CarAdapter(private val carList: List<Car>):RecyclerView.Adapter<CarVH>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CarVH {

             // вызываем верстку
        val itemView =  LayoutInflater.from(parent.context)
            .inflate(R.layout.car_list_item,parent,false)
        return CarVH(itemView)
    }

    //Вызывается каждый раз при отрисовке нового элемента RecyclerView
    override fun onBindViewHolder(holder: CarVH, position: Int) {
        val car = carList[position]
        holder.bind(car)
    }

    override fun getItemCount(): Int {
        return carList.size

    }
}