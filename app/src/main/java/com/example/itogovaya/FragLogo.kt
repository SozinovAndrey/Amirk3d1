package com.example.itogovaya

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import androidx.core.view.isVisible


class FragLogo : Fragment() {

    lateinit var imputText: EditText
    lateinit var myLoginText: TextView
    lateinit var enterButtonLogin: Button
    lateinit var SaleImages: ImageView


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_frag_logo, container, false)

        imputText = view.findViewById(R.id.input_login)
        myLoginText = view.findViewById(R.id.myLogin)
        enterButtonLogin = view.findViewById(R.id.button_login)
        SaleImages = view.findViewById(R.id.imageView3)

        enterButtonLogin.setOnClickListener {

            myLogin = imputText.getText().toString()

            imputText.getText().clear()
            myLoginText.text = myLogin
            login()
        }
        return view
    }

    fun login() = if (myLogin != "") {
        SaleImages.isVisible = true
        enterButtonLogin.isVisible = false
        imputText.isVisible = false
    } else {
        SaleImages.isVisible = false
        enterButtonLogin.isVisible = true
        imputText.isVisible = true
    }

    override fun onResume() {
        super.onResume()
        login()
    }

}


