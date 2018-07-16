package com.scz.produktyregionalne.mainMVP

import android.util.Log
import org.greenrobot.eventbus.EventBus
import retrofit2.Call
import retrofit2.Callback

class MainModel : MainContract.Model {

    override
    fun downloadProducts(which: String) {
        val list: ArrayList<String> = ArrayList()

        val apiService = MainAPI.create()
        val call = apiService.get(which+".json")

        Log.d("REQUEST", call.toString() + "")

        call.enqueue(object : Callback<ServerResponse> {
            override fun onResponse(call: Call<ServerResponse>, response: retrofit2.Response<ServerResponse>) {
                response.body()

                if (response.body()?.produkty_mleczne != null) {
                    list.add("Produkty mleczne")
                    for (child in response.body()!!.produkty_mleczne) {
                        list.add(child.name)
                    }
                }

                if (response.body()?.produkty_miesne != null) {
                    list.add("Produkty mięsne")
                    for (child in response.body()!!.produkty_miesne) {
                        list.add(child.name)
                    }
                }

                if (response.body()?.produkty_rybolostwa != null) {
                    list.add("Produkty rybołówstwa")
                    for (child in response.body()!!.produkty_rybolostwa) {
                        list.add(child.name)
                    }
                }

                if (response.body()?.warzywa_i_owoce != null) {
                    list.add("Warzywa i owoce")
                    for (child in response.body()!!.warzywa_i_owoce) {
                        list.add(child.name)
                    }
                }

                if (response.body()?.wyroby_piekarnicze_i_cukiernicze != null) {
                    list.add("Wyroby piekarnicze i cukiernicze")
                    for (child in response.body()!!.wyroby_piekarnicze_i_cukiernicze) {
                        list.add(child.name)
                    }
                }

                if (response.body()?.oleje_i_tluszcze != null) {
                    list.add("Oleje i tłuszcze")
                    for (child in response.body()!!.oleje_i_tluszcze) {
                        list.add(child.name)
                    }
                }

                if (response.body()?.miody != null) {
                    list.add("Miody")
                    for (child in response.body()!!.miody) {
                        list.add(child.name)
                    }
                }

                if (response.body()?.gotowe_dania_i_potrawy != null) {
                    list.add("Gotowe dania i potrawy")
                    for (child in response.body()!!.gotowe_dania_i_potrawy) {
                        list.add(child.name)
                    }
                }
                if (response.body()?.napoje != null) {
                    list.add("Napoje")
                    for (child in response.body()!!.napoje) {
                        list.add(child.name)
                    }
                }

                if (response.body()?.inne_produkty != null) {
                    list.add("Inne produkty")
                    for (child in response.body()!!.inne_produkty) {
                        list.add(child.name)
                    }
                }

                EventBus.getDefault().post(MessageEvent(list))
            }

            override fun onFailure(call: Call<ServerResponse>, t: Throwable) {
            }
        })
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
}