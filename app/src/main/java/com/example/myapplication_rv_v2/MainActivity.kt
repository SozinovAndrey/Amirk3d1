package com.example.myapplication_rv_v2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    lateinit var carRV: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val carList : List<Car> = listOf(
            Car("Red",R.drawable.red),
            Car("Blue",R.drawable.blue),
            Car("Magenta",R.drawable.magenta)
        )

        carRV = findViewById(R.id.CarReciclerView)
        carRV.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL,false)
        carRV.adapter =CarAdapter(carList)
    }
}