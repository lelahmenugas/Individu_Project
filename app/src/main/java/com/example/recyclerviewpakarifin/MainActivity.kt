package com.example.recyclerviewpakarifin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    lateinit var recyclerView: RecyclerView
    lateinit var adapter: adapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView=findViewById(R.id.recycler)

        var data=ArrayList<item>()
        data.addAll(item_data().listData)
        adapter=adapter(data)
        recyclerView.layoutManager= GridLayoutManager(this,2)
        recyclerView.adapter=adapter
    }
}
