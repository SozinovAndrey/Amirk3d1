package com.example.myapplication_frag

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView


class frag_logo : Fragment() {

   lateinit var imputText: EditText
   lateinit var myLoginText: TextView
   lateinit var enterButtonLogin: Button



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        val view = inflater.inflate(R.layout.fragment_frag_logo, container, false)

        imputText = view.findViewById(R.id.input_login)
        myLoginText = view.findViewById(R.id.myLogin)
        enterButtonLogin = view.findViewById(R.id.button_login)
        enterButtonLogin.setOnClickListener {
            myLogin = imputText.getText().toString()
            imputText.getText().clear()
            myLoginText.text = myLogin
        }




        return view
    }


}