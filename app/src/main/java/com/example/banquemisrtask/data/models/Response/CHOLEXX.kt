package com.example.banquemisrtask.data.Models.response


import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName


data class CHOLEXX(
    @SerializedName("label")
    @Expose
    val label: String?,
    @SerializedName("quantity")
    @Expose
    val quantity: Double?,
    @SerializedName("unit")
    @Expose
    val unit: String?
)