package com.natiqhaciyef.clot_mobile.view.screen.registration.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import com.natiqhaciyef.clot_mobile.R
import com.natiqhaciyef.clot_mobile.databinding.FragmentResetPasswordBinding
import com.natiqhaciyef.clot_mobile.view.viewmodel.registration.RegistrationViewModel
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class ResetPasswordFragment : Fragment() {
    private lateinit var binding: FragmentResetPasswordBinding
    private val viewModel: RegistrationViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentResetPasswordBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.sendButton.setOnClickListener {
            val email = binding.emailTextResetPassword.text.toString()
            viewModel.resetPasswordUser(email)
        }
    }
}