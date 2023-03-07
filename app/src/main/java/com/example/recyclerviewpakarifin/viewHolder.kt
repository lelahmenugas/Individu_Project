package com.example.recyclerviewpakarifin

import android.graphics.Color
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class viewHolder(inflater: LayoutInflater, parent: ViewGroup):
        RecyclerView.ViewHolder(inflater.inflate(R.layout.template, parent, false)){
                private var image: ImageView?=null
                private var text: TextView?=null
                private var index: TextView?=null
                private var type: TextView?=null

        init {

            image = itemView.findViewById(R.id.foto)
            text = itemView.findViewById(R.id.text)
            index = itemView.findViewById(R.id.index)
            type = itemView.findViewById(R.id.type)
        }

        fun bind(data:item){
                image?.setImageResource(data.photo)
                text?.text=data.name
                index?.text=data.index
                type?.text=data.type
            when(data.type){
                "Electric"-> type?.setBackgroundColor(Color.parseColor("#FFEB3B"))
                "Ghost"-> type?.setBackgroundColor(Color.parseColor("#4844CC"))

            }
        }
        }