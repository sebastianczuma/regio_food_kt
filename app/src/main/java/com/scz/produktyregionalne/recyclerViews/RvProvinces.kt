package com.scz.produktyregionalne.recyclerViews

import android.content.Context
import android.content.Intent
import android.support.v7.widget.RecyclerView
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.scz.produktyregionalne.R
import com.scz.produktyregionalne.mainMVP.MainActivity
import kotlinx.android.synthetic.main.one_province.view.*

class RvProvinces(val items: ArrayList<String>, val context: Context) : RecyclerView.Adapter<VhProvinces>() {

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VhProvinces {
        return VhProvinces(LayoutInflater.from(context).inflate(R.layout.one_province, parent, false))
    }

    override fun onBindViewHolder(holder: VhProvinces, position: Int) {
        holder.provinceName?.text = items.get(position)

        if (position % 2 == 0) {
            holder.provinceName.gravity = Gravity.END
        }

        holder.item.setOnClickListener {
            val intent = Intent(context, MainActivity::class.java)
            intent.putExtra("province", items[position])
            context.startActivity(intent)
        }
    }
}

class VhProvinces(view: View) : RecyclerView.ViewHolder(view) {
    val provinceName = view.province_name
    val item = view.item
}