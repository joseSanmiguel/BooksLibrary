package com.example.recyclerview

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview.databinding.CardCeldaBinding

class cardAdapter(
    private val libros: List<libro>,
    private val clickListener: LibroClickListener
    )

    : RecyclerView.Adapter<CardViewHolder>()
{
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewHolder {
        val de = LayoutInflater.from(parent.context)
        val binding = CardCeldaBinding.inflate(de,parent,false)
        return CardViewHolder(binding, clickListener)
    }

    override fun onBindViewHolder(holder: CardViewHolder, position: Int) {
        holder.traeLibro(libros[position])
    }

    override fun getItemCount(): Int = libros.size
}