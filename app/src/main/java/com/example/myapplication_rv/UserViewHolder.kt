package com.example.myapplication_rv


import android.view.TextureView
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class UserViewHolder(itemView: View):RecyclerView.ViewHolder(itemView) {

    private val nameTextView:TextView = itemView.findViewById(R.id.name_text_view)
    private val ageTextView:TextView = itemView.findViewById(R.id.age_text_view)

    //натягиваем данные получает класс  User
    fun bind(user: User){
        nameTextView.text = "Имя - ${user.name}"
        ageTextView.text = "Возраст - ${user.age}"

        itemView.setOnClickListener{
            Toast.makeText(itemView.context,user.name,Toast.LENGTH_LONG).show()


        }
    }
}