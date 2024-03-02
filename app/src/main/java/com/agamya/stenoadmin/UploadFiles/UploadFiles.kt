package com.agamya.stenoadmin.UploadFiles

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.agamya.stenoadmin.R

class UploadFiles : AppCompatActivity() {
    private lateinit var data:ArrayList<UploadFilesData>
    private lateinit var rview: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.upload_files)
        rview = findViewById(R.id.rview)
        rview.layoutManager = LinearLayoutManager(this)

        data = ArrayList()
        data.add(UploadFilesData("Files.mp4/pdf","25.3 mb","60% done","976 kb/s"))
        data.add(UploadFilesData("Files.mp4/pdf","25.3 mb","60% done","976 kb/s"))
        data.add(UploadFilesData("Files.mp4/pdf","25.3 mb","60% done","976 kb/s"))
        data.add(UploadFilesData("Files.mp4/pdf","25.3 mb","60% done","976 kb/s"))
        data.add(UploadFilesData("Files.mp4/pdf","25.3 mb","60% done","976 kb/s"))
        data.add(UploadFilesData("Files.mp4/pdf","25.3 mb","60% done","976 kb/s"))
        data.add(UploadFilesData("Files.mp4/pdf","25.3 mb","60% done","976 kb/s"))
        data.add(UploadFilesData("Files.mp4/pdf","25.3 mb","60% done","976 kb/s"))
        data.add(UploadFilesData("Files.mp4/pdf","25.3 mb","60% done","976 kb/s"))
        data.add(UploadFilesData("Files.mp4/pdf","25.3 mb","60% done","976 kb/s"))

        val adapter = UploadFilesAdapter(data)
        rview.adapter = adapter

    }
}