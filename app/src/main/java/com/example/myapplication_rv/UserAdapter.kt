package com.example.myapplication_rv

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView


//Адаптер всегда принимает список
//Адаптер эо абстрактный класс
class UserAdapter(private val userList: List<User>): RecyclerView.Adapter<UserViewHolder>() {

    //СОздает Объект для serViewHolder и кладет в него верстку
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder {
        // вызываем верстку
        val itemView =  LayoutInflater.from(parent.context)
            .inflate(R.layout.user_list_item,parent,false)
        return UserViewHolder(itemView)
    }

    //Вызывается каждый раз при отрисовке нового элемента RecyclerView
    override fun onBindViewHolder(holder: UserViewHolder, position: Int) {
       val user = userList[position]
        holder.bind(user)
    }

    override fun getItemCount(): Int {
        return userList.size
    }
}