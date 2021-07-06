package com.example.banquemisrtask.core.utils


import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.banquemisrtask.domain.entites.response.GEntity
import com.example.banquemisrtask.domain.entites.response.IngredientEntity
import com.example.banquemisrtask.presentation.mainscreen.ingredients.IngredientAdapter
import com.example.banquemisrtask.presentation.mainscreen.totalnutrition.TotalNutritiontAdapter


@BindingAdapter("ingredientlist")
fun bindIngredientsList(recyclerView: RecyclerView, list: List<IngredientEntity>?) {
    list?.let { recyclerView.adapter = IngredientAdapter(it) }
}

@BindingAdapter("gEntitysList")
fun bindGEntitysList(recyclerView: RecyclerView,totalNutritionlist : List<GEntity>?) {
    totalNutritionlist?.let { recyclerView.adapter = TotalNutritiontAdapter(it) }
}

//@BindingAdapter("moviesList")
//fun bindMoviesList(recyclerView: RecyclerView, list: List<Movie>?) {
//    list?.let { (recyclerView.adapter as MovieAdapter).submitList(list) }
//}