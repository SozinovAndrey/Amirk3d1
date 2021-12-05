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
        //replace_fragment(logoFragment)  // это на будущий проект

      //  nextFragment.setOnClickListener{
      //  val fragment =
            //какой фрагмент у меня сейчас находится в контейнер под таким то R.id
        //    when(supportFragmentManager.findFragmentById(R.id.my_fragment_view)) {
             //   is Start_Fragment -> endFragment
             //   is Stop_Fragment -> startFragment
             //   else -> startFragment
          //  }
            //replace_fragment(fragment)


        }

      fun replace_fragment(fragment: Fragment){

       supportFragmentManager
          .beginTransaction()
           .replace(R.id.fragment_view,fragment)
           .addToBackStack(fragment.tag)
           .commit()
    }
    }







