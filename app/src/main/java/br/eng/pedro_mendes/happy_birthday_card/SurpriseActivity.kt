package br.eng.pedro_mendes.happy_birthday_card

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import br.eng.pedro_mendes.happy_birthday_card.databinding.ActivitySurpriseBinding

class SurpriseActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySurpriseBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySurpriseBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}