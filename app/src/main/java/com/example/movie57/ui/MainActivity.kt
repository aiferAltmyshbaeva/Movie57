package com.example.movie57.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import by.kirich1409.viewbindingdelegate.viewBinding
import coil.load
import com.example.movie57.R
import com.example.movie57.databinding.ActivityMainBinding
import com.example.movie57.model.MovieModel
import com.example.movie57.presenter.Presenter
import com.example.movie57.view.MovieView
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity(R.layout.activity_main), MovieView {

    private val binding: ActivityMainBinding by viewBinding()

    @Inject
    lateinit var presenter: Presenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        presenter.attachView(this)
        initClickers()
    }

    private fun initClickers() {
        binding.findBtn.setOnClickListener {
            presenter.getMovieDetails(binding.titleEd.text.toString())
        }
    }

    override fun showMovie(movieModel: MovieModel) {
        Log.e("ololo", "showMovie: $movieModel")
        binding.posterImg.load(movieModel.Poster)
    }

    override fun showError(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }
}