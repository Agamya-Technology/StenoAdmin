package com.agamya.stenoadmin.dashboard

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.agamya.stenoadmin.R

class PanelAdapter(val data:ArrayList<String>) : RecyclerView.Adapter<PanelAdapter.vh>() {
    class vh(view: View) : RecyclerView.ViewHolder(view) {
    val items = view.findViewById<TextView>(R.id.data)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): vh {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.dashboard_button,parent,false)
        return vh(view)
    }

    override fun getItemCount(): Int {
        return data.size
    }

    override fun onBindViewHolder(holder: vh, position: Int) {
        holder.items.text = data[position]
    }
}