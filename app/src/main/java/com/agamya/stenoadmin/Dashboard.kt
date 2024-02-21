package com.agamya.stenoadmin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.Recycler
import com.agamya.stenoadmin.dashboard.PanelAdapter

class Dashboard : AppCompatActivity() {
    lateinit var recyclerView: RecyclerView
    private lateinit var data:ArrayList<String>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.dashboard)
        data = ArrayList()
        data.add("Add Course")
        data.add("Ads")
        data.add("Show Users")
        data.add("Update Course")
        data.add("Offers")
        data.add("Transactions")
        data.add("Add Lecture")
        data.add("Add Notes")
        recyclerView=findViewById(R.id.rv)

        recyclerView.layoutManager= GridLayoutManager(this,2)
        val adapter = PanelAdapter(data)
        recyclerView.adapter = adapter
    }
}