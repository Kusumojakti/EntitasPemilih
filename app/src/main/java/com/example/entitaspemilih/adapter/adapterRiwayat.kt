package com.example.entitaspemilih.adapter

import android.content.Context
import android.content.Intent
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.RelativeLayout
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.view.menu.MenuView.ItemView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.example.entitaspemilih.DetailPemilihanActivity
import com.example.entitaspemilih.R
import com.example.entitaspemilih.RiwayatPemilihanActivity
import com.example.entitaspemilih.model.dataRiwayat
import org.json.JSONException
import org.json.JSONObject
import java.util.ArrayList

class adapterRiwayat(val context : Context, val userList : ArrayList<dataRiwayat>) : RecyclerView.Adapter<adapterRiwayat.MyViewHolder>() {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): adapterRiwayat.MyViewHolder {
        val itemView =
            LayoutInflater.from(context).inflate(R.layout.fetch_riwayat, parent, false)
        return MyViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: adapterRiwayat.MyViewHolder, position: Int) {
        val currentItem = userList[position]

        holder.namaDesa.text = currentItem.namaDesa
        holder.statuskegiatan.text = currentItem.statusKegiatan
        holder.statusbar.text = currentItem.statusBar
        holder.waktu.text = currentItem.waktu
        holder.click.setOnClickListener {
            val intent = Intent(context,DetailPemilihanActivity::class.java)
            context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int {
        return userList.size
    }

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val namaDesa: TextView = itemView.findViewById(R.id.textDaerah)
        val statuskegiatan: TextView = itemView.findViewById(R.id.textStatus)
        val statusbar : TextView = itemView.findViewById(R.id.statusbar)
        val waktu : TextView = itemView.findViewById(R.id.timeStatus)
        val click : RelativeLayout = itemView.findViewById(R.id.fetch_riwayat_pemilih)
    }
}