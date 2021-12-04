package com.example.myapplication_rv

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

lateinit var userRV:RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val userList: List<User> = listOf(

            User("Andrey",39),
            User("Yulia",34),
            User("Andrey",39),
            User("Yulia",34),
            User("Andrey",39),
            User("Yulia",34),
            User("Andrey",39),
            User("Yulia",34)


        )

        userRV = findViewById(R.id.UserReciclerView)
        userRV.layoutManager = LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)
        userRV.adapter = UserAdapter(userList)
        userRV.addItemDecoration(DividerItemDecoration(this,DividerItemDecoration.VERTICAL))

    }


}

//ReciclerView <-- adapter <--ViewHolder <--layout

//ReciclerView= это в MainActivity
//adapter
//ViewHolder
//layout  -- Верстка user_list_item