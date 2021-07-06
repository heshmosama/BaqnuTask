package com.example.banquemisrtask.domain.entites.response

data class NutritionEntity(
    val ingredients :List<IngredientEntity>,
    val totalNutrition : TotalNutritionEntity
)
