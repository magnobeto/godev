package com.uerj.godev.view.ui.util

import com.uerj.godev.R
import com.uerj.godev.model.Language

object ListOfLanguage {
    val list = listOf(
        Language(Constants.ITEM_ALGORITHM),
        Language(
            name = Constants.ITEM_JAVASCRIPT,
            icon = R.drawable.ic_icons8_javascript,
            backGroundColorText = R.color.minion_yellow,
            animation = R.raw.javascript_animation,
            animationMarginBotom = 200,
            animationHeight = 500,
            animationWidth = 500,
            textColor = R.color.black
        ),
        Language(Constants.ITEM_PYTHON, R.drawable.ic_icons8_python),
        Language(
            name = Constants.ITEM_KOTLIN,
            icon = R.drawable.ic_icons8_kotlin,
            backGroundColorText = R.color.indian_red,
            animation = R.raw.kotlin_animation,
            animationMarginTop = -400,
            textTitle = R.string.kotlin_home_title,
            textDescription = R.string.kotlin_home_description
        )
    )
}