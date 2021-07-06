package com.example.banquemisrtask.data.Models.body


import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class NutritionBody(
    @SerializedName("ingr")
    @Expose
    val ingr: List<String>?
)