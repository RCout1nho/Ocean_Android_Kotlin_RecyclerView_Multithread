package com.example.ocean_jornada_android_kotlin_recyclerview_multithread

import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

data class Pokemon(val nome: String, val imagemUrl: String)

class PokemonsAdapter(val itens: List<Pokemon>) : RecyclerView.Adapter<PokemonsAdapter.ViewHoldeer>() {
    class ViewHoldeer(itemView: View) : RecyclerView.ViewHolder(itemView) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHoldeer {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: ViewHoldeer, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }


}