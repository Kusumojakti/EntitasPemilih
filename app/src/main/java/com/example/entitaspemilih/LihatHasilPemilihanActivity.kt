package com.example.entitaspemilih

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.entitaspemilih.adapter.adapterHasilPilihan
import com.example.entitaspemilih.adapter.adapterLihatHasil
import com.example.entitaspemilih.model.dataHasilPilihan
import com.example.entitaspemilih.model.dataLihatHasil

class LihatHasilPemilihanActivity : AppCompatActivity() {

    private lateinit var reyclerView : RecyclerView
    private lateinit var hasilList : ArrayList<dataLihatHasil>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lihat_hasil_pemilihan)

        reyclerView = findViewById(R.id.recyclerLihat)
        hasilList = ArrayList<dataLihatHasil>()


        val img = arrayOf(
            R.drawable.ket_calon,
            R.drawable.calon
        )
        val img2 = arrayOf(
            R.drawable.ket_calon,
            R.drawable.calon
        )
        val nama = arrayOf(
            "Rivaldi Kenny",
            "Dilan Nanda"
        )
        val nama2 = arrayOf(
            "Fatih Ahmad",
            "Ashrof"
        )
        val total = arrayOf(
            "1250 Suara",
            "1090 Suara"
        )
        for (i in img.indices) {
            hasilList.add(
                dataLihatHasil(
                    img[i],
                    img2[i],
                    nama[i],
                    nama2[i],
                    total[i]
                )
            )
            populateData()
        }
    }
    private fun populateData() {
        val linearlayout = LinearLayoutManager(this)
        linearlayout.stackFromEnd = true
        linearlayout.reverseLayout = true
        reyclerView.layoutManager = linearlayout
        val adp = adapterLihatHasil(this, hasilList)
        reyclerView.adapter = adp
    }
}