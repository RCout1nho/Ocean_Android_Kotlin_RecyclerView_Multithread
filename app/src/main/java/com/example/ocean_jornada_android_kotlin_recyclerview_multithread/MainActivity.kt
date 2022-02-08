package com.example.ocean_jornada_android_kotlin_recyclerview_multithread

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ImageView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import java.lang.Exception
import java.net.URL

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

        // Exemplos de Multithread

//        val ivImagem = findViewById<ImageView>(R.id.ivImagem)
        // Rodar tudo isso em outra thread
//        Thread(Runnable {
//            val url = "Qualquer URL de imagem"
//            val imagem = carregarImagem(url)
//
//
//            ivImagem.post{
//                // De volta na main thread
//                ivImagem.setImageBitmap(imagem)
//            }
//        }).start()

    }

    private fun carregarImagem(urlImagem: String): Bitmap? {
        try{
            val url = URL(urlImagem)

            val conteudoUrl = url.openConnection().getInputStream()

            return BitmapFactory.decodeStream(conteudoUrl)
        }catch(e: Exception){
            // Deu erro

            return null
        }

    }
}