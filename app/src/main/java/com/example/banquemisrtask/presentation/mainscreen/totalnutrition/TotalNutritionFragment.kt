package com.example.banquemisrtask.presentation.mainscreen.totalnutrition

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.banquemisrtask.databinding.FragmentTotalnutritionBinding
import com.example.banquemisrtask.presentation.mainscreen.SharedViewModel
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.ExperimentalCoroutinesApi

@ExperimentalCoroutinesApi
@AndroidEntryPoint
class TotalNutritionFragment : Fragment() {
    private lateinit var fragmentBinding: FragmentTotalnutritionBinding
    private lateinit var viewModel: SharedViewModel
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        viewModel = ViewModelProvider(requireActivity()).get(SharedViewModel::class.java)
        fragmentBinding = FragmentTotalnutritionBinding.inflate(inflater, container, false)
        fragmentBinding.lifecycleOwner = this
        fragmentBinding.viewmodel = viewModel
        return fragmentBinding.root
    }





}