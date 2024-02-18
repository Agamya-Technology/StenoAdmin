package com.agamya.stenoadmin.userData

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.agamya.stenoadmin.R

class UserDataAdapter(val context: Context, private val data:ArrayList<UserDataClass>): RecyclerView.Adapter<UserDataAdapter.ViewHolder>(){
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val name:TextView=itemView.findViewById(R.id.name)
        val email:TextView=itemView.findViewById(R.id.email)
        val phone:TextView=itemView.findViewById(R.id.phone)
        val district:TextView=itemView.findViewById(R.id.district)
        val state:TextView=itemView.findViewById(R.id.state)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserDataAdapter.ViewHolder {
       val view =LayoutInflater.from(parent.context).inflate(R.layout.userdata_recycle_layout,parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: UserDataAdapter.ViewHolder, position: Int) {
        holder.name.text=data[position].name
        holder.email.text=data[position].email
        holder.phone.text=data[position].phone
        holder.district.text=data[position].district
        holder.state.text=data[position].state
    }

    override fun getItemCount(): Int {
      return  data.size
    }

}

