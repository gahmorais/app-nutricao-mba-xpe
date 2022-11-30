package br.com.gabrielmorais.desafiomodulo3mbaxpe.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import br.com.gabrielmorais.desafiomodulo3mbaxpe.R
import br.com.gabrielmorais.desafiomodulo3mbaxpe.databinding.FragmentFoodListBinding


class FoodListFragment : Fragment() {
  private lateinit var binding: FragmentFoodListBinding

  override fun onCreateView(
    inflater: LayoutInflater, container: ViewGroup?,
    savedInstanceState: Bundle?
  ): View? {
    binding = FragmentFoodListBinding.inflate(LayoutInflater.from(requireContext()))
    return binding.root
  }

}