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
import com.natiqhaciyef.clot_mobile.databinding.FragmentLoginBinding
import com.natiqhaciyef.clot_mobile.view.viewmodel.registration.RegistrationViewModel
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class LoginFragment : Fragment() {
    private lateinit var binding: FragmentLoginBinding
    private val viewModel: RegistrationViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentLoginBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setup()

        binding.loginButton.setOnClickListener {
            val email = binding.emailTextLogin.text.toString()
            val password = binding.passwordTextLogin.text.toString()
            viewModel.loginUser(email, password)
        }

        binding.goToRegister.setOnClickListener {
            findNavController().navigate(R.id.registerFragment)
        }
    }

    private fun setup(){
        binding.visibleIcon.setOnClickListener {
            binding.passwordTextLogin.transformationMethod = PasswordTransformationMethod.getInstance()
            binding.visibleIcon.visibility = View.GONE
            binding.visibleOffIcon.visibility = View.VISIBLE
        }
        binding.visibleOffIcon.setOnClickListener {
            binding.passwordTextLogin.transformationMethod = HideReturnsTransformationMethod.getInstance()
            binding.visibleOffIcon.visibility = View.GONE
            binding.visibleIcon.visibility = View.VISIBLE
        }
    }
}