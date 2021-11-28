package com.example.amirk3d_apk


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import android.util.Log
import android.widget.Button
import android.widget.TextView



class MainActivity : AppCompatActivity() {

    lateinit var textView : TextView
    lateinit var textbutton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        if (savedInstanceState != null) {
        }

        textView = findViewById(R.id.textView)
        textbutton= findViewById(R.id.textButton)
        textbutton.setOnClickListener{

        }
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

    }
}
