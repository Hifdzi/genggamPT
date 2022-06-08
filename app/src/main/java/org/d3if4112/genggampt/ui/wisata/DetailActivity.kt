package org.d3if4112.genggampt.ui.wisata

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import org.d3if4112.genggampt.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val actionBar = supportActionBar
        actionBar?.setDisplayHomeAsUpEnabled(true)

        //GET INTENT
        val i = this.intent

        //RECEIVE DATA
        val images = i.extras!!.getInt("images")
        val name = i.extras!!.getString("title")
        val desc = i.extras!!.getString("deskripsi")
        val maps = i.extras!!.getString("link")

        // Set title bar
        title = name

        //BIND DATA
        binding.thumbnail.setImageResource(images)
        binding.title.text = name
        binding.deskripsi.text = desc

        binding.buttonmaps.setOnClickListener {
            val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse(maps))
            startActivity(browserIntent)
        }

    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return super.onSupportNavigateUp()
    }

    override fun onBackPressed() {
        // disini gw harus balikin lagi datanya & pake putextra
        // biar pas balik2 datanya masih ada, karena passing data
        this.finish()
    }
}