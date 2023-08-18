package com.example.entitaspemilih.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.entitaspemilih.R
import com.example.entitaspemilih.model.dataPemilih
import com.example.entitaspemilih.model.dataRiwayat
import java.util.ArrayList

class adapterDataPemilih (val context : Context, val userList : ArrayList<dataPemilih>) : RecyclerView.Adapter<adapterDataPemilih.MyViewHolder>() {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): adapterDataPemilih.MyViewHolder {
        val itemView =
            LayoutInflater.from(context).inflate(R.layout.fetch_namapemilih, parent, false)
        return MyViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: adapterDataPemilih.MyViewHolder, position: Int) {
        val currentItem = userList[position]

        holder.photoPemilih.setImageResource(currentItem.photoProfile)
        holder.namaProfile.text = currentItem.nama
        holder.alamatPemilih.text = currentItem.alamatpemilih

    }

    override fun getItemCount(): Int {
        return userList.size
    }

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val photoPemilih: ImageView = itemView.findViewById(R.id.photoNamaPemilih)
        val namaProfile: TextView = itemView.findViewById(R.id.namaPemilih)
        val alamatPemilih : TextView = itemView.findViewById(R.id.alamatPemilih)
    }
}