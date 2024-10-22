package com.example.appfindyourdreamhouse

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.appfindyourdreamhouse.databinding.ActivityDetailsPostHouseBinding
import com.example.appfindyourdreamhouse.databinding.ActivityMainBinding

class DetailsPostHouse : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityDetailsPostHouseBinding.inflate(layoutInflater)
//        enableEdgeToEdge()
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(binding.main) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val housePostItem = intent.getParcelableExtra<HousePost>("house")
        println("check $housePostItem")
        val tvDescribe = binding.tvDescribe
        val imgHouse = binding.imgvHouse
        val titleHouse = binding.tvTitleHouse
        val streetName = binding.tvStreetName
        val price = binding.tvPrice
        val monthlyRent = binding.tvMonthlyRent

        titleHouse.text = housePostItem?.titleHouse
        streetName.text = housePostItem?.streetName
        price.text = housePostItem?.price
        monthlyRent.text = housePostItem?.monthlyRent
        housePostItem?.imgHouse?.let {imgHouse.setImageResource(it)}
        val buttonBack = binding.imgBack
        buttonBack.setOnClickListener{
            finish()
        }
    }
}