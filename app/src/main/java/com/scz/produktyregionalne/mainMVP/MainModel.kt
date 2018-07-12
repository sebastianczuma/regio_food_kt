package com.scz.produktyregionalne.mainMVP

class MainModel: MainContract.Model {

    override
    fun items(): ArrayList<String> {
        val list: ArrayList<String> = ArrayList()

        list.add("Produkty mleczne")
        list.add("Ser zgorzelecki")
        list.add("Ser kozi łomnicki")
        list.add("Kamiennogórski ser pleśniowy")
        list.add("Twaróg sudecki")
        list.add("Produkty mięsne")
        list.add("Świnka pieczona po zaciszańsku")
        list.add("Słonina marynowana z Niemczy")
        list.add("Mięso w kawałkach niemczańskie domowe")
        list.add("Szynka wieprzowa niemczańska")
        list.add("Kiełbasa niemczańska")
        list.add("Kiełbasa galicjanka z Niemczy")
        list.add("Przysmak wołyński z Niemczy")
        list.add("Kiełbasa w słoiku z Przedgórza Sudeckiego")

        return list
    }

    override
    fun provincesQuantity(): ArrayList<String> {
        val list: ArrayList<String> = ArrayList()

        list.add("49 produktów")
        list.add("81 produktów")
        list.add("204 produkty")
        list.add("135 produktów")
        list.add("73 produkty")
        list.add("208 produktów")
        list.add("128 produktów")
        list.add("62 produkty")
        list.add("227 produktów")
        list.add("66 produktów")
        list.add("178 produktów")
        list.add("145 produktów")
        list.add("92 produkty")
        list.add("32 produkty")
        list.add("93 produkty")
        list.add("42 produkty")

        return list
    }

    override
    fun categories(): ArrayList<String> {
        val list: ArrayList<String> = ArrayList()

        list.add("Produkty mleczne")
        list.add("Produkty mięsne")
        list.add("Produkty rybołówstwa")
        list.add("Warzywa i owoce")
        list.add("Wyroby piekarnicze i cukiernicze")
        list.add("Oleje i tłuszcze")
        list.add("Miody")
        list.add("Gotowe dania i potrawy")
        list.add("Napoje")
        list.add("Inne produkty")

        return list
    }

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