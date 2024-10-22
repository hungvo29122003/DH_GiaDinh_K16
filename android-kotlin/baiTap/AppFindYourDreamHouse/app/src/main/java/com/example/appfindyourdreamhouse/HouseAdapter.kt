package com.example.appfindyourdreamhouse

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.appfindyourdreamhouse.databinding.CardHouseItemBinding

class HouseAdapter(private val list: MutableList<HousePost>) :
    RecyclerView.Adapter<HouseAdapter.HousePostViewHolder>() {
    var onItemClick: (Int) -> Unit = {}

    inner class HousePostViewHolder(val binding: CardHouseItemBinding) :
        RecyclerView.ViewHolder(binding.root) {

        init {
            binding.root.setOnClickListener {
                onItemClick.invoke(adapterPosition)
            }
        }

        fun onBind(housePost: HousePost) {
            binding.imgvDreamHouse1.setImageResource(housePost.imgHouse)
            binding.tvHouseTitle.text = housePost.titleHouse
            binding.tvStreetName.text = housePost.streetName
            binding.tvPrice.text = housePost.price
            binding.tvMonthlyRent.text = housePost.monthlyRent
        }
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): HousePostViewHolder {
        val binding = CardHouseItemBinding.inflate(LayoutInflater.from(parent.context))
        println("Check OnCreateViewHolder")
        return HousePostViewHolder(binding)
    }

    override fun onBindViewHolder(holder: HouseAdapter.HousePostViewHolder, position: Int) {
        holder.onBind(list[position])
        println("check: $position")
    }

    override fun getItemCount(): Int {
        return list.size
    }

}