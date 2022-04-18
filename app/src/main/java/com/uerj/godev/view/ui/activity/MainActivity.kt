package com.uerj.godev.view.ui.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.uerj.godev.R
import com.uerj.godev.databinding.ActivityMainBinding
import com.uerj.godev.model.Language
import com.uerj.godev.view.util.Constants
import com.uerj.godev.view.ui.fragment.DashboardFragment
import com.uerj.godev.view.ui.fragment.HomeFragment
import com.uerj.godev.view.ui.fragment.NotificationsFragment
import com.uerj.godev.viewmodel.MainActivityViewModel

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var viewModel: MainActivityViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel = ViewModelProvider(this)[MainActivityViewModel::class.java]
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val language: Language = intent.extras?.get(Constants.LANGUAGE_SELECTED) as Language
        viewModel.setLanguageSelected(language)
        observe()
        startHome()
        initBotton()
    }

    private fun initBotton() {
        binding.navView.setOnItemSelectedListener {
            when (it.itemId) {
                R.id.navigation_home -> startHome()
                R.id.navigation_dashboard -> startDash()
                R.id.navigation_notifications -> startNotification()
                else -> true
            }
        }
    }

    private fun startHome(): Boolean {
        val fragment = HomeFragment.newInstance(language = getLanguageSelected())
        supportFragmentManager.beginTransaction()
            .replace(R.id.container, fragment)
            .commit()

        return true
    }

    private fun startDash(): Boolean {
        val fragment = DashboardFragment.newInstance()
        supportFragmentManager.beginTransaction()
            .replace(R.id.container, fragment)
            .commit()

        return true
    }

    private fun startNotification(): Boolean {
        val fragment = NotificationsFragment.newInstance()
        supportFragmentManager.beginTransaction()
            .replace(R.id.container, fragment)
            .commit()

        return true
    }

    private fun observe() {
        with(viewModel) {
            languageSelected.observe(this@MainActivity, Observer { optionSelected ->
                title = optionSelected.name
            })
        }
    }

    private fun getLanguageSelected(): Language {
        return viewModel.languageSelected.value ?: Language()
    }
}