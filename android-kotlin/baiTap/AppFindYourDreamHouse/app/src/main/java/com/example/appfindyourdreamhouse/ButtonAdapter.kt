package com.example.appfindyourdreamhouse

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.appfindyourdreamhouse.databinding.ButtonitemBinding
// Thay đổi này

class ButtonAdapter(private val list: MutableList<ButtonPost>) :
    RecyclerView.Adapter<ButtonAdapter.ButtonPostViewHolder>() {

    var onItemClick: (Int) -> Unit = {}

    inner class ButtonPostViewHolder(val binding: ButtonitemBinding) : // Thay đổi này
        RecyclerView.ViewHolder(binding.root) {

        init {
            binding.root.setOnClickListener {
                onItemClick.invoke(adapterPosition) // Sử dụng adapterPosition thay vì layoutPosition
            }
        }

        fun onBind(buttonPost: ButtonPost) {
            binding.btnText.text = buttonPost.text
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ButtonPostViewHolder {
        val binding = ButtonitemBinding.inflate(LayoutInflater.from(parent.context), parent, false) // Thay đổi này
        println("check OnCreateViewHolder: ")
        return ButtonPostViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: ButtonPostViewHolder, position: Int) {
        holder.onBind(list[position])
        println("check : $position")
    }
}