package br.com.fiap.movies

import java.io.Serializable

data class Movies(
    val name: String,
    val sinopsis: String,
    val parentalRating: String,
    val genre: String,
    val duration: String,
    val inTheaters: Boolean
): Serializable
