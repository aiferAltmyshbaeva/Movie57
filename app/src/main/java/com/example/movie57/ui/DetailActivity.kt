package com.example.movie57.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import by.kirich1409.viewbindingdelegate.viewBinding
import coil.load
import com.example.movie57.R
import com.example.movie57.databinding.ActivityDetailBinding
import com.example.movie57.model.MovieModel
import com.example.movie57.presenter.DetailPresenter
import com.example.movie57.view.DetailView
import com.example.movie57.view.adapter.RatingAdapter
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class DetailActivity : AppCompatActivity(R.layout.activity_detail), DetailView {

    private val binding: ActivityDetailBinding by viewBinding()

    @Inject
    lateinit var presenter: DetailPresenter

    private val adapter by lazy{RatingAdapter()}
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        presenter.attachView(this)
        binding.rvRating.adapter = adapter
        setupUI()
    }

    private fun setupUI() {
        val movieDetails = intent.getSerializableExtra("key") as MovieModel
        presenter.getData(movieDetails)
    }

    override fun showMovie(model: MovieModel) {
        with(binding) {
            tvTitle.text = model.Title
            tvAwards.text = model.Awards
            tvGenre.text = model.Genre
            tvYear.text = model.Year
            posterImg.load(model.Poster)
            adapter.updateRating(model.Ratings)
        }
    }
}