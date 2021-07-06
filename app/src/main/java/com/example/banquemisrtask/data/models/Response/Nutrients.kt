package com.example.banquemisrtask.data.Models.response


import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName


data class Nutrients(
    @SerializedName("CA")
    @Expose
    val cA: CA?,
    @SerializedName("CHOCDF")
    @Expose
    val cHOCDF: CHOCDF?,
    @SerializedName("CHOLE")
    @Expose
    val cHOLE: CHOLE?,
    @SerializedName("ENERC_KCAL")
    @Expose
    val eNERCKCAL: ENERCKCAL?,
    @SerializedName("FAMS")
    @Expose
    val fAMS: FAMS?,
    @SerializedName("FAPU")
    @Expose
    val fAPU: FAPU?,
    @SerializedName("FASAT")
    @Expose
    val fASAT: FASAT?,
    @SerializedName("FAT")
    @Expose
    val fAT: FAT?,
    @SerializedName("FE")
    @Expose
    val fE: FE?,
    @SerializedName("FOLAC")
    @Expose
    val fOLAC: FOLAC?,
    @SerializedName("FOLDFE")
    @Expose
    val fOLDFE: FOLDFE?,
    @SerializedName("FOLFD")
    @Expose
    val fOLFD: FOLFD?,
    @SerializedName("K")
    @Expose
    val k: K?,
    @SerializedName("MG")
    @Expose
    val mG: MG?,
    @SerializedName("NA")
    @Expose
    val nA: NA?,
    @SerializedName("NIA")
    @Expose
    val nIA: NIA?,
    @SerializedName("P")
    @Expose
    val p: P?,
    @SerializedName("PROCNT")
    @Expose
    val pROCNT: PROCNT?,
    @SerializedName("RIBF")
    @Expose
    val rIBF: RIBF?,
    @SerializedName("THIA")
    @Expose
    val tHIA: THIA?,
    @SerializedName("VITB12")
    @Expose
    val vITB12: VITB12?,
    @SerializedName("VITB6A")
    @Expose
    val vITB6A: VITB6A?,
    @SerializedName("VITC")
    @Expose
    val vITC: VITC?,
    @SerializedName("VITD")
    @Expose
    val vITD: VITD?,
    @SerializedName("WATER")
    @Expose
    val wATER: WATER?,
    @SerializedName("ZN")
    @Expose
    val zN: ZN?
)