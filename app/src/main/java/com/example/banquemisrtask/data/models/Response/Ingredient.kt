package com.example.banquemisrtask.data.Models.response


import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName


data class Ingredient(
    @SerializedName("parsed")
    @Expose
    val parsed: List<Parsed>?,
    @SerializedName("text")
    @Expose
    val text: String?
)