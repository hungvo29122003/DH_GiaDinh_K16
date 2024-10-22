package com.example.roomdatabase

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface UserDao {
    @Query("select * from users")
    fun getAll(): List<User>

    @Insert
    fun insert(user: User)
}