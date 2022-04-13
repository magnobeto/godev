package com.uerj.godev.view.ui.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.os.bundleOf
import androidx.databinding.DataBindingUtil
import com.uerj.godev.R
import com.uerj.godev.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_login)
        setOnCLickListeners()
    }

    private fun setOnCLickListeners() {
        binding.loginBtn.setOnClickListener {
            with(binding) {
                val bundle = bundleOf().apply {
                    emailInput.text.toString() to USER_NAME
                }
                navigateToTrailActivity(bundle)
            }
        }
    }
    private fun navigateToTrailActivity(bundle: Bundle?) {
        val intent = Intent(this, TrailActivity::class.java)
        startActivity(intent, bundle)
        finish()
    }

    companion object {
        private const val USER_NAME = "UserName"
    }
}