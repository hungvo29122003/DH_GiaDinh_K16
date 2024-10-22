package com.example.appfindyourdreamhouse

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.appfindyourdreamhouse.databinding.ButtonitemBinding
import kotlinx.coroutines.delay

// Thay đổi này

class ButtonAdapter(private val list: MutableList<ButtonPost>) :
    RecyclerView.Adapter<ButtonAdapter.ButtonPostViewHolder>() {

    var onItemClick: (Int) -> Unit = {}
    var seletedPosition  = 0

    inner class ButtonPostViewHolder(val binding: ButtonitemBinding) : // Thay đổi này
        RecyclerView.ViewHolder(binding.root) {

        init {
            binding.root.setOnClickListener {
                onItemClick.invoke(layoutPosition) // Sử dụng adapterPosition thay vì layoutPosition
            }
             binding.btnText.setOnClickListener {
                notifyItemChanged(seletedPosition)
                 seletedPosition = layoutPosition
                 notifyItemChanged(seletedPosition)
            }
        }

        fun onBind(buttonPost: ButtonPost) {
            binding.btnText.apply {
                 text = buttonPost.text
                isSelected = seletedPosition == layoutPosition
                println("check $isSelected $seletedPosition $layoutPosition")
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ButtonPostViewHolder {
        val binding = ButtonitemBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        ) // Thay đổi này
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