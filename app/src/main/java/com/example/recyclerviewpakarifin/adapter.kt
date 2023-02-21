package com.example.recyclerviewpakarifin

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class adapter(private val data : ArrayList<item>):RecyclerView.Adapter<viewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): viewHolder {
        val inflater=LayoutInflater.from(parent.context)
        return viewHolder(inflater, parent)
    }

    override fun onBindViewHolder(holder: viewHolder, position: Int) {
        holder.bind(data[position])
    }

    override fun getItemCount(): Int {
        return data.size
    }
}