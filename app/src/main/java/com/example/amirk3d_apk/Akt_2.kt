package com.example.amirk3d_apk

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView


class Akt_2 : AppCompatActivity() {

    lateinit var htv: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_akt2)

        actionBar?.title = "Вторая активность"

        htv = findViewById(R.id.text_lozung)

        val  hv:String? = intent.extras?.getString(TAG_СРС6)
        htv.text = hv
    }
}