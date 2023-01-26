package br.eng.pedro_mendes.happy_birthday_card

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import br.eng.pedro_mendes.happy_birthday_card.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)
    }
}