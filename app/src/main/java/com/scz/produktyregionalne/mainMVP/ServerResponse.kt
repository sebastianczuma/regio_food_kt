package com.scz.produktyregionalne.mainMVP

data class ServerResponse(
        val produkty_mleczne: List<ResponseChild>,
        val produkty_miesne: List<ResponseChild>,
        val produkty_rybolostwa: List<ResponseChild>,
        val warzywa_i_owoce: List<ResponseChild>,
        val wyroby_piekarnicze_i_cukiernicze: List<ResponseChild>,
        val oleje_i_tluszcze: List<ResponseChild>,
        val miody: List<ResponseChild>,
        val gotowe_dania_i_potrawy: List<ResponseChild>,
        val napoje: List<ResponseChild>,
        val inne_produkty: List<ResponseChild>)

data class ResponseChild(val name: String, val date: String)

