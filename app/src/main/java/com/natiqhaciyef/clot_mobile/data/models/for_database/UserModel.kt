package com.natiqhaciyef.clot_mobile.data.models.for_database

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "user_table")
data class UserModel(
    @PrimaryKey(autoGenerate = true)
    var id: Int,
    var username: String,
    var email: String,
    var phone: String,
    var password: String
)