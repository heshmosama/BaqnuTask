package com.example.banquemisrtask.domain.repositories

import com.example.banquemisrtask.data.Models.body.NutritionBody
import com.example.banquemisrtask.data.Models.response.NutritionResponse


interface MainRepo {
    suspend fun getNutritionDetails(body : NutritionBody) :NutritionResponse
}