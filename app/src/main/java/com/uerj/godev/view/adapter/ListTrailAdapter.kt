package com.uerj.godev.view.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.uerj.godev.R
import com.uerj.godev.databinding.ListItemBinding
import com.uerj.godev.model.Language

class ListTrailAdapter(
    private val context: Context,
    private val list: List<Language>,
    private val clickListener: (Language) -> Unit
) :
    RecyclerView.Adapter<ListTrailAdapter.ListTrailViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListTrailViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val listItemBinding = ListItemBinding.inflate(layoutInflater, parent, false)
        return ListTrailViewHolder(listItemBinding)
    }

    override fun onBindViewHolder(holder: ListTrailViewHolder, position: Int) {
        val listItem = list[position]
        holder.bind(listItem, clickListener)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    inner class ListTrailViewHolder(val binding: ListItemBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(listItem: Language, clickListener: (Language) -> Unit) {
            binding.apply {
                cardItem.background = ContextCompat.getDrawable(context, R.drawable.rounded_corner)
                cardItem.backgroundTintList = ContextCompat.getColorStateList(
                    context,
                    com.google.android.material.R.color.design_default_color_primary
                )
                nameItemTxt.text = listItem.name
                imageButton.setBackgroundResource(listItem.icon)
                cardItem.setOnClickListener {
                    clickListener(listItem)
                }
            }
        }

    }
}