package com.example.entitaspemilih

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.entitaspemilih.adapter.adapterHasilPilihan
import com.example.entitaspemilih.model.dataHasilPilihan

class DetailPemilihanActivity2 : AppCompatActivity() {
    private lateinit var button: Button
    private lateinit var reyclerView : RecyclerView
    private lateinit var dataHasilPilihan : ArrayList<dataHasilPilihan>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_pemilihan2)

        reyclerView = findViewById(R.id.recyclerhasilPilihan)
        dataHasilPilihan = ArrayList<dataHasilPilihan>()
        button = findViewById(R.id.btnDataPemilih2)

        button.setOnClickListener {
            val intent = Intent(this,DetailPemilihanActivity::class.java)
            startActivity(intent)
        }

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
            dataHasilPilihan.add(
                dataHasilPilihan(
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
        val adp = adapterHasilPilihan(this, dataHasilPilihan)
        reyclerView.adapter = adp
    }
}