package com.example.amirk3d_apk


import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import android.util.Log
import android.widget.Button
import android.widget.TextView


const val TAG ="MainActivity"
const val TAG_СРС5 ="SRS_5"
const val TAG_СРС6 ="SRS_6"
 var   tec_stoka: String = ""
val items1 = listOf("***Стихи про программиста***",
                    "Всем на свете это ясно",
                    "Быть программером прекрасно!",
                    "Ты, программер, умный очень —",
                    "Программируешь что хочешь!")
val items = listOf('a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z')
var i:Int =0

class MainActivity : AppCompatActivity() {

    lateinit var textView : TextView
    lateinit var textbutton: Button
    lateinit var NextActivity: Button
    lateinit var Button_open_browser: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        NextActivity = findViewById(R.id.nextActivity)

        NextActivity.setOnClickListener{
            val secontActivityIntent = Intent(this, Akt_2::class.java)
            secontActivityIntent.putExtra(TAG_СРС6, "Hello SRS 6")
            startActivity(secontActivityIntent)
        }


        Button_open_browser = findViewById(R.id.Button_open_browser)
        Button_open_browser.setOnClickListener{
            val weblink = Uri.parse("https://ya.ru")
            val olIntent = Intent(Intent.ACTION_VIEW,weblink)
            startActivity(olIntent)
        }


        if (savedInstanceState != null) {
            i = savedInstanceState.getInt(TAG_СРС5)+3
            Log.d(TAG_СРС5,"ВСПОМИНАЕМ:----"+i)
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
        Log.d(TAG_СРС5, stroka)
    }
}
