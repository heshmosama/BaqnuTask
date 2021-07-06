package com.example.banquemisrtask.domain.usecases

import com.example.banquemisrtask.core.utils.DataState
import com.example.banquemisrtask.data.Models.body.NutritionBody
import com.example.banquemisrtask.domain.entites.response.*
import com.example.banquemisrtask.domain.repositories.MainRepo
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlin.math.roundToInt
import kotlin.math.roundToLong


class MainUseCase(private val mainRepo: MainRepo) {
    val ingredients: MutableList<IngredientEntity> = mutableListOf()

        suspend fun getNutritionDetails(ingr: List<String>?): Flow<DataState<NutritionEntity>> = flow {
        emit(DataState.Loading)
        try {


            val response = mainRepo.getNutritionDetails(NutritionBody((ingr)))
            response.ingredients?.let {
                ingredients.clear()
                for (item in it) {
                    ingredients.add(
                        IngredientEntity(
                            text = item.text,
                            qty = item.parsed?.get(0)?.quantity?.roundToInt().toString(),
                            unit = item.parsed?.get(0)?.measure,
                            Food = item.parsed?.get(0)?.food,
                            calories = "${item.parsed?.get(0)?.nutrients?.eNERCKCAL?.quantity?.roundToLong()} ${
                                item.parsed?.get(
                                    0
                                )?.nutrients?.eNERCKCAL?.unit
                            }",
                            weight = item.parsed?.get(0)?.weight?.roundToLong().toString().plus(" g")
                        )
                    )
                }

            }


            val totalNutritionEntity = TotalNutritionEntity(
                totalNutritionlist = listOf(
                    GEntity(
                        response.totalNutrients?.eNERCKCAL?.label,
                        response.totalNutrients?.eNERCKCAL?.quantity?.roundToLong().toString(),
                        response.totalNutrients?.eNERCKCAL?.unit.toString(),
                    ),

                    GEntity(
                        response.totalNutrients?.fAT?.label,
                        response.totalNutrients?.fAT?.quantity?.roundToLong().toString(),
                        response.totalNutrients?.fAT?.unit.toString(),
                    ),
                    GEntity(
                        response.totalNutrients?.cHOLE?.label,
                        response.totalNutrients?.cHOLE?.quantity?.roundToLong().toString(),
                        response.totalNutrients?.cHOLE?.unit.toString(),
                    ),
                    GEntity(
                        response.totalNutrients?.cHOCDF?.label,
                        response.totalNutrients?.cHOCDF?.quantity?.roundToLong().toString(),
                        response.totalNutrients?.cHOCDF?.unit.toString(),
                    ),
                    GEntity(
                        response.totalNutrients?.fibtg?.label,
                        response.totalNutrients?.fibtg?.quantity?.roundToLong().toString(),
                        response.totalNutrients?.fibtg?.unit.toString(),
                    ),
                    GEntity(
                        response.totalNutrients?.sugar?.label,
                        response.totalNutrients?.sugar?.quantity?.roundToLong().toString(),
                        response.totalNutrients?.sugar?.unit.toString(),
                    ),
                    GEntity(
                        response.totalNutrients?.pROCNT?.label,
                        response.totalNutrients?.pROCNT?.quantity?.roundToLong().toString(),
                        response.totalNutrients?.pROCNT?.unit.toString(),
                    ),
                    GEntity(
                        response.totalNutrients?.nA?.label,
                        response.totalNutrients?.nA?.quantity?.roundToLong().toString(),
                        response.totalNutrients?.nA?.unit.toString(),
                    ),
                    GEntity(
                        response.totalNutrients?.vITD?.label,
                        response.totalNutrients?.vITD?.quantity?.roundToLong().toString(),
                        response.totalNutrients?.vITD?.unit.toString(),
                    ),
                    GEntity(
                        response.totalNutrients?.vITB12?.label,
                        response.totalNutrients?.vITB12?.quantity?.roundToLong().toString(),
                        response.totalNutrients?.vITB12?.unit.toString(),
                    ),
                    GEntity(
                        response.totalNutrients?.vITB6A?.label,
                        response.totalNutrients?.vITB6A?.quantity?.roundToLong().toString(),
                        response.totalNutrients?.vITB6A?.unit.toString(),
                    ),
                    GEntity(
                        response.totalNutrients?.vITC?.label,
                        response.totalNutrients?.vITC?.quantity?.roundToLong().toString(),
                        response.totalNutrients?.vITC?.unit.toString(),
                    ),
                    GEntity(
                        response.totalNutrients?.cA?.label,
                        response.totalNutrients?.cA?.quantity?.roundToLong().toString(),
                        response.totalNutrients?.cA?.unit.toString(),
                    ),
                    GEntity(
                        response.totalNutrients?.fE?.label,
                        response.totalNutrients?.fE?.quantity?.roundToLong().toString(),
                        response.totalNutrients?.fE?.unit.toString(),
                    ),
                    GEntity(
                        response.totalNutrients?.k?.label,
                        response.totalNutrients?.k?.quantity?.roundToLong().toString(),
                        response.totalNutrients?.k?.unit.toString(),
                    ),
                )
            )


            emit(
                DataState.Success(
                    NutritionEntity(
                        ingredients = ingredients,
                        totalNutrition = totalNutritionEntity
                    )
                )
            )
        } catch (e: Exception) {
            emit(DataState.Error(e))
        }
    }
}