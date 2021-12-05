package com.example.myapplication_frag

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.fragment.app.Fragment

val TAG ="TAG"

class MainActivity : AppCompatActivity() {

    lateinit var nextFragment:Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d(TAG,"MainActivity - onCreate")
        nextFragment = findViewById(R.id.switch_button)

       // val logoFragment = Logo_Fragment() // это на будущий проект это будет Фрагмент приветсвтия

        val startFragment = Start_Fragment()
        val endFragment = Stop_Fragment()


        //replace_fragment(logoFragment)  // это на будущий проект

        nextFragment.setOnClickListener{
        val fragment =
            //какой фрагмент у меня сейчас находится в контейнер под таким то R.id
            when(supportFragmentManager.findFragmentById(R.id.my_fragment_view)) {
                is Start_Fragment -> endFragment
                is Stop_Fragment -> startFragment
                else -> startFragment
            }

            replace_fragment(fragment)


        }


    }

    fun replace_fragment(fragment: Fragment){

        supportFragmentManager
            .beginTransaction()
            .replace(R.id.my_fragment_view,fragment)
            .addToBackStack(fragment.tag)
            .commit()

    }


    override fun onStart() {
        super.onStart()
        Log.d(TAG,"MainActivity - onCreate")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG,"MainActivity - onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG,"MainActivity - onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG,"MainActivity - onStop")
    }



    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG,"MainActivity - onDestroy")
    }

}