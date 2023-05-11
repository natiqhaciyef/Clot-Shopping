package com.natiqhaciyef.clot_mobile.view.viewmodel.registration

import androidx.lifecycle.viewModelScope
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase
import com.natiqhaciyef.clot_mobile.data.models.UserModel
import com.natiqhaciyef.clot_mobile.domain.local.UserRepository
import com.natiqhaciyef.clot_mobile.view.viewmodel.BaseViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class RegistrationViewModel @Inject constructor(
    var userRepo: UserRepository
) : BaseViewModel() {
    val auth = Firebase.auth

    fun registerUser(userModel: UserModel) {
        auth.createUserWithEmailAndPassword(
            userModel.email,
            userModel.password
        )
            .addOnSuccessListener {
                registerForLocalDB(userModel)
            }
            .addOnFailureListener {

            }
    }

    fun loginUser(email: String, password: String) {
        auth.signInWithEmailAndPassword(email, password)
            .addOnSuccessListener {

            }
            .addOnFailureListener {

            }
    }

    fun resetPasswordUser(email: String){
        auth.sendPasswordResetEmail(email)
            .addOnSuccessListener {

            }
            .addOnFailureListener {

            }
    }

    private fun registerForLocalDB(userModel: UserModel){
        viewModelScope.launch(Dispatchers.IO) {
            userRepo.insertUser(userModel)
        }
    }
}