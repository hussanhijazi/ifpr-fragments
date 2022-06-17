package br.com.hussan.ifprfragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import androidx.annotation.ColorRes
import androidx.core.content.ContextCompat
import br.com.hussan.ifprfragments.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivityMainBinding.inflate(LayoutInflater.from(this))
    }

    private val colorOptionsFragment by lazy {
        supportFragmentManager.findFragmentById(R.id.color_options_fragment) as ColorOptionsFragment
    }

    private val colorFragment by lazy {
        supportFragmentManager.findFragmentById(R.id.color_fragment) as ColorFragment
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(binding.root)
    }

    fun setColor(@ColorRes color: Int) {
        colorFragment.view?.setBackgroundColor(ContextCompat.getColor(this, color))
    }
}