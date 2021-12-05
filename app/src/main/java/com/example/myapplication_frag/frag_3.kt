package com.example.myapplication_frag

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

class frag_3 : Fragment() {

    lateinit var textView: TextView
    lateinit var myLoginTextView: TextView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_frag_3, container, false)

        myLoginTextView = view.findViewById(R.id.myLogin)
        myLoginTextView.text = "Привет "+ myLogin + " " + myLoginTextView.text

        textView = view.findViewById(R.id.frag_3_text)
        textView.text = "Я побывал в: "+SrtingParam
        SrtingParam = "Фрагменте 3"

        return view
    }

}