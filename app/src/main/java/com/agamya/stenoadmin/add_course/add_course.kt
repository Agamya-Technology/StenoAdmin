package com.agamya.stenoadmin.add_course

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import com.agamya.stenoadmin.R

class add_course : AppCompatActivity() {
    private lateinit var cid:EditText
    private lateinit var cname:EditText
    private lateinit var ctime:EditText
    private lateinit var ntest:EditText
    private lateinit var nquestion:EditText
    private lateinit var auth:EditText
    private lateinit var pri:EditText
    private lateinit var descri:EditText
    private lateinit var learn:EditText
    private lateinit var summ:EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_course)

        cid = findViewById(R.id.et1)
        cname = findViewById(R.id.et2)
        ctime= findViewById(R.id.et3)
        ntest= findViewById(R.id.et4)
        nquestion = findViewById(R.id.et5)
        auth = findViewById(R.id.et6)
        pri = findViewById(R.id.et7)
        descri = findViewById(R.id.et8)
        learn= findViewById(R.id.et9)
        summ = findViewById(R.id.et10)
    }
}