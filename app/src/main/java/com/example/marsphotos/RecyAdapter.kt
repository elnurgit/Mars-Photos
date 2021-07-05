package com.example.marsphotos

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.list_item.view.*

class RecyAdapter(private val listItems:List<ListItem>):RecyclerView.Adapter<RecyAdapter.RecyViewHolder>() {
    class RecyViewHolder(itemView:View):RecyclerView.ViewHolder(itemView){
        val imageView:ImageView = itemView.image_view
        val textView:TextView = itemView.textView
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.list_item,parent,false)
        return RecyViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: RecyViewHolder, position: Int) {
        val currentItem = listItems[position]
        holder.textView.text = currentItem.text
    }

    override fun getItemCount() = listItems.size


}