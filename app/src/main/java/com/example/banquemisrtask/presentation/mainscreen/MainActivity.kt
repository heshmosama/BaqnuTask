package com.example.banquemisrtask.presentation.mainscreen

import android.app.PendingIntent.getActivity
import android.content.Context
import android.content.ContextWrapper
import android.graphics.BlendMode
import android.graphics.BlendModeColorFilter
import android.graphics.Color
import android.os.Build
import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.databinding.DataBindingUtil
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.example.banquemisrtask.R

import com.example.banquemisrtask.databinding.ActivityMainBinding
import com.google.android.material.internal.ContextUtils
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.ExperimentalCoroutinesApi
import java.util.*

@ExperimentalCoroutinesApi
@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private lateinit var mainBinding: ActivityMainBinding
    private lateinit var navController: NavController
    private lateinit var appBarConfiguration: AppBarConfiguration

    private lateinit var navlistner: NavController.OnDestinationChangedListener
    private val viewModel: SharedViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        mainBinding = DataBindingUtil.setContentView(
            this, R.layout.activity_main
        )
        setSupportActionBar(mainBinding.mainToolBar)
        navController = findNavController(R.id.nav_host_fragment)
        mainBinding.mainToolBar.setupWithNavController(navController)

    }


}