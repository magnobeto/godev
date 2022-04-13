package com.uerj.godev.view.ui.activity

import android.content.Intent
import android.os.Bundle
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.core.os.bundleOf
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.uerj.godev.R
import com.uerj.godev.databinding.ActivityTrailBinding
import com.uerj.godev.model.Language
import com.uerj.godev.view.adapter.ListTrailAdapter
import java.io.Serializable

class TrailActivity : AppCompatActivity() {

    private lateinit var binding: ActivityTrailBinding
    private val list = listOf(
        Language("Algoritmos"),
        Language("Javascript", R.drawable.ic_icons8_javascript),
        Language("Python", R.drawable.ic_icons8_python),
        Language("Kotlin", R.drawable.ic_icons8_kotlin)
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTrailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.recyclerViewListTrail.apply {
            layoutManager = StaggeredGridLayoutManager(2, LinearLayout.VERTICAL)
            adapter = ListTrailAdapter(this@TrailActivity, list) { selectItemLanguage ->
                navigateToMainActivity(selectItemLanguage)
            }
        }
    }

    private fun navigateToMainActivity(serializable: Serializable) {
        val intent = Intent(this, MainActivity::class.java).apply {
            putExtra("selected_language", serializable)
        }
        startActivity(intent)
        finish()
    }
}