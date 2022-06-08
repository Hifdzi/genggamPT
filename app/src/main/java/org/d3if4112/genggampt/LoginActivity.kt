package org.d3if4112.genggampt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import org.d3if4112.genggampt.databinding.ActivityLoginBinding
import org.d3if4112.genggampt.databinding.ActivityMainBinding

class LoginActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

//        binding.bottomNavigationView;

    }
}