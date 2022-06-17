package br.com.hussan.ifprfragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import br.com.hussan.ifprfragments.databinding.ColorOptionsFragmentBinding

class ColorOptionsFragment : Fragment() {
    private lateinit var binding: ColorOptionsFragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = ColorOptionsFragmentBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val mainActivity = activity as MainActivity

        binding.run {
            btnBlack.setOnClickListener { mainActivity.setColor(R.color.black) }
            btnBlue.setOnClickListener { mainActivity.setColor(R.color.purple_700) }
            btnGreen.setOnClickListener { mainActivity.setColor(android.R.color.holo_green_dark) }
            btnRed.setOnClickListener { mainActivity.setColor(android.R.color.holo_red_dark) }
            btnYellow.setOnClickListener { mainActivity.setColor(R.color.yellow) }
        }
    }
}