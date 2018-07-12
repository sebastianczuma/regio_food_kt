package com.scz.produktyregionalne.chooseProvinceMVP

class CPModel: CPContract.Model {

    override
    fun provinces(): ArrayList<String> {
        val list: ArrayList<String> = ArrayList()

        list.add("dolnośląskie")
        list.add("kujawsko-pomorskie")
        list.add("lubelskie")
        list.add("łódzkie")
        list.add("lubuskie")
        list.add("małopolskie")
        list.add("mazowieckie")
        list.add("opolskie")
        list.add("podkarpackie")
        list.add("podlaskie")
        list.add("pomorskie")
        list.add("śląskie")
        list.add("świętokrzyskie")
        list.add("warmińsko-mazurskie")
        list.add("wielkopolskie")
        list.add("zachodniopomorskie")

        return list
    }

}