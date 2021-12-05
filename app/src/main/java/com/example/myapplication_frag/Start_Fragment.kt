package com.example.myapplication_frag

import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast

lateinit var show_toast: Button

class Start_Fragment : Fragment() {

    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.d(TAG,"Fragment - onAttach")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(TAG,"Fragment - onCreate")
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_start_, container, false)
        Log.d(TAG,"Fragment - onCreateView")


        //если нам нкжно работать с кнопкой то
      //  val  button: Button = view.findViewById(R.id.hi)
        show_toast = view.findViewById(R.id.show_toast)
        show_toast.setOnClickListener {
            Toast.makeText(context, "Я СООБЩЕНИЕ", Toast.LENGTH_SHORT).show()
        }
        return view
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        Log.d(TAG,"Fragment - onActivityCreated")
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG,"Fragment - onCreate")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG,"Fragment - onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG,"Fragment - onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG,"Fragment - onStop")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.d(TAG,"Fragment - onDestroyView")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG,"Fragment - onDestroy")
    }

    override fun onDetach() {
        super.onDetach()
        Log.d(TAG,"Fragment - onDetach")
    }
}

//1. Вынесем вьюшку в отдельную переменную
//2. совершаем работу с вью
//3. возвращаем вью