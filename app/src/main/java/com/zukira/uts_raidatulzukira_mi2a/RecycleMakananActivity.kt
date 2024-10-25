package com.zukira.uts_raidatulzukira_mi2a

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.zukira.uts_raidatulzukira_mi2a.adapter.MakananAdapter
import com.zukira.uts_raidatulzukira_mi2a.model.MakananList
import com.zukira.uts_raidatulzukira_mi2a.model.ModelMakanan

class RecycleMakananActivity : AppCompatActivity() {
    private lateinit var rv_favorites : RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_recycle_makanan)

        rv_favorites = findViewById(R.id.rv_favorites)

        rv_favorites.layoutManager = GridLayoutManager(this, 2, GridLayoutManager.VERTICAL, false)

        val adapter = MakananAdapter(MakananList.getModel() as ArrayList<ModelMakanan>, this)

        rv_favorites.adapter = adapter

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}