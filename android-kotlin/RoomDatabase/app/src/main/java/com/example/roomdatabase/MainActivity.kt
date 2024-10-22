package com.example.roomdatabase

import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat

import androidx.core.view.WindowInsetsCompat
import androidx.room.Room
import java.lang.Thread


class MainActivity : AppCompatActivity() {
    private lateinit var database: AppDatabase

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets

        }

        database = Room.databaseBuilder(applicationContext,AppDatabase::class.java,"database-name").build()
        val userDao = database.userDao()

        Thread {
            //thêm một người dùng mới
            val newUser = User(name = "Võ Phi Hùng", email = "acczinsv5@gmail.com", phone = "0352305995")
            userDao.insert(newUser)

            // lấy danh sách tất cả người dùng
            val users = userDao.getAll()

            //sử dụng danh sách người dùng lên textView
            users.forEach{user ->
                Log.d("user", "name: ${user.name}, email: ${user.email}, phone: ${user.phone}")
            }
        }.start()
    }
}