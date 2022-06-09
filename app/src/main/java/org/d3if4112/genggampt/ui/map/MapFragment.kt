package org.d3if4112.genggampt.ui.map

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import org.d3if4112.genggampt.databinding.FragmentMapBinding

class MapFragment : Fragment() {

    private lateinit var binding: FragmentMapBinding
    private lateinit var viewModel: MapViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMapBinding.inflate(layoutInflater, container, false)
        setHasOptionsMenu(true)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this).get(MapViewModel::class.java)
        // TODO: Use the ViewModel

        binding.btnmaps.setOnClickListener {
            requireActivity().startActivity(
                Intent(
                    Intent.ACTION_VIEW,
                    Uri.parse("https://www.google.com/maps/search/wisata+bandung+terdekat/@-6.9173146,107.6101118,12z/data=!3m1!4b1")
                )
            )
        }

        binding.btnsearchmap.setOnClickListener {
            requireActivity().startActivity(
                Intent(
                    Intent.ACTION_VIEW,
                    Uri.parse("https://www.google.com/maps/place/Bandung,+Kota+Bandung,+Jawa+Barat/@-6.9034443,107.5731164,12z/data=!3m1!4b1!4m5!3m4!1s0x2e68e6398252477f:0x146a1f93d3e815b2!8m2!3d-6.9174639!4d107.6191228?hl=id")
                )
            )
        }
    }
}