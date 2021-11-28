package com.example.amirk3d_apk

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

const val TAG ="MainActivity"
const val TAG_СРС5 ="
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

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        print_one_srting("onCreate")

        if (savedInstanceState != null) {
            i = savedInstanceState.getInt(TAG_СРС5)+3
            Log.d(TAG_СРС5,"ВСПОМИНАЕМ:----"+i)


        }



        textView = findViewById(R.id.textView)
        textbutton= findViewById(R.id.textButton)
        textbutton.setOnClickListener{
            todo_1()
        }
    }

    fun todo_1(){
        val text = "Пора покормить кота!"
        val duration = Toast.LENGTH_SHORT
        textView.text = "Пора покормить кота!"

        Toast.makeText(applicationContext, text, duration).show()
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
        outState.putInt(TAG_СРС5,i)
        Log.d(TAG_СРС5,"ЗАПОМИНАЕМ: ----"+i)
    }
    fun print_one_srting(stroka:String){
        Log.d(TAG_СРС5,stroka +"---"+ items[i]+"---"+i)
        i=i+1
    }
}
