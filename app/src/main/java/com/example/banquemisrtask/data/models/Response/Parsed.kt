package com.example.banquemisrtask.data.Models.response


import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName


data class Parsed(
    @SerializedName("food")
    @Expose
    val food: String?,
    @SerializedName("foodId")
    @Expose
    val foodId: String?,
    @SerializedName("foodMatch")
    @Expose
    val foodMatch: String?,
    @SerializedName("measure")
    @Expose
    val measure: String?,
    @SerializedName("measureURI")
    @Expose
    val measureURI: String?,
    @SerializedName("nutrients")
    @Expose
    val nutrients: Nutrients,
    @SerializedName("quantity")
    @Expose
    val quantity: Double?,
    @SerializedName("retainedWeight")
    @Expose
    val retainedWeight: Double?,
    @SerializedName("specificFoodURI")
    @Expose
    val specificFoodURI: String?,
    @SerializedName("status")
    @Expose
    val status: String?,
    @SerializedName("weight")
    @Expose
    val weight: Double?
)