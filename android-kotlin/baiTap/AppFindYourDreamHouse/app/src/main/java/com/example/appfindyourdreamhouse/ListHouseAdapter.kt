package com.example.appfindyourdreamhouse

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.appfindyourdreamhouse.databinding.ListHouseBinding

class ListHouseAdapter(private val list: MutableList<ListHousePost>) :
    RecyclerView.Adapter<ListHouseAdapter.ListHousePostViewHolder>() {
    var onItemClick: (Int) -> Unit = {}

    inner class ListHousePostViewHolder(var binding: ListHouseBinding) :
        RecyclerView.ViewHolder(binding.root) {

        init {
            binding.root.setOnClickListener {
                onItemClick.invoke(adapterPosition)
            }
        }

        fun onBind(listHousePost: ListHousePost){
            binding.imgHouse.setImageResource(listHousePost.imgHouse)
            binding.tvTitleHouse.text = listHousePost.titleHouse
            binding.tvPriceHouseText.text = listHousePost.price
            binding.tvMonthlyRentText.text = listHousePost.monthly_Rent
            binding.btnSeeDetails.text = listHousePost.textButton
        }
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ListHousePostViewHolder {
        val binding = ListHouseBinding.inflate(LayoutInflater.from(parent.context))
        println("Check OnCreateViewHolder")
        return ListHousePostViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ListHouseAdapter.ListHousePostViewHolder, position: Int) {
        holder.onBind(list[position])
        println("Check: $position")
    }

    override fun getItemCount(): Int {
        return  list.size
    }
}