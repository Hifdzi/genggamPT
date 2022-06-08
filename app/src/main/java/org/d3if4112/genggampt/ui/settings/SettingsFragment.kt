package org.d3if4112.genggampt.ui.settings


import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import org.d3if4112.genggampt.LoginActivity

import org.d3if4112.genggampt.databinding.FragmentSettingBinding

class SettingsFragment : Fragment() {

    private lateinit var binding: FragmentSettingBinding
    private lateinit var viewModel: SettingsViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSettingBinding.inflate(layoutInflater, container, false)
        setHasOptionsMenu(true)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this).get(SettingsViewModel::class.java)
        // TODO: Use the ViewModel

        binding.btnlogin.setOnClickListener {
            var masukLogin = Intent(context,LoginActivity::class.java)
            startActivity(masukLogin)
        }


    }
}