package com.example.banquemisrtask.data.Models.response


import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName


data class TotalNutrients(
    @SerializedName("CA")
    @Expose
    val cA: CAXX?,
    @SerializedName("CHOCDF")
    @Expose
    val cHOCDF: CHOCDFXX?,
    @SerializedName("CHOLE")
    @Expose
    val cHOLE: CHOLEXX?,
    @SerializedName("ENERC_KCAL")
    @Expose
    val eNERCKCAL: ENERCKCALXX?,
    @SerializedName("FAMS")
    @Expose
    val fAMS: FAMSX?,
    @SerializedName("FAPU")
    @Expose
    val fAPU: FAPUX?,
    @SerializedName("FASAT")
    @Expose
    val fASAT: FASATXX?,
    @SerializedName("FAT")
    @Expose
    val fAT: FATXX?,
    @SerializedName("FE")
    @Expose
    val fE: FEXX?,
    @SerializedName("FOLAC")
    @Expose
    val fOLAC: FOLACX?,
    @SerializedName("FOLDFE")
    @Expose
    val fOLDFE: FOLDFEXX?,
    @SerializedName("FOLFD")
    @Expose
    val fOLFD: FOLFDX?,
    @SerializedName("K")
    @Expose
    val k: KXX?,
    @SerializedName("MG")
    @Expose
    val mG: MGXX?,
    @SerializedName("NA")
    @Expose
    val nA: NAXX?,
    @SerializedName("NIA")
    @Expose
    val nIA: NIAXX?,
    @SerializedName("P")
    @Expose
    val p: PXX?,
    @SerializedName("PROCNT")
    @Expose
    val pROCNT: PROCNTXX?,
    @SerializedName("RIBF")
    @Expose
    val rIBF: RIBFXX?,
    @SerializedName("THIA")
    @Expose
    val tHIA: THIAXX?,
    @SerializedName("VITB12")
    @Expose
    val vITB12: VITB12XX?,
    @SerializedName("VITB6A")
    @Expose
    val vITB6A: VITB6AXX?,
    @SerializedName("VITC")
    @Expose
    val vITC: VITCXX?,
    @SerializedName("VITD")
    @Expose
    val vITD: VITDXX?,
    @SerializedName("WATER")
    @Expose
    val wATER: WATERX?,
    @SerializedName("ZN")
    @Expose
    val zN: ZNXX?,
    @SerializedName("FIBTG")
    @Expose
    val fibtg: FIBTG?,
    @SerializedName("SUGAR")
    @Expose
    val sugar: SUGAR?
)