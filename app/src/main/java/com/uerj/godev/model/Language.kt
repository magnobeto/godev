package com.uerj.godev.model

import com.uerj.godev.R

data class Language(
    val name: String,
    val icon: Int = R.drawable.ic_baseline_playlist_add_24,
    val backGroundColor: Int = com.google.android.material.R.color.design_default_color_primary
)
