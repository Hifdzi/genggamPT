package org.d3if4112.genggampt.ui.home

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import org.d3if4112.genggampt.LoginActivity
import org.d3if4112.genggampt.R
import org.d3if4112.genggampt.databinding.FragmentHomeBinding
import org.d3if4112.genggampt.databinding.FragmentSettingBinding
import org.d3if4112.genggampt.ui.settings.SettingsViewModel
import org.d3if4112.genggampt.ui.wisata.DetailActivity

class HomeFragment : Fragment() {

    private lateinit var binding: FragmentHomeBinding
    private lateinit var viewModel: HomeViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeBinding.inflate(layoutInflater, container, false)
        setHasOptionsMenu(true)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this).get(HomeViewModel::class.java)
        // TODO: Use the ViewModel

        binding.wisata1.setOnClickListener {
            val wisata1 = Intent(context, DetailActivity::class.java)
            wisata1.putExtra("images", R.drawable.orchid_forest1)
            wisata1.putExtra("title", "Orchid Forest Cikole")
            wisata1.putExtra("deskripsi", "Orchid Forest Cikole adalah sebuah tempat wisata di tengah Hutan Pinus yang asri, di mana ribuan jenis anggrek dikembangkan dan dilestarikan.")
            wisata1.putExtra("link", "https://www.google.com/maps/place/Orchid+Forest+Cikole/@-6.780493,107.6352863,17z/data=!3m1!4b1!4m5!3m4!1s0x2e68e038e1a71607:0x79f858778d1e2e62!8m2!3d-6.780493!4d107.637475")
            startActivity(wisata1)
        }
        binding.wisata2.setOnClickListener {
            val wisata2 = Intent(context, DetailActivity::class.java)
            wisata2.putExtra("images", R.drawable.kawah1)
            wisata2.putExtra("title", "Kawah Putih")
            wisata2.putExtra("deskripsi", "Kawah Putih adalah tempat wisata di Bandung yang paling terkenal. Berlokasi di Ciwidey, Jawa Barat, kurang lebih sekitar 50 KM arah selatan kota Bandung.")
            wisata2.putExtra("link", "https://www.google.com/maps/place/Kawah+Putih+Lebak+Muncang+Bandung+Jabar/@-7.1436555,107.3959359,17z/data=!3m1!4b1!4m5!3m4!1s0x2e688c62bdec95ad:0xef9f051488fed458!8m2!3d-7.1436555!4d107.3981246")
            startActivity(wisata2)

        }
        binding.wisata3.setOnClickListener {
            val wisata3 = Intent(context, DetailActivity::class.java)
            wisata3.putExtra("images", R.drawable.tangkuper1)
            wisata3.putExtra("title", "Tangkuban Perahu")
            wisata3.putExtra("deskripsi", "Gunung Tangkuban Perahu ini adalah sebuah gunung yang terletak di Provinsi Jawa Barat yang berada sekitar 20 Km dari pusat kota Kembang, Bandung.")
            wisata3.putExtra("link", "https://www.google.com/maps/place/Gn.+Tangkuban+Parahu/@-6.7596375,107.6010259,15z/data=!3m1!4b1!4m5!3m4!1s0x2e68e1ddc59713db:0xa01c96b73428fedc!8m2!3d-6.7596377!4d107.6097807")
            startActivity(wisata3)

        }
        binding.wisata4.setOnClickListener {
            val wisata4 = Intent(context, DetailActivity::class.java)
            wisata4.putExtra("images", R.drawable.greatasiaafrica)
            wisata4.putExtra("title", "The Great Asia Africa")
            wisata4.putExtra("deskripsi", "The Great Asia Africa lembang bandung wisata keliling dunia seperti jepang dan korea dalam satu kawasan.")
            wisata4.putExtra("link", "https://www.google.com/maps/place/The+Great+Asia+Africa/@-6.8329455,107.6019028,17z/data=!3m1!4b1!4m5!3m4!1s0x2e68e15afd2a93ad:0xad35b2a8d387f68e!8m2!3d-6.8329455!4d107.6040915")
            startActivity(wisata4)

        }
        binding.wisata5.setOnClickListener {
            val wisata5 = Intent(context, DetailActivity::class.java)
            wisata5.putExtra("images", R.drawable.lembang)
            wisata5.putExtra("title", "Lembang Wonderland")
            wisata5.putExtra("deskripsi", "Tempat ini dirancang dengan konessep dunia mimpi,dimana didalamnya terdiri dari area magical forrest ,Sweet feel,Taman Ice Cream , dan Snow Village")
            wisata5.putExtra("link", "https://www.google.com/maps/place/LEMBANG+Wonderland/@-6.8172979,107.6099568,17z/data=!3m1!4b1!4m5!3m4!1s0x2e68e12960dfc0a3:0xa8f4f56d908395c1!8m2!3d-6.8172757!4d107.6121652?hl=id")
            startActivity(wisata5)

        }

        binding.btnmaps.setOnClickListener {
            requireActivity().startActivity(
                Intent(
                    Intent.ACTION_VIEW,
                    Uri.parse("https://www.google.com/maps/search/wisata+bandung+terdekat/@-6.9173146,107.6101118,12z/data=!3m1!4b1")
                )
            )
        }

        binding.btnmapshome.setOnClickListener {
            requireActivity().startActivity(
                Intent(
                    Intent.ACTION_VIEW,
                    Uri.parse("https://www.google.com/maps/place/Bandung,+Kota+Bandung,+Jawa+Barat/@-6.9034443,107.5731164,12z/data=!3m1!4b1!4m5!3m4!1s0x2e68e6398252477f:0x146a1f93d3e815b2!8m2!3d-6.9174639!4d107.6191228?hl=id")
                )
            )
        }

        binding.btnmapsearchshome.setOnClickListener {
            requireActivity().startActivity(
                Intent(
                    Intent.ACTION_VIEW,
                    Uri.parse("https://www.google.com/maps/place/Bandung,+Kota+Bandung,+Jawa+Barat/@-6.9034443,107.5731164,12z/data=!3m1!4b1!4m5!3m4!1s0x2e68e6398252477f:0x146a1f93d3e815b2!8m2!3d-6.9174639!4d107.6191228?hl=id")
                )
            )
        }


    }
}