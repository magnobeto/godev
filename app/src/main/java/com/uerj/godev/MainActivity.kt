package com.uerj.godev

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import androidx.core.splashscreen.SplashScreen
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setupSplashScreen()
        setContentView(R.layout.activity_main)
    }

    private fun setupSplashScreen() {
        val splashScreen = installSplashScreen()
        splashScreen.setKeepOnScreenCondition(setupSplashScreenListener())
    }

    private fun setupSplashScreenListener(): SplashScreen.KeepOnScreenCondition {
        SplashScreen.KeepOnScreenCondition {
            Thread.sleep(3000)
            false
        }.let {
            return  it
        }
    }
}
