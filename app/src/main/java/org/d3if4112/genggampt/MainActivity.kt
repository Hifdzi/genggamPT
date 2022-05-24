package org.d3if4112.genggampt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import org.d3if4112.genggampt.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.bottomNavigationView;

    }
}