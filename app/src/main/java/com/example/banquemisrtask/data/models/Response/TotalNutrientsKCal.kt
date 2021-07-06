package com.example.banquemisrtask.data.Models.response


import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName


data class TotalNutrientsKCal(
    @SerializedName("CHOCDF_KCAL")
    @Expose
    val cHOCDFKCAL: CHOCDFKCAL?,
    @SerializedName("ENERC_KCAL")
    @Expose
    val eNERCKCAL: ENERCKCALXXX?,
    @SerializedName("FAT_KCAL")
    @Expose
    val fATKCAL: FATKCAL?,
    @SerializedName("PROCNT_KCAL")
    @Expose
    val pROCNTKCAL: PROCNTKCAL?
)