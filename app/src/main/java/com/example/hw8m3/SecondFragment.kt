package com.example.hw8m3

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bumptech.glide.Glide
import com.example.hw8m3.databinding.FragmentSecondBinding

class SecondFragment : Fragment() {
    private lateinit var binding: FragmentSecondBinding
    private lateinit var navArgs: SecondFragmentArgs

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSecondBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        arguments?.let {
            navArgs = SecondFragmentArgs.fromBundle(it)
            Log.e("ololo","bundle=$it")
        }
        binding.tvName.text = navArgs.rickMorty.name
        binding.tvLife.text = navArgs.rickMorty.life
        binding.imgCharacter.setImageResource(navArgs.rickMorty.picture)
       // Glide.with(imgPicture).load(navArgs..picture).into(imgPicture)
       // Glide.with(binding.imgPhotoHero).load(navArgs.naruto.image).into(binding.imgPhotoHero)
       // Glide.with(binding.imgPicture).load(heroes.image).into(binding.imgPhotoHero)
        //  Glide.with(imgPicture).load(item.picture).into(imgPicture)
    }
}