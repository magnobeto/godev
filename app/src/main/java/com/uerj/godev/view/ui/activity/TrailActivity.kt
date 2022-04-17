package com.uerj.godev.view.ui.activity

import android.content.Intent
import android.os.Bundle
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.uerj.godev.R
import com.uerj.godev.databinding.ActivityTrailBinding
import com.uerj.godev.model.Language
import com.uerj.godev.view.adapter.ListTrailAdapter
import com.uerj.godev.view.ui.constants.Constants
import java.io.Serializable

class TrailActivity : AppCompatActivity() {

    private lateinit var binding: ActivityTrailBinding
    private val list = listOf(
        Language(Constants.ITEM_ALGORITHM),
        Language(Constants.ITEM_JAVASCRIPT, R.drawable.ic_icons8_javascript),
        Language(Constants.ITEM_PYTHON, R.drawable.ic_icons8_python),
        Language(name = Constants.ITEM_KOTLIN, icon = R.drawable.ic_icons8_kotlin, backGroundColorText = R.color.orange)
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
            putExtra(Constants.LANGUAGE_SELECTED, serializable)
        }
        startActivity(intent)
        finish()
    }
}