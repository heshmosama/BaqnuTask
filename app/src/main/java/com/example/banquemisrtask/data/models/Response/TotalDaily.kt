package com.example.banquemisrtask.data.Models.response


import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName


data class TotalDaily(
    @SerializedName("CA")
    @Expose
    val cA: CAX?,
    @SerializedName("CHOCDF")
    @Expose
    val cHOCDF: CHOCDFX?,
    @SerializedName("CHOLE")
    @Expose
    val cHOLE: CHOLEX?,
    @SerializedName("ENERC_KCAL")
    @Expose
    val eNERCKCAL: ENERCKCALX?,
    @SerializedName("FASAT")
    @Expose
    val fASAT: FASATX?,
    @SerializedName("FAT")
    @Expose
    val fAT: FATX?,
    @SerializedName("FE")
    @Expose
    val fE: FEX?,
    @SerializedName("FOLDFE")
    @Expose
    val fOLDFE: FOLDFEX?,
    @SerializedName("K")
    @Expose
    val k: KX?,
    @SerializedName("MG")
    @Expose
    val mG: MGX?,
    @SerializedName("NA")
    @Expose
    val nA: NAX?,
    @SerializedName("NIA")
    @Expose
    val nIA: NIAX?,
    @SerializedName("P")
    @Expose
    val p: PX?,
    @SerializedName("PROCNT")
    @Expose
    val pROCNT: PROCNTX?,
    @SerializedName("RIBF")
    @Expose
    val rIBF: RIBFX?,
    @SerializedName("THIA")
    @Expose
    val tHIA: THIAX?,
    @SerializedName("VITB12")
    @Expose
    val vITB12: VITB12X?,
    @SerializedName("VITB6A")
    @Expose
    val vITB6A: VITB6AX?,
    @SerializedName("VITC")
    @Expose
    val vITC: VITCX?,
    @SerializedName("VITD")
    @Expose
    val vITD: VITDX?,
    @SerializedName("ZN")
    @Expose
    val zN: ZNX?
)