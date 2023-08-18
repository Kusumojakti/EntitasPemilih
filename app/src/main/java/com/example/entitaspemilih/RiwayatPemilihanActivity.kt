package com.example.entitaspemilih

import android.content.Intent
import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.entitaspemilih.adapter.adapterRiwayat
import com.example.entitaspemilih.fragment.HomeFragment
import com.example.entitaspemilih.model.dataRiwayat

class RiwayatPemilihanActivity : AppCompatActivity() {

    private lateinit var reyclerView : RecyclerView
    private lateinit var riwayatList : ArrayList<dataRiwayat>
    private lateinit var backHome : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_riwayat_pemilihan)

        reyclerView = findViewById(R.id.recyclerRiwayat)
        riwayatList = ArrayList<dataRiwayat>()
        backHome = findViewById(R.id.backRiwayat)

        backHome.setOnClickListener {
            val intent = Intent(this, HomeFragment::class.java)
            startActivity(intent)
        }

        val name = arrayOf(
            "Desa Umbulharjo",
            "Desa Tahunan",
            "Desa Panembahan",
            "Desa Sewon"
        )
        val status = arrayOf(
            "Sudah selesai proses pemilihan",
            "Sedang berlangsung proses pemilihan",
            "Sudah selesai proses pemilihan",
            "Sedang berlangsung proses pemilihan"
        )
        val statusbar = arrayOf(
            "Selesai",
            "Belum",
            "Selesai",
            "Belum"
        )
        val time = arrayOf(
            "1 Jam yang lalu",
            "2 Menit yang lalu",
            "2 Jam yang lalu",
            "10 Menit yang lalu"
        )

        for(i in name.indices){
            riwayatList.add(
                dataRiwayat(
                    name[i],
                    status[i],
                    statusbar[i],
                    time[i]
                )
            )
            populateData()
        }
    }
    private fun populateData(){
        val linearLayout = LinearLayoutManager(this)
        linearLayout.stackFromEnd = true
        linearLayout.reverseLayout = true
        reyclerView.layoutManager = linearLayout
        val adp = adapterRiwayat(this, riwayatList)
        reyclerView.adapter = adp
    }
}