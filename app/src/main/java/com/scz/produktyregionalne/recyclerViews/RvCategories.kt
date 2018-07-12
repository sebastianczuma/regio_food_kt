package com.scz.produktyregionalne.recyclerViews

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.util.SparseBooleanArray
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.scz.produktyregionalne.R
import kotlinx.android.synthetic.main.one_category.view.*

class RvCategories(val items: ArrayList<String>, val context: Context?) : RecyclerView.Adapter<VhCategories>() {
    private val itemStateArray = SparseBooleanArray()

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VhCategories {
        return VhCategories(LayoutInflater.from(context).inflate(R.layout.one_category, parent, false))
    }

    override fun onBindViewHolder(holder: VhCategories, position: Int) {
        holder.categoryName?.text = items.get(position)

        val id: Int = context!!.resources.getIdentifier("c" + (position + 1), "drawable", context.getPackageName())
        holder.categoryImage?.setImageResource(id)

        if (itemStateArray.get(position)) {
            holder.categoryCheck.setChecked(true);
        } else {
            holder.categoryCheck.setChecked(false);
        }

        holder.category.setOnClickListener {
            if (!itemStateArray.get(position, false)) {
                holder.categoryCheck.isChecked = true
                itemStateArray.put(position, true)
            } else {
                holder.categoryCheck.isChecked = false
                itemStateArray.put(position, false);
            }

        }
    }
}

class VhCategories(view: View) : RecyclerView.ViewHolder(view) {
    val categoryName = view.categoryName
    val categoryImage = view.category_icon
    val category = view.category
    val categoryCheck = view.checkBox2
}