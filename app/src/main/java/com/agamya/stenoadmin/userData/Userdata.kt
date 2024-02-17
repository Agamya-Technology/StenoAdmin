package com.agamya.stenoadmin.userData

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.agamya.stenoadmin.R

class Userdata : AppCompatActivity() {
    private lateinit var rv:RecyclerView
    private lateinit var data:ArrayList<UserDataClass>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_userdata)
        rv = findViewById(R.id.recycle)
        data=ArrayList()

        data.add(
            UserDataClass(
                "Neha Kumari",
                "nehakumaripusa00@GMAIL.com",
                "7543813127",
                "Samastipur",
                "Bihar"
            )
        )
        data.add(
            UserDataClass(
                "Saumya Singh",
                "saumyasingheee@gmail.com",
                "9308223948",
                "Patna",
                "Bihar"
            )
        )
        data.add(
            UserDataClass(
                "Priyanshu Ranjan",
                "priyanshuranjan2483@gmail.com",
                "9197537145",
                "Samastipur",
                "Bihar"
            )
        )

        data.add(
            UserDataClass(
                "Shivrajit Kushwaha",
                "shivmouryacse@gmail.com",
                "9608413215",
                "Darbhanga",
                "Bihar"
            )
        )
        data.add(
            UserDataClass(
                "Anurag Shahi",
                "anuragkumar21324@gmail.com",
                "7360942246",
                "Aurangabad",
                "bihar"
            )
        )

        data.add(
            UserDataClass(
                "Anuj Kumar",
                "anuanuj19233@gmail.com",
                "7970380281",
                "Aurangabad",
                "Bihar"
            )
        )
        rv.layoutManager=LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)
        val adapter = UserDataAdapter(this, data)
        rv.adapter = adapter

    }
}