package com.uerj.godev.view.ui.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import androidx.core.content.ContextCompat
import androidx.core.os.bundleOf
import androidx.core.view.marginTop
import androidx.core.view.updateLayoutParams
import androidx.fragment.app.Fragment
import com.uerj.godev.R
import com.uerj.godev.databinding.FragmentHomeBinding
import com.uerj.godev.model.Language

class HomeFragment(private val language: Language) : Fragment() {

    private lateinit var binding: FragmentHomeBinding

    companion object {
        fun newInstance(bundle: Bundle = bundleOf(), language: Language): HomeFragment {
            val fragment = HomeFragment(language)
            fragment.arguments = bundle
            return fragment
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentHomeBinding.inflate(inflater, container, false)
        setupView()
        return binding.root
    }

    private fun setupView() {
        with(binding) {
            languageTitleAnimation.setAnimation(language.animation)
            val layoutParams = languageTitleAnimation.layoutParams as LinearLayout.LayoutParams
            layoutParams.height = language.animationHeight
            layoutParams.width = language.animationWidth
            layoutParams.topMargin = language.animationMarginTop
            layoutParams.bottomMargin = language.animationMarginBotom
            languageTitleAnimation.layoutParams = layoutParams
            titleHomeTxt.setText(language.textTitle)
            titleHomeTxt.background =
                ContextCompat.getDrawable(requireContext(), R.drawable.rounded_corner)
            titleHomeTxt.backgroundTintList = ContextCompat.getColorStateList(
                requireContext(),
                language.backGroundColorText
            )
            titleHomeTxt.setTextColor(ContextCompat.getColor(requireContext(), language.textColor))
            descriptionHomeTxt.setText(language.textDescription)
            descriptionHomeTxt.background =
                ContextCompat.getDrawable(requireContext(), R.drawable.rounded_corner)
            descriptionHomeTxt.backgroundTintList = ContextCompat.getColorStateList(
                requireContext(),
                language.backGroundColorText
            )
            descriptionHomeTxt.setTextColor(
                ContextCompat.getColor(
                    requireContext(),
                    language.textColor
                )
            )
        }
    }
}