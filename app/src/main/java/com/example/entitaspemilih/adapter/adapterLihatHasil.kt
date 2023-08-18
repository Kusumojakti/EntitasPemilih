package com.example.entitaspemilih.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.entitaspemilih.R
import com.example.entitaspemilih.model.dataLihatHasil
import java.util.ArrayList

class adapterLihatHasil (val context : Context, val resultList : ArrayList<dataLihatHasil>) : RecyclerView.Adapter<adapterLihatHasil.MyViewHolder>() {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): adapterLihatHasil.MyViewHolder {
        val itemView =
            LayoutInflater.from(context).inflate(R.layout.fetch_hasil_pemilihan, parent, false)
        return MyViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: adapterLihatHasil.MyViewHolder, position: Int) {
        val currentItem = resultList[position]

        holder.photoketua.setImageResource(currentItem.photoketua)
        holder.photowakil.setImageResource(currentItem.photowakil)
        holder.namaketua.text = currentItem.txtKetua
        holder.namawakil.text = currentItem.txtwakil
        holder.total.text = currentItem.total

    }

    override fun getItemCount(): Int {
        return resultList.size
    }

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val photoketua: ImageView = itemView.findViewById(R.id.photoketua)
        val photowakil: ImageView = itemView.findViewById(R.id.photowakil)
        val namaketua: TextView = itemView.findViewById(R.id.txtketua)
        val namawakil : TextView = itemView.findViewById(R.id.txtwakil)
        val total : TextView = itemView.findViewById(R.id.totalsuara)
    }
}