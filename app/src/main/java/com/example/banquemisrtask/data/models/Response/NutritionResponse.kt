package com.example.banquemisrtask.data.Models.response


import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName


data class NutritionResponse(
    @SerializedName("calories")
    @Expose
    val calories: Int?,
    @SerializedName("cautions")
    @Expose
    val cautions: List<Any>?,
    @SerializedName("dietLabels")
    @Expose
    val dietLabels: List<String>?,
    @SerializedName("glycemicIndex")
    @Expose
    val glycemicIndex: Int?,
    @SerializedName("healthLabels")
    @Expose
    val healthLabels: List<String>?,
    @SerializedName("ingredients")
    @Expose
    val ingredients: List<Ingredient>,
    @SerializedName("totalDaily")
    @Expose
    val totalDaily: TotalDaily?,
    @SerializedName("totalNutrients")
    @Expose
    val totalNutrients: TotalNutrients?,
    @SerializedName("totalNutrientsKCal")
    @Expose
    val totalNutrientsKCal: TotalNutrientsKCal?,
    @SerializedName("totalWeight")
    @Expose
    val totalWeight: Double?,
    @SerializedName("uri")
    @Expose
    val uri: String?,
    @SerializedName("yield")
    @Expose
    val yield: Int?
)