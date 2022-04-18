package com.uerj.godev.view.ui.activity

import android.content.Intent
import android.os.Bundle
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.uerj.godev.databinding.ActivityTrailBinding
import com.uerj.godev.view.adapter.ListTrailAdapter
import com.uerj.godev.view.util.Constants
import com.uerj.godev.view.util.ListOfLanguage
import java.io.Serializable

class TrailActivity : AppCompatActivity() {

    private lateinit var binding: ActivityTrailBinding
    private val list = ListOfLanguage.list

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
            putExtra(Constants.LANGUAGE_SELECTED, serializable)
        }
        startActivity(intent)
    }
}