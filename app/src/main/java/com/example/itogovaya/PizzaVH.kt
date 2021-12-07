package com.example.mrv

import android.view.View
import android.widget.ImageButton
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.itogovaya.R


class PizzaVH(itemView: View): RecyclerView.ViewHolder(itemView) {

    private val nameTextView:TextView = itemView.findViewById(R.id.name_text_view)
    private val diametrTextView:TextView = itemView.findViewById(R.id.diametr_text_view)
    private val priceTextView: TextView = itemView.findViewById(R.id.price_text_view)
    private val imageButton: ImageButton = itemView.findViewById(R.id.pizza_button_view)




    //натягиваем данные получает класс  User
    fun bind(pizza: pizza){
        nameTextView.text = "${pizza.name}"
        diametrTextView.text = "(${pizza.diametr} см.)"
        priceTextView.text = "Цена: - ${pizza.price} руб."

        itemView.setOnClickListener{

            //добавили в корзину понажатию
            //Toast.makeText(itemView.context,user.name,Toast.LENGTH_LONG).show()


        }

        imageButton.setOnClickListener{

            //добавили в корзину понажатию
            Toast.makeText(itemView.context,
                nameTextView.text as String +"-Добавлена в корзину!",Toast.LENGTH_SHORT).show()


        }

    }


}

