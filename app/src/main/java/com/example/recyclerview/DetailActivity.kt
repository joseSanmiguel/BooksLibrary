package com.example.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.recyclerview.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDetailBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val libroId = intent.getIntExtra(LIBRO_ID_EXTRA, -1)
        val libro = libroDeId(libroId)
        if(libro != null)
        {
            binding.cover.setImageResource(libro.cover)
            binding.namePhoto.text = libro.title
            binding.description.text = libro.description
            binding.notes.text = libro.notes
        }
    }
    private  fun libroDeId(libroId: Int): libro?
    {
        for (libro in libroList)
        {
            if(libro.id == libroId)
                return libro
        }
        return null
    }
}