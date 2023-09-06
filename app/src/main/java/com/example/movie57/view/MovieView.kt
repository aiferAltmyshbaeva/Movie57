package com.example.movie57.view

import com.example.movie57.model.MovieModel

interface MovieView {

    fun showMovie(movieModel: MovieModel)
    fun showError(message: String)

}