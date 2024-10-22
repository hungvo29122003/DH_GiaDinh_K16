package com.example.appfindyourdreamhouse

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.setPadding
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ItemDecoration
import com.example.appfindyourdreamhouse.databinding.ActivityMainBinding
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // khởi tạo binding
        var binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        enableEdgeToEdge()
        ViewCompat.setOnApplyWindowInsetsListener(binding.main) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val buttons = mutableListOf(
            ButtonPost("Bachelor", isSelected = false),
            ButtonPost("Family", isSelected = false),
            ButtonPost("Office", isSelected = false),
            ButtonPost("Sublet", isSelected = false),
            ButtonPost("Abc", isSelected = false)
        )
        val buttonAdapter = ButtonAdapter(buttons)
        //        val rcvButtonItem = binding.rcvBtnItem
        //        rcvButtonItem.adapter = buttonAdapter
        binding.rcvBtnItem.adapter = buttonAdapter
        binding.rcvBtnItem.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        val listHouse = mutableListOf(
            HousePost(
                "Dreamsville House",
                "Jl. Sultan Iskandar Muda",
                "Monthly Rent",
                "$3,850",
                R.drawable.img_house
            ),
            HousePost(
                "Dreamsville House",
                "Jl. Sultan Iskandar Muda",
                "Monthly Rent",
                "$4,850",
                R.drawable.img_house1
            ),
            HousePost(
                "Dreamsville House",
                "Jl. Sultan Iskandar Muda",
                "Monthly Rent",
                "$3,850",
                R.drawable.img_house1
            ),
            HousePost(
                "Dreamsville House",
                "Jl. Sultan Iskandar Muda",
                "Monthly Rent",
                "$3,850",
                R.drawable.img_house1
            )
        )
        var houseAdapter = HouseAdapter(listHouse)
        binding.rcvCardHouse.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        binding.rcvCardHouse.adapter = houseAdapter
        houseAdapter.onItemClick = { position ->
            println("check: ${listHouse.get(position)}")
            val intent = Intent(this, DetailsPostHouse::class.java)
            intent.putExtra("house", listHouse.get(position))
            startActivity(intent)
        }

        var listHouseCard = mutableListOf(
            ListHousePost(
                "ABCD",
                "Monthly Rent",
                "$3,980",
                R.drawable.img_house,
                "See Details"
            ),
            ListHousePost(
                "ABCA",
                "Monthly Rent",
                "$3,990",
                R.drawable.img_house,
                "See Details"
            ),
            ListHousePost(
                "ABCC",
                "Monthly Rent",
                "$3,920",
                R.drawable.img_house,
                "See Details"
            ),
            ListHousePost(
                "ABC",
                "Monthly Rent",
                "$3,910",
                R.drawable.img_house,
                "See Details"
            ),
            ListHousePost(
                "ABC",
                "Monthly Rent",
                "$3,900",
                R.drawable.img_house,
                "See Details"
            ),
        )
        var listHouseAdapter = ListHouseAdapter(listHouseCard)
        binding.rcvListHouseCard.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        binding.rcvListHouseCard.adapter = listHouseAdapter
    }
}