package br.com.gabrielmorais.desafiomodulo3mbaxpe.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.navigation.NavDestination
import androidx.navigation.NavDirections
import androidx.navigation.fragment.findNavController
import br.com.gabrielmorais.desafiomodulo3mbaxpe.databinding.FragmentMainBinding
import br.com.gabrielmorais.desafiomodulo3mbaxpe.ui.activities.MainActivity

class MainFragment : Fragment() {
  private lateinit var binding: FragmentMainBinding
  override fun onCreateView(
    inflater: LayoutInflater,
    container: ViewGroup?,
    savedInstanceState: Bundle?
  ): View? {
    binding = FragmentMainBinding.inflate(LayoutInflater.from(requireContext()))
    configureDestinationButtons()
    return binding.root

  }

  private fun configureDestinationButtons() {
    binding.apply {
      btnNutritionEval.setOnClickListener {
        goToDestination(
          MainFragmentDirections.actionMainFragmentToNutritionEvalFragment()
        )

      }
      btnNutritionGuidance.setOnClickListener {
        goToDestination(
          MainFragmentDirections.actionMainFragmentToNutritionGuidanceFragment()
        )
      }

      btnFoodList.setOnClickListener {
        goToDestination(
          MainFragmentDirections.actionMainFragmentToFoodListFragment()
        )
      }
      findNavController().addOnDestinationChangedListener { controller, destination, arguments ->
        val activity = requireActivity() as MainActivity
        activity.setToolbarTitle(destination.label.toString())
      }
    }
  }

  private fun goToDestination(directions: NavDirections) {
    findNavController().navigate(directions)
  }
}