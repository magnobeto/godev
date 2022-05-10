package com.uerj.godev.view.ui.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import com.uerj.godev.databinding.FragmentLessonBinding

class LessonFragment : Fragment() {

    private lateinit var binding: FragmentLessonBinding

    companion object {
        fun newInstance(bundle: Bundle = bundleOf()): LessonFragment {
            val fragment = LessonFragment()
            fragment.arguments = bundle
            return fragment
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentLessonBinding.inflate(inflater, container, false)
        return binding.root
    }
}