package com.agamya.stenoadmin.UploadFiles

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.agamya.stenoadmin.R

class UploadFilesAdapter(private val data : ArrayList<UploadFilesData>): RecyclerView.Adapter<UploadFilesAdapter.VH>() {
    class VH(view: View) : RecyclerView.ViewHolder(view) {
        val fileName = view.findViewById<TextView>(R.id.files)
        val fileSize = view.findViewById<TextView>(R.id.mb)
        val downloadPercent = view.findViewById<TextView>(R.id.done)
        val downloadSpeed = view.findViewById<TextView>(R.id.speed)
        val fileIcon = view.findViewById<ImageView>(R.id.video)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VH {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.upload_files_template, parent, false)
        return VH(view)
    }

    override fun getItemCount(): Int {
        return data.size
    }

    override fun onBindViewHolder(holder: VH, position: Int) {
        holder.fileName.text = data[position].fileName
        holder.fileSize.text = data[position].fileSize
        holder.downloadPercent.text = data[position].downloadPercent
        holder.downloadSpeed.text = data[position].downloadSpeed
        val list = arrayOf(".pdf", ".MP4")

        val selector = list.random()
        if (selector == ".pdf") {
            holder.fileIcon.setImageResource(R.drawable.baseline_insert_drive_file_24)
        } else if (selector == ",MP4") {
            holder.fileIcon.setImageResource(R.drawable.baseline_videocam_24)
        } else {
            Log.d("File Type", "Invalid File Type")
        }
    }

}