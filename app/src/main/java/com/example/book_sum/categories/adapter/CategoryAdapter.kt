package com.example.book_sum.categories.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.book_sum.R
import com.example.book_sum.categories.model.usermodel

class CategoryAdapter(val context: Context, val items: ArrayList<usermodel>): RecyclerView.Adapter<CategoryAdapter.ViewHolder>()  {


    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        // Holds the TextView that will add each item to
        val cat: TextView = view.findViewById(R.id.category_name)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
            return ViewHolder(LayoutInflater.from(context).inflate(R.layout.category_user_layout,parent,false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
val item=items.get(position)
        holder.cat.text=item.genre
    }

    override fun getItemCount(): Int {
        return items.size
    }
}