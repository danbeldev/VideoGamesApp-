package com.example.feature_main.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.example.core_model.api.VideoGameItem
import com.example.feature_main.databinding.ItemVideoGameBinding

internal class VideoGamesAdapter(
    private val videoGames:List<VideoGameItem>
): RecyclerView.Adapter<VideoGamesViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VideoGamesViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = ItemVideoGameBinding.inflate(inflater, parent, false)

        return VideoGamesViewHolder(binding)
    }

    override fun onBindViewHolder(holder: VideoGamesViewHolder, position: Int) {
        val videoGame = videoGames[position]
        with(holder.binding){
            videoGameTitle.text = videoGame.name
            videoGameImage.load(videoGame.background_image)
        }
    }

    override fun getItemCount(): Int = videoGames.size
}

internal class VideoGamesViewHolder(
    val binding: ItemVideoGameBinding
): RecyclerView.ViewHolder(binding.root)
