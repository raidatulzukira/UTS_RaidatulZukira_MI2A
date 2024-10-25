package com.zukira.uts_raidatulzukira_mi2a.model

import com.zukira.uts_raidatulzukira_mi2a.R

data class ModelMakanan(
    val gambarMakanan : Int,
    val namaMakanan : String,
    val detailMakanan : String
)

object MakananList {
    fun getModel() : List<ModelMakanan> {
        val item1 = ModelMakanan(
            R.drawable.img1,
            "Mexican Appetizer Cups",
            "Lorem ipsum dolor sit amet, consectetur."
        )

        val item2 = ModelMakanan(
            R.drawable.makan2,
            "Healthy Food",
            "Lorem ipsum dolor sit amet, consectetur."
        )

        val item3 = ModelMakanan(
            R.drawable.img2,
            "Mini Taco Bowls",
            "Lorem ipsum dolor sit amet, consectetur."
        )

        val item4 = ModelMakanan(
            R.drawable.makanan,
            "Bibimpap",
            "Lorem ipsum dolor sit amet, consectetur."
        )

        val item5 = ModelMakanan(
            R.drawable.makan5,
            "Asian Food",
            "Lorem ipsum dolor sit amet, consectetur."
        )

        val item6 = ModelMakanan(
            R.drawable.img1,
            "Mexican Appetizer Cups",
            "Lorem ipsum dolor sit amet, consectetur."
        )

        val itemList : ArrayList<ModelMakanan> = ArrayList()
        itemList.add(item1)
        itemList.add(item2)
        itemList.add(item3)
        itemList.add(item4)
        itemList.add(item5)
        itemList.add(item6)


        return itemList
    }
}