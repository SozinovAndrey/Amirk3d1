package com.example.myapplication_rv_v3

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class CarAdapter(val carList: List<Car>): RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {

        //1 параметром inflate передаем  viewType т.к. не знаем какую верстку использовать
        // если  верстка 1 тогада указывали сразу её (R.layout.user_list_item)
        val itemView =LayoutInflater.from(parent.context).inflate(viewType,parent,false)

            // в зависимости от верски возвращаем нужный вьюХолдер
        return when(viewType){
            R.layout.sity_car_item_view -> Sity_VH(itemView)
            R.layout.sport_car_item_view-> Sport_VH(itemView)
            else -> throw Exception() // если  неет то ошибка
        }
    }

    // взависимости от Вьюхолдера возвращаем
    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val  car = carList[position]
        when(holder) {
            is Sport_VH -> holder.bind(car as Car.SportCar)
            is Sity_VH -> holder.bind(car as Car.CityCar)
        }
    }

    override fun getItemCount(): Int {
        return carList.size
    }


    //функция фозвращает вертску в зависимости от типа данных
    override fun getItemViewType(position: Int): Int {
        return when(carList[position]){
            is Car.CityCar ->R.layout.sity_car_item_view
            is Car.SportCar ->R.layout.sport_car_item_view

        }
    }
}