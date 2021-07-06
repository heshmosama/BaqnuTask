package com.example.banquemisrtask.presentation.mainscreen


import android.util.Log
import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.*
import com.example.banquemisrtask.core.utils.DataState
import com.example.banquemisrtask.core.utils.SingleLiveEvent
import com.example.banquemisrtask.domain.entites.response.NutritionEntity
import com.example.banquemisrtask.domain.usecases.MainUseCase
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.launch
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach


@ExperimentalCoroutinesApi
class SharedViewModel @ViewModelInject constructor(
    private val mainUseCase: MainUseCase,
) : ViewModel() {

    private val _response = SingleLiveEvent<NutritionEntity?>()
    val response: LiveData<NutritionEntity?> get() = _response

    private val _loading = SingleLiveEvent<Boolean>()
    val loading: LiveData<Boolean> = _loading

    private val _error = SingleLiveEvent<String>()
    val error: LiveData<String> get() = _error

    fun getNutritionDetails(ingrs: List<String>) =
        viewModelScope.launch {
            mainUseCase.getNutritionDetails(ingrs).onEach {
                when (it) {
                    is DataState.Loading -> {
                        _loading.value = true
                    }
                    is DataState.Success -> {
                        _loading.value = false
                        _response.value =it.data
                    }
                    is DataState.Error -> {
                        _loading.value = false
                        Log.e("serlization",it.exception.message.toString())
                        it.exception.message?.let { message ->
                            _error.value = message
                        }

                    }
                }
            }.launchIn(viewModelScope)


        }
}

