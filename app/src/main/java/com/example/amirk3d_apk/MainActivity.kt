package com.example.amirk3d_apk

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

 lateinit var userRV: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

         userRV = findViewById(R.id.user_RecyclerView)
        userRV.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false )
        }



    override fun onStart() {
        super.onStart()
        print_one_srting("onStart")
    }

    override fun onResume() {
        super.onResume()
        print_one_srting("onResume")
    }

    override fun onPause() {
        super.onPause()
        print_one_srting("onPause")
    }

    override fun onStop() {
        super.onStop()
        print_one_srting("onStop")
    }

    override fun onRestart() {
        super.onRestart()
        print_one_srting("onRestart")
    }

    override fun onDestroy() {
        super.onDestroy()
        print_one_srting("onDestroy")
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)

    }

    fun print_one_srting(stroka:String){
        Log.d("TAG_СРС5", stroka)
    }
}

//RecyclerView <- Adapter <- ViewHolder <- layout
//1. LayoutManager
//2. Adapter
//