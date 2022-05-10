package com.uerj.godev.view.ui.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.uerj.godev.R
import com.uerj.godev.databinding.FragmentDashboardBinding
import com.uerj.godev.view.adapter.ListLessonAdapter

class DashboardFragment : Fragment() {

    private lateinit var binding: FragmentDashboardBinding

    companion object {
        fun newInstance(bundle: Bundle = bundleOf()): DashboardFragment {
            val fragment = DashboardFragment()
            fragment.arguments = bundle
            return fragment
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentDashboardBinding.inflate(inflater, container, false)
        binding.recyclerViewListLesson.apply {
            layoutManager = LinearLayoutManager(context)
            adapter = ListLessonAdapter(::startLessonFragment)
        }
        return binding.root
    }

    private fun startLessonFragment() {
        val fragment = LessonFragment.newInstance()
        parentFragmentManager
            .beginTransaction()
            .addToBackStack(null)
            .replace(R.id.container, fragment)
            .commit()
    }
}