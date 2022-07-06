package com.example.recyclerview

var libroList = mutableListOf<libro>()

val LIBRO_ID_EXTRA = "libroExtra"

class libro(
    var cover: Int,
    var title: String,
    var description: String,
    var notes: String,
    val id: Int? = libroList.size)