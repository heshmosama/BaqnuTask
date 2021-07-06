package com.example.banquemisrtask.presentation.mainscreen.homescreen

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.example.banquemisrtask.R
import com.example.banquemisrtask.databinding.FragmentHomeBinding
import com.example.banquemisrtask.presentation.mainscreen.SharedViewModel
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.ExperimentalCoroutinesApi

@ExperimentalCoroutinesApi
@AndroidEntryPoint
class HomeFragment : Fragment(),HomeInteractions {
    private lateinit var fragmentHomeBinding: FragmentHomeBinding
    private lateinit var  viewModel: SharedViewModel
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        viewModel = ViewModelProvider(requireActivity()).get(SharedViewModel::class.java)
        fragmentHomeBinding = FragmentHomeBinding.inflate(inflater, container, false)
        fragmentHomeBinding.interactions = this
        fragmentHomeBinding.lifecycleOwner = this
        fragmentHomeBinding.viewmodel = viewModel
        collectData()
        return fragmentHomeBinding.root
    }

    fun collectData() {
        viewModel.response.observe(viewLifecycleOwner, Observer {
            findNavController().navigate(R.id.action_homeFragment_to_ingredientsFragment)
        })

        viewModel.error.observe(viewLifecycleOwner, Observer {
            Toast.makeText(requireContext(),it,Toast.LENGTH_SHORT).show()
        })
    }

    override fun onAnalyzeClick() {
        val ingers  = fragmentHomeBinding.tlIngredients.editText?.text.toString().split(
            "\n"
        )
        viewModel.getNutritionDetails(ingers)
    }

}