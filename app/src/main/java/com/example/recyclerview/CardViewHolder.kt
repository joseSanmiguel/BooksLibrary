package com.example.recyclerview

import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview.databinding.CardCeldaBinding

class CardViewHolder(
    private val cardCeldaBinding: CardCeldaBinding,
    private val clickListener: LibroClickListener
) :RecyclerView.ViewHolder(cardCeldaBinding.root)
{
    fun traeLibro(libro: libro){
        cardCeldaBinding.cover.setImageResource(libro.cover)
        cardCeldaBinding.namePhoto.text = libro.title
        cardCeldaBinding.description.text = libro.description

        cardCeldaBinding.cardView.setOnClickListener{
            clickListener.onClick(libro)
        }
    }
}