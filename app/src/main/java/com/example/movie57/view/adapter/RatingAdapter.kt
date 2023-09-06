package com.example.movie57.view.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.movie57.databinding.ItemRatingBinding
import com.example.movie57.model.RatingModel

class RatingAdapter : RecyclerView.Adapter<RatingAdapter.RatingViewHolder>() {

    private var list: List<RatingModel> = listOf()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RatingViewHolder {
        return RatingViewHolder(
            ItemRatingBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: RatingViewHolder, position: Int) {
        holder.bind(list[position])
    }

    override fun getItemCount(): Int {
        return list.size
    }

    fun updateRating(newRating: List<RatingModel>){
        list = newRating
        notifyDataSetChanged()
    }

    inner class RatingViewHolder(private val binding: ItemRatingBinding) :
        ViewHolder(binding.root) {
        fun bind(model: RatingModel) {
            binding.tvSource.text = model.Source
            binding.tvValue.text = model.Value
        }

    }

}