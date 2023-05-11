package com.natiqhaciyef.clot_mobile.data.roomdb

import androidx.room.Database
import androidx.room.RoomDatabase
import com.natiqhaciyef.clot_mobile.data.models.UserModel

@Database(entities = [UserModel::class], version = 1)
abstract class AppDatabase : RoomDatabase(){
    abstract fun getUserDao(): UserDao
}