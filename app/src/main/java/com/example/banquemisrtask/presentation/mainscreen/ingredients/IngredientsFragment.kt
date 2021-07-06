package com.example.banquemisrtask.presentation.mainscreen.ingredients

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.example.banquemisrtask.R
import com.example.banquemisrtask.databinding.FragmentIngredientsBinding
import com.example.banquemisrtask.presentation.mainscreen.SharedViewModel
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.ExperimentalCoroutinesApi

@ExperimentalCoroutinesApi
@AndroidEntryPoint
class IngredientsFragment : Fragment(), IngredientInteractions {
    private lateinit var fragmentBinding: FragmentIngredientsBinding
    private lateinit var viewModel: SharedViewModel
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        viewModel = ViewModelProvider(requireActivity()).get(SharedViewModel::class.java)
        fragmentBinding = FragmentIngredientsBinding.inflate(inflater, container, false)
        fragmentBinding.lifecycleOwner = this
        fragmentBinding.viewmodel = viewModel
        fragmentBinding.interations = this
        return fragmentBinding.root
    }

    override fun onTotalNutritionClick() {
        findNavController().navigate(R.id.action_ingredientsFragment_to_totalNutritionFragment)
    }


}