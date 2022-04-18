package com.uerj.godev.model

import com.uerj.godev.R
import com.uerj.godev.view.ui.util.Constants
import java.io.Serializable

data class Language(
    val name: String = Constants.LANGUAGE_DEFAULT_NAME,
    val icon: Int = R.drawable.ic_baseline_playlist_add_24,
    val backGroundColorCard: Int = com.google.android.material.R.color.design_default_color_primary,
    val backGroundColorText: Int = com.google.android.material.R.color.design_default_color_primary,
    val animation: Int = R.raw.splash_animation,
    val animationMarginTop: Int = Constants.ANIMATION_MARGIN_TOP_DEFAULT,
    val animationMarginBotom: Int = Constants.ANIMATION_MARGIN_BOTTOM_DEFAULT,
    val animationHeight: Int = Constants.ANIMATION_HEIGHT_DEFAULT,
    val animationWidth: Int = Constants.ANIMATION_WIDTH_DEFAULT,
    val textTitle: Int = R.string.default_home_title,
    val textDescription: Int = R.string.default_home_description,
    val textColor: Int = R.color.white
) : Serializable

