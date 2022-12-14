package br.com.fernando.apppiadas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import br.com.fernando.apppiadas.databinding.ActivityMainBinding
import java.util.*

class MainActivity : AppCompatActivity() {

    private val binding: ActivityMainBinding by lazy { ActivityMainBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.btTellJoker.setOnClickListener {
            showjoker()
        }
    }

    private fun showjoker() {
        val jokers = resources.getStringArray( R.array.jokers)
        val numberJoker = Random().nextInt(jokers.size)
        val joker = jokers[numberJoker]
        binding.tvJoker.text = joker
    }


}