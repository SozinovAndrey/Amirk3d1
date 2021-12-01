package com.example.amirk3d_apk

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView





class MainActivity : AppCompatActivity() {

    lateinit var textView : TextView
    lateinit var textbutton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (savedInstanceState != null) {    }



        textView = findViewById(R.id.textView)
        textbutton= findViewById(R.id.textButton)
        textbutton.setOnClickListener{

        }
    }



}
