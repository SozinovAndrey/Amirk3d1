package com.example.itogovaya

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import android.widget.Spinner
import android.widget.ArrayAdapter








class AddOrder : Fragment() {

    var countries = arrayOf("Бразилия", "Аргентина", "Колумбия", "Чили", "Уругвай")


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.frag_add_order, container, false)

        val spinner: Spinner =view.findViewById(R.id.spinner)

        // Создаем адаптер ArrayAdapter с помощью массива строк и стандартной разметки элемета spinner


        return view
    }


}