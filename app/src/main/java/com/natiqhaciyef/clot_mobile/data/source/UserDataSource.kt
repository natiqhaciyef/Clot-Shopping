package com.natiqhaciyef.clot_mobile.data.source

import com.natiqhaciyef.clot_mobile.data.models.UserModel
import com.natiqhaciyef.clot_mobile.data.roomdb.UserDao
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class UserDataSource(private var dao: UserDao) {
    suspend fun getAllUsers() = withContext(Dispatchers.IO){
        dao.getAllUsers()
    }

    suspend fun getUserByEmail(email: String) = withContext(Dispatchers.IO){
        dao.getUserByEmail(email)
    }

    suspend fun insertUser(userModel: UserModel) = withContext(Dispatchers.IO){
        dao.insertUser(userModel)
    }

    suspend fun deleteUser(userModel: UserModel) = withContext(Dispatchers.IO){
        dao.deleteUser(userModel)
    }
}