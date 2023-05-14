package com.natiqhaciyef.clot_mobile.domain.local

import com.natiqhaciyef.clot_mobile.data.models.for_database.UserModel
import com.natiqhaciyef.clot_mobile.data.source.UserDataSource

class UserRepository(private var ds: UserDataSource) {

    suspend fun getAllUsers() = ds.getAllUsers()

    suspend fun getUserByEmail(email: String) = ds.getUserByEmail(email)

    suspend fun insertUser(userModel: UserModel) = ds.insertUser(userModel)

    suspend fun deleteUser(userModel: UserModel) = ds.deleteUser(userModel)

}