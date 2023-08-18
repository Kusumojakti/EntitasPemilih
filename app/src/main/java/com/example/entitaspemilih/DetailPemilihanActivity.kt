package com.example.entitaspemilih

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.entitaspemilih.adapter.adapterDataPemilih
import com.example.entitaspemilih.adapter.adapterRiwayat
import com.example.entitaspemilih.model.dataPemilih
import com.example.entitaspemilih.model.dataRiwayat

class DetailPemilihanActivity : AppCompatActivity() {
    private lateinit var button: Button
    private lateinit var reyclerView : RecyclerView
    private lateinit var dataPemilihList : ArrayList<dataPemilih>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_pemilihan)

        reyclerView = findViewById(R.id.recyclerNamaPemilih)
        dataPemilihList = ArrayList<dataPemilih>()
        button = findViewById(R.id.btnHasilPemilihan)

        button.setOnClickListener {
            val intent = Intent(this,DetailPemilihanActivity2::class.java)
            startActivity(intent)
        }
        val image = arrayOf(
            R.drawable.user,
            R.drawable.user,
            R.drawable.user,
            R.drawable.user
        )
        val name = arrayOf(
            "Yuniardila",
            "Kusumojakti",
            "Kusumorasri",
            "Salugu"
        )
        val alamat = arrayOf(
            "Karanggayam, Segoroyoso",
            "Gamelan Lor, Panembahan",
            "Maguwoharjo",
            "Gamelan Lor, Panembahan"
        )
        for(i in name.indices){
            dataPemilihList.add(
                dataPemilih(
                    image[i],
                    name[i],
                    alamat[i]
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
        val adp = adapterDataPemilih(this, dataPemilihList)
        reyclerView.adapter = adp
    }
}