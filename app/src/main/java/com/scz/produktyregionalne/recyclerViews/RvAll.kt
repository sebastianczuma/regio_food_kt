package com.scz.produktyregionalne.recyclerViews

import android.content.Context
import android.content.Intent
import android.support.v7.widget.RecyclerView
import android.util.SparseBooleanArray
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.scz.produktyregionalne.ItemInfo
import com.scz.produktyregionalne.R
import kotlinx.android.synthetic.main.one_item.view.*

class RvAll(val items: ArrayList<String>, val context: Context) : RecyclerView.Adapter<VhAll>() {
    private val itemStateArray = SparseBooleanArray()

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VhAll {
        return VhAll(LayoutInflater.from(context).inflate(R.layout.one_item, parent, false))
    }

    override fun onBindViewHolder(holder: VhAll, position: Int) {
        if (itemStateArray.get(position)) {
            holder.item.visibility = View.GONE
            holder.divider.visibility = View.VISIBLE
            holder.divider.text = items[position]
        } else {
            holder.item.visibility = View.VISIBLE
            holder.divider.visibility = View.GONE
        }

        if (items[position].equals("Produkty mleczne") or items[position].equals("Produkty mięsne")) {
            holder.item.visibility = View.GONE
            holder.divider.visibility = View.VISIBLE
            holder.divider.text = items[position]
            itemStateArray.put(position, true)
        } else {
            itemStateArray.put(position, false);

            holder.name?.text = items[position]

            var whichImage = items[position].replace(" ", "_").toLowerCase()
            whichImage = whichImage.replace("ą", "a")
                    .replace("ć", "c")
                    .replace("ę", "e")
                    .replace("ł", "l")
                    .replace("ń", "n")
                    .replace("ó", "o")
                    .replace("ś", "s")
                    .replace("ż", "z")
                    .replace("ź", "z")

            var id: Int = context.resources.getIdentifier(whichImage, "drawable", context.packageName)
            if (id == 0) {
                id = context.resources.getIdentifier("ic_photo_black_24dp", "drawable", context.packageName)
                holder.image?.setImageResource(id)
            } else {
                holder.image?.setImageResource(id)
            }

            holder.item.setOnClickListener {
                val intent = Intent(context, ItemInfo::class.java)
                intent.putExtra("name", items[position])
                intent.putExtra("image", whichImage)
                context.startActivity(intent)
            }
        }
    }
}

class VhAll(view: View) : RecyclerView.ViewHolder(view) {
    val name = view.name
    val item = view.item
    val image = view.image1
    val divider = view.divider
}