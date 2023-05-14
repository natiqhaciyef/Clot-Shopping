package com.natiqhaciyef.clot_mobile.data.roomdb

import androidx.room.Database
import androidx.room.RoomDatabase
import com.natiqhaciyef.clot_mobile.data.models.for_database.ProductModelForDB
import com.natiqhaciyef.clot_mobile.data.models.for_database.UserModel
import com.natiqhaciyef.clot_mobile.data.roomdb.dao.ProductDao
import com.natiqhaciyef.clot_mobile.data.roomdb.dao.UserDao

@Database(entities = [UserModel::class, ProductModelForDB::class], version = 2)
abstract class AppDatabase : RoomDatabase(){
    abstract fun getUserDao(): UserDao
    abstract fun getProduct(): ProductDao
}