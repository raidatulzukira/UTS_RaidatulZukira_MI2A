package com.zukira.uts_raidatulzukira_mi2a

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class DetailMakananActivity : AppCompatActivity() {
    private lateinit var gambarMakanan : ImageView
    private lateinit var namaMakanan : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_detail_makanan)

        gambarMakanan = findViewById(R.id.gambarMakanan)
        namaMakanan = findViewById(R.id.namaMakanan)

        val gambar = intent.getIntExtra("gambarMakanan", 0)
        val nama = intent.getStringExtra("namaMakanan")

        gambarMakanan.setImageResource(gambar)
        namaMakanan.setText(nama)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}