package com.example.movie57.presenter

import com.example.movie57.model.MovieApi
import com.example.movie57.model.MovieModel
import com.example.movie57.view.DetailView
import com.example.movie57.view.MovieView
import javax.inject.Inject

class DetailPresenter @Inject constructor(private val movieApi: MovieApi) {

    lateinit var detailView: DetailView

    fun attachView(view: DetailView) {
        this.detailView = view
    }

    fun getData(movieModel: MovieModel) {
        detailView.showMovie(movieModel)
    }
}