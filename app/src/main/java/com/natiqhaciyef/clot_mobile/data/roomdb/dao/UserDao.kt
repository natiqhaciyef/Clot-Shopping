package com.natiqhaciyef.clot_mobile.data.roomdb.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.natiqhaciyef.clot_mobile.data.models.for_database.UserModel

@Dao
interface UserDao {

    @Query("SELECT * FROM user_table")
    suspend fun getAllUsers(): List<UserModel>

    @Query("SELECT * FROM user_table WHERE email = :email")
    suspend fun getUserByEmail(email: String): UserModel

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insertUser(userModel: UserModel)

    @Delete
    suspend fun deleteUser(userModel: UserModel)
}