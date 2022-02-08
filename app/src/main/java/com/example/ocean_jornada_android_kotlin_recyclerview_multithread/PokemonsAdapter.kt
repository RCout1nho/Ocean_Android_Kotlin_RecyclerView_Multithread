package com.example.ocean_jornada_android_kotlin_recyclerview_multithread

import androidx.recyclerview.widget.RecyclerView

data class Pokemon(val nome: String, val imagemUrl: String)

class PokemonsAdapter(val itens: List<Pokemon>) : RecyclerView.Adapter<PokemonsAdapter.ViewHoldeer> {

}