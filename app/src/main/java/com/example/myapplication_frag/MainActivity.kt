package com.example.myapplication_frag

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

val TAG ="TAG"

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d(TAG,"MainActivity - onCreate")

         val startFragment = Start_Fragment()
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.my_fragment_view,startFragment)
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