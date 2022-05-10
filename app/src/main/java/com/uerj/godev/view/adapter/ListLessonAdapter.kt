package com.uerj.godev.view.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.uerj.godev.databinding.ListLessonItemBinding

class ListLessonAdapter(
    private val onClickLesson: () -> Unit
) : RecyclerView.Adapter<ListLessonAdapter.ListLessonViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListLessonViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val listItemBinding = ListLessonItemBinding.inflate(layoutInflater, parent, false)
        return ListLessonViewHolder(listItemBinding)
    }

    override fun onBindViewHolder(holder: ListLessonViewHolder, position: Int) {
        holder.bind()
    }

    override fun getItemCount(): Int {
        return 10
    }

    inner class ListLessonViewHolder(val binding: ListLessonItemBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind() {
            binding.cardLessonItem.setOnClickListener {
                onClickLesson.invoke()
            }
        }
    }
}