package com.example.myapplication_rv_v3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView



lateinit var carRV:RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val carList: List<Car> = listOf(

            Car.SportCar("Феррари",200,4,"Красная"),
            Car.SportCar("Ламба",240, 5,"Желтая"),
            Car.CityCar("БМВ",39,20000),
            Car.SportCar("Макларен",280, 5,"Черная"),
            Car.CityCar("Мерседес",39,22000),
            Car.SportCar("Бугатти",300,6,"Синяя"),
            Car.CityCar("Ауди",39,18500),
            Car.CityCar("Порше",40,25000)


        )


        carRV = findViewById(R.id.UserReciclerView)
        carRV.layoutManager = LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)
        carRV.adapter = CarAdapter(carList)
        carRV.addItemDecoration(DividerItemDecoration(this,DividerItemDecoration.VERTICAL))

    }
}

//https_//github.com/SozinovAndrey/Amirk3d1.git

//ReciclerView <-- adapter <--ViewHolder <--layout

//ReciclerView= это в MainActivity
//adapter
//ViewHolder
//layout  -- Верстка user_list_item