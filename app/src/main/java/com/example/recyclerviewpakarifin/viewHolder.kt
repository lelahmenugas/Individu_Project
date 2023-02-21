package com.example.recyclerviewpakarifin

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class viewHolder(inflater: LayoutInflater, parent: ViewGroup):
        RecyclerView.ViewHolder(inflater.inflate(R.layout.template, parent, false)){
                private var image: ImageView?=null
                private var text: TextView?=null

        init {
            image = itemView.findViewById(R.id.foto)
            text = itemView.findViewById(R.id.text)
        }
        fun bind(data:item){
                image?.setImageResource(data.photo)
                text?.text=data.name
        }
        }