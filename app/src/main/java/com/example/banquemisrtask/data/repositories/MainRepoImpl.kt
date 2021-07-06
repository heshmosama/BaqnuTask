package com.example.banquemisrtask.data.repositories

import com.example.banquemisrtask.data.Models.body.NutritionBody
import com.example.banquemisrtask.data.Models.response.NutritionResponse

import com.example.banquemisrtask.data.datasource.remotedatasource.NetworkService
import com.example.banquemisrtask.domain.repositories.MainRepo
import javax.inject.Inject
import javax.inject.Singleton


@Singleton
class MainRepoImpl @Inject constructor(
    val networkService: NetworkService,
) : MainRepo {
    override suspend fun getNutritionDetails(body: NutritionBody): NutritionResponse {
      return  networkService.getNutritionDetails(body = body)
    }

}