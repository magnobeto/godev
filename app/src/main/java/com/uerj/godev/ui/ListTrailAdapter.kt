package com.uerj.godev.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.uerj.godev.databinding.ListItemBinding

class ListTrailAdapter(private val list: List<String> ) : RecyclerView.Adapter<ListTrailAdapter.ListTrailViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListTrailViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val listItemBinding = ListItemBinding.inflate(layoutInflater, parent, false)
        return ListTrailViewHolder(listItemBinding)
    }

    override fun onBindViewHolder(holder: ListTrailViewHolder, position: Int) {
        val listItem = list[position]
        holder.binding.nameItemTxt.text = listItem
    }

    override fun getItemCount(): Int {
        return list.size
    }

    inner class ListTrailViewHolder(val binding : ListItemBinding): RecyclerView.ViewHolder(binding.root) {

    }
}