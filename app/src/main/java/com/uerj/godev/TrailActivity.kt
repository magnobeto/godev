package com.uerj.godev

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.uerj.godev.databinding.ActivityTrailBinding
import com.uerj.godev.ui.ListTrailAdapter

class TrailActivity: AppCompatActivity() {

    private lateinit var binding : ActivityTrailBinding
    private val list = listOf("Algoritmos", "Javascript", "Python", "Kotlin")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTrailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.recyclerViewListTrail.apply {
            layoutManager = LinearLayoutManager(this@TrailActivity)
            adapter = ListTrailAdapter(list)
        }
    }
}