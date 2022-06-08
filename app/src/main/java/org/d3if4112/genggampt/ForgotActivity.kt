package org.d3if4112.genggampt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Window
import org.d3if4112.genggampt.databinding.ActivityLoginBinding
import org.d3if4112.genggampt.databinding.ActivityMainBinding
import org.d3if4112.genggampt.databinding.ActivityResetPasswordBinding

class ForgotActivity : AppCompatActivity() {

    private lateinit var binding: ActivityResetPasswordBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        requestWindowFeature(Window.FEATURE_NO_TITLE)
        supportActionBar?.hide()

        binding = ActivityResetPasswordBinding.inflate(layoutInflater)
        setContentView(binding.root)

//        binding.bottomNavigationView;

    }
}