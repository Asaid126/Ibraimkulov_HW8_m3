package com.example.hw8m3

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.hw8m3.databinding.FragmentFirstBinding


class FirstFragment : Fragment() {
    private lateinit var binding: FragmentFirstBinding
    private lateinit var HeroList: ArrayList<Hero>


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentFirstBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        loadData()
        val adapter = HeroAdapter(HeroList, this::onItemClick)
        binding.recycleView.adapter = adapter
    }

    private fun loadData() {
        HeroList = ArrayList<Hero>()

        HeroList.apply {
            add(Hero(R.drawable.ricky,"Alive","Rick Sanchez"))
            add(Hero(R.drawable.morty,"Alive","Morty Smith"))
            add(Hero(R.drawable.albert,"Dead","Albert Einstein"))
            add(Hero(R.drawable.jerry,"Alive","Jerry Smith"))
        }

    }
    private fun onItemClick(rm: Hero){
        findNavController().navigate(FirstFragmentDirections.actionFirstFragmentToSecondFragment(rm))
    }

}