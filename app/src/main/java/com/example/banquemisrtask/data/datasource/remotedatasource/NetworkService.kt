package com.example.banquemisrtask.data.datasource.remotedatasource

import com.example.banquemisrtask.BuildConfig
import com.example.banquemisrtask.core.Constants.ApiConstants
import com.example.banquemisrtask.data.Models.body.NutritionBody
import com.example.banquemisrtask.data.Models.response.NutritionResponse
import retrofit2.http.Body
import retrofit2.http.POST
import retrofit2.http.Query


interface NetworkService {
    @POST(ApiConstants.NUTRITION_DETAILS)
    suspend fun getNutritionDetails(@Query("app_id") app_id :String = BuildConfig.app_id, @Query("app_key") app_key:String = BuildConfig.app_key, @Body body : NutritionBody  ) : NutritionResponse
}