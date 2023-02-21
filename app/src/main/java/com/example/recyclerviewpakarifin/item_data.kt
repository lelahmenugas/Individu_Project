package com.example.recyclerviewpakarifin

class item_data {
    public val data = arrayOf(
        arrayOf(
            R.drawable.plusle,
            "Plusle"
        ),
        arrayOf(
            R.drawable.minun,
            "Minun"
        )
    )
    val listData: ArrayList<item>
        get() {
            val list= arrayListOf<item>()
            for (a in data){
                val item= item()
                item.photo= a[0] as Int
                item.name= a[1] as String
                list.add(item)
            }
            return list
        }
}