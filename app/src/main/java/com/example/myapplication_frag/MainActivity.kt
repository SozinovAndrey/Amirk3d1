package com.example.myapplication_frag

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView

 var SrtingParam: String = "ГЛАВНАЯ АКТИВИТИ"
 var myLogin: String = "Андрей"

class MainActivity : AppCompatActivity() {

    lateinit var navMenu: BottomNavigationView
    var frag: Fragment? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        actionBar?.title = "Вторая активность"

        frag = frag_logo()
        if (savedInstanceState != null) {
            frag = supportFragmentManager.findFragmentById(savedInstanceState.getInt("tek_frag"))

        }

      //  val  hv:String? = intent.extras?.getString(TAG_СРС6)
      //  htv.text = hv

        replace_fragment(frag!!)

        navMenu = findViewById(R.id.navigation_menu)
        navMenu.setOnItemSelectedListener {item ->

            var key: Boolean = false

            when(item.itemId){
               R.id.frag_1 ->{frag = frag_1()
                   key = true}
               R.id.frag_2 ->{frag = frag_2()
                   key = true}
               R.id.frag_browser ->{
                   val weblink = Uri.parse("https://ya.ru")
                   val olIntent = Intent(Intent.ACTION_VIEW,weblink)
                   startActivity(olIntent)
               }
               R.id.frag_3 ->{frag = frag_3()
                   key = true}
            }
                if (key == true) {
                    replace_fragment(frag!!)
                }
            true
        }
     }


    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)


        outState.putInt("tek_frag",R.id.fragment_view)

    }

      fun replace_fragment(fragment: Fragment){

       supportFragmentManager
          .beginTransaction()
           .replace(R.id.fragment_view,fragment)
           .addToBackStack(fragment.tag)
           .commit()
    }
    }








