package com.example.entitaspemilih.fragment

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.example.entitaspemilih.DetailPemilihanActivity
import com.example.entitaspemilih.LihatHasilPemilihanActivity
import com.example.entitaspemilih.R
import com.example.entitaspemilih.RiwayatPemilihanActivity

class HomeFragment : Fragment() {
    private lateinit var btnPemilihKades : TextView
    private lateinit var btnKandidatKades : TextView
    private lateinit var btnRiwayatPemilihan : TextView
    private lateinit var btnAkunPanitia : TextView
    private lateinit var btnLook : TextView

    private lateinit var backHome : ImageView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view =  inflater.inflate(R.layout.fragment_home, container, false)

        btnPemilihKades = view.findViewById(R.id.pilihKades)
        btnKandidatKades = view.findViewById(R.id.kandidatKades)
        btnAkunPanitia = view.findViewById(R.id.buatAkunPanitia)
        btnRiwayatPemilihan = view.findViewById(R.id.riwayatpemilihanKades)
        btnLook = view.findViewById(R.id.btnLihatPemilihan)

        btnRiwayatPemilihan.setOnClickListener {
            val intent = Intent(activity, RiwayatPemilihanActivity::class.java)
            startActivity(intent)
        }
        btnPemilihKades.setOnClickListener {
            val intent = Intent(activity, DetailPemilihanActivity::class.java)
            startActivity(intent)
        }
        btnLook.setOnClickListener {
            val intent = Intent(activity, LihatHasilPemilihanActivity::class.java)
            startActivity(intent)
        }


        return view
    }

}