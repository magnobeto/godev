package com.uerj.godev.view.ui.util

import com.airbnb.lottie.LottieDrawable
import com.uerj.godev.R
import com.uerj.godev.model.Language

object ListOfLanguage {
    val list = listOf(
        Language(
            name = Constants.ITEM_ALGORITHM,
            animation = R.raw.code_review_algorithms,
            animationMarginTop = -1500,
            animationMarginRight = 80,
            animationMarginBotom = -1300,
            animationAutoLoop = LottieDrawable.INFINITE,
            textTitle = R.string.algorithms_home_title,
            textDescription = R.string.algorithms_home_description
        ),
        Language(
            name = Constants.ITEM_JAVASCRIPT,
            icon = R.drawable.ic_icons8_javascript,
            backGroundColorText = R.color.minion_yellow,
            animation = R.raw.javascript_animation,
            animationMarginBotom = 200,
            animationHeight = 500,
            animationWidth = 500,
            textColor = R.color.black,
            textTitle = R.string.javascript_home_title,
            textDescription = R.string.javascript_home_description
        ),
        Language(
            name = Constants.ITEM_PYTHON,
            icon = R.drawable.ic_icons8_python,
            backGroundColorText = R.color.palatinate_blue,
            animation = R.raw.python_animation_one,
            animationMarginTop = -1000,
            animationMarginBotom = -900,
            textTitle = R.string.pyhton_home_title,
            textDescription = R.string.python_home_description
        ),
        Language(
            name = Constants.ITEM_KOTLIN,
            icon = R.drawable.ic_icons8_kotlin,
            backGroundColorText = R.color.indian_red,
            animation = R.raw.kotlin_animation,
            animationMarginTop = -360,
            textTitle = R.string.kotlin_home_title,
            textDescription = R.string.kotlin_home_description
        )
    )
}