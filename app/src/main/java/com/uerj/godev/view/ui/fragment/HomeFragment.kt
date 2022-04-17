package com.uerj.godev.view.ui.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.core.os.bundleOf
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
        with(binding) {
            languageTitleAnimation.setAnimation(language.animationTop)
            titleHomeTxt.setText(language.textTitle)
            titleHomeTxt.background =
                ContextCompat.getDrawable(requireContext(), R.drawable.rounded_corner)
            titleHomeTxt.backgroundTintList = ContextCompat.getColorStateList(
                requireContext(),
                language.backGroundColorText
            )
            descriptionHomeTxt.setText(language.textDescription)
            descriptionHomeTxt.background =
                ContextCompat.getDrawable(requireContext(), R.drawable.rounded_corner)
            descriptionHomeTxt.backgroundTintList = ContextCompat.getColorStateList(
                requireContext(),
                language.backGroundColorText
            )
        }
        return binding.root
    }
}