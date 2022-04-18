package com.uerj.godev.view.ui.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.uerj.godev.databinding.FragmentDashboardBinding
import com.uerj.godev.view.adapter.ListLessonAdapter
import com.uerj.godev.view.adapter.ListTrailAdapter

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
            adapter = ListLessonAdapter()
        }
        return binding.root
    }
}