package com.example.recycleview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.items.view.*

class Adapter(private val item:ArrayList<String>):RecyclerView.Adapter<ViewHolder>() {



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.items,parent,false)
        return  ViewHolder(view)

    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        holder.titleView.text = (item[position])
    }

    override fun getItemCount(): Int {
        return  item.size
    }


}


class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

   val titleView:TextView = itemView.title


}