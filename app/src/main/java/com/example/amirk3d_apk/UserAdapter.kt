package com.example.amirk3d_apk

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class UserAdapter(private val userList: List<User>): RecyclerView.Adapter<UserViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.user_list_item,parent,false)
        return UserViewHolder(itemView)
        //создает объект
    }

    override fun onBindViewHolder(holder: UserViewHolder, position: Int) {
        val user = userList[position]
        holder.bind(user)
        //каждый раз при отрисовке
    }

    override fun getItemCount(): Int {
        return userList.size
        //размер списка
    }
}