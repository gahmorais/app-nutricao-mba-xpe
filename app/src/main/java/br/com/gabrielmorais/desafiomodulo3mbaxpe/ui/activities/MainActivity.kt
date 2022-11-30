package br.com.gabrielmorais.desafiomodulo3mbaxpe.ui.activities

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.view.size
import androidx.navigation.NavController
import androidx.navigation.NavDestination
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import br.com.gabrielmorais.desafiomodulo3mbaxpe.R
import br.com.gabrielmorais.desafiomodulo3mbaxpe.databinding.ActivityMainBinding
import br.com.gabrielmorais.desafiomodulo3mbaxpe.ui.fragments.MainFragmentDirections

class MainActivity : AppCompatActivity() {
  private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(binding.root)

  }

  fun setToolbarTitle(title: String) {
    binding.toolbar.apply {
      this.title = title
      setTitleTextColor(Color.WHITE)
    }
  }
}