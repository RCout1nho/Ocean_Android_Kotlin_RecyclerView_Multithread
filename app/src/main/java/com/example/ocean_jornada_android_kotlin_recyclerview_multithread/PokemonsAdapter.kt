package com.example.ocean_jornada_android_kotlin_recyclerview_multithread

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

data class Pokemon(val nome: String, val imagemUrl: String)

class PokemonsAdapter(val itens: List<Pokemon>) :
    RecyclerView.Adapter<PokemonsAdapter.ViewHolder>() {
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bindView(item: Pokemon) = with(itemView) {
            val tvNome = findViewById<TextView>(R.id.tvNome)
            val ivPokemon = findViewById<ImageView>(R.id.ivPokemon)

            tvNome.text = item.nome
            Glide.with(this).load(item.imagemUrl).into(ivPokemon)
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)

        val view = layoutInflater.inflate(R.layout.pokemon_item, parent, false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = itens[position]

        holder.bindView(item)
    }

    override fun getItemCount(): Int {
        return itens.count()
    }


}