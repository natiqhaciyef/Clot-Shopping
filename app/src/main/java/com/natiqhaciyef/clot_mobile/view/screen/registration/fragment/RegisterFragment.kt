package com.natiqhaciyef.clot_mobile.view.screen.registration.fragment

import android.os.Bundle
import android.text.method.HideReturnsTransformationMethod
import android.text.method.PasswordTransformationMethod
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.natiqhaciyef.clot_mobile.R
import com.natiqhaciyef.clot_mobile.data.models.UserModel
import com.natiqhaciyef.clot_mobile.databinding.FragmentRegisterBinding
import com.natiqhaciyef.clot_mobile.view.viewmodel.registration.RegistrationViewModel
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class RegisterFragment : Fragment() {
    private lateinit var binding: FragmentRegisterBinding
    private val viewModel: RegistrationViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentRegisterBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setup()

        binding.registerButton.setOnClickListener {
            val username = binding.usernameTextRegister.text.toString()
            val email = binding.emailTextRegister.text.toString()
            val phone = binding.phoneTextRegister.text.toString()
            val password = binding.passwordTextRegister.text.toString()
            viewModel.registerUser(userModel = UserModel(
                id = 0,
                username = username,
                phone = phone,
                email = email,
                password = password
            ))
        }

        binding.goToLogin.setOnClickListener {
            findNavController().navigate(R.id.loginFragment)
        }
    }

    private fun setup(){
        binding.visibleIcon.setOnClickListener {
            binding.passwordTextRegister.transformationMethod = PasswordTransformationMethod.getInstance()
            binding.visibleIcon.visibility = View.GONE
            binding.visibleOffIcon.visibility = View.VISIBLE
        }
        binding.visibleOffIcon.setOnClickListener {
            binding.passwordTextRegister.transformationMethod = HideReturnsTransformationMethod.getInstance()
            binding.visibleOffIcon.visibility = View.GONE
            binding.visibleIcon.visibility = View.VISIBLE
        }
    }

}