package com.example.ocean_jornada_android_kotlin_recyclerview_multithread

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rvPokemons = findViewById<RecyclerView>(R.id.rvPokemons)

        // Layout Manager
        rvPokemons.layoutManager = LinearLayoutManager(this)

        // Adapter
        val charmander = Pokemon(
            "charmander",
            "https://sm.ign.com/ign_br/screenshot/default/blob_bkmv.jpg")
        val Pikachu = Pokemon(
            "Pikachu",
            "https://t2.tudocdn.net/301383?w=1920")
        val listaPokemons = listOf(charmander, Pikachu, charmander)
        rvPokemons.adapter = PokemonsAdapter(listaPokemons)
    }
}