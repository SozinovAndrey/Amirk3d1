package com.example.amirk3d_apk

import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class UserViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
    private val nameTexView:TextView = itemView.findViewById(R.id.name_Text_View)
    private val ageTextView:TextView = itemView.findViewById(R.id.age_Text_View)

    fun bind(user: User){
        nameTexView.text  ="Bvz - ${user.name}"
        ageTextView.text  ="Возраст -${user.age}"

        itemView.setOnClickListener{
            Toast.makeText(itemView.context, user.name, Toast.LENGTH_LONG).show()
        }
    }
}