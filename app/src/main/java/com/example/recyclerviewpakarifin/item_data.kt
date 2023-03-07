package com.example.recyclerviewpakarifin

class item_data {
    public val data = arrayOf(
        arrayOf(
            R.drawable.plusle,
            "Plusle",
            "#0311",
            "Electric"
        ),
        arrayOf(
            R.drawable.minun,
            "Minun",
            "#0312",
            "Electric"
        ),
        arrayOf(
            R.drawable.ditto,
            "Ditto",
            "#0132",
            "Normal"
        ),
        arrayOf(
            R.drawable.gengar,
            "Gengar",
            "#0094",
            "Ghost"
        ),
        arrayOf(
            R.drawable.lapras,
            "Lapras",
            "#0131",
            "Water"
        ),
        arrayOf(
            R.drawable.mimikyu,
            "Mimikyu",
            "#0778",
            "Ghost"
        )

    )
    val listData: ArrayList<item>
        get() {
            val list= arrayListOf<item>()
            for (a in data){
                val item= item()
                item.photo= a[0] as Int
                item.name= a[1] as String
                item.index= a[2] as String
                item.type= a[3] as String
                list.add(item)
            }
            return list
        }
}