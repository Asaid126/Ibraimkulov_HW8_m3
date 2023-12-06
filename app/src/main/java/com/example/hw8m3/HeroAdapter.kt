package com.example.hw8m3

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.hw8m3.databinding.ItemListBinding


class HeroAdapter(val HeroList: List<Hero>, val onClick: (h: Hero) -> Unit) :
    RecyclerView.Adapter<HeroAdapter.RmViewHolder>() {

    inner class RmViewHolder(private val binding: ItemListBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind() {
            val item = HeroList[adapterPosition]

            binding.apply {
                tvLife.text = item.life
                tvName.text = item.name
                imgPicture.setImageResource(item.picture)
            // Glide.with(imgPicture).load(item.picture).into(imgPicture)
            }
            itemView.setOnClickListener {
                onClick.invoke(item)
            }

        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RmViewHolder {
        return RmViewHolder(
            ItemListBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        )
    }

    override fun onBindViewHolder(holder: RmViewHolder, position: Int) {
        holder.bind()
    }

    override fun getItemCount(): Int {
        return HeroList.size
    }
}