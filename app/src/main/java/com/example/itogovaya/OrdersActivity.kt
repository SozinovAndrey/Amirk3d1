package com.example.itogovaya

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView

lateinit var navOrderMenu: BottomNavigationView
private var frag: Fragment? = null


class OrdersActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_orders)
        actionBar?.title = myLogin + " Вы вошли в разедел - ПИЦЦА"
        frag = Frag_Sushi()

        if (savedInstanceState != null) {
            frag = supportFragmentManager.findFragmentById(savedInstanceState.getInt("tek_frag"))
        }
        replace_fragment(frag!!)

        navOrderMenu = findViewById(R.id.orders_navigation_menu)
        navOrderMenu.setOnItemSelectedListener { item ->

        var key: Boolean = false
        when (item.itemId) {

            R.id.orders_menu_sushi -> {frag = Frag_Sushi()
                key=true}

            R.id.orders_menu_pizza -> {frag = Frag_Pizza()
                key=true}

            R.id.order_cart -> {}


            R.id.order_go_main -> {
                val secontActivityIntent = Intent(this, MainActivity::class.java)
                startActivity(secontActivityIntent)
            }
        }
            if (key) {
                replace_fragment(frag!!)
            }
            true
        }
}
    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putInt("tek_frag",R.id.order_fragment_view)
    }

    fun replace_fragment(fragment: Fragment){

        supportFragmentManager
            .beginTransaction()
            .replace(R.id.order_fragment_view,fragment)
            .addToBackStack(fragment.tag)
            .commit()
    }
}