package com.example.banquemisrtask.presentation.mainscreen.ingredients

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.banquemisrtask.databinding.IngredientsItemBinding
import com.example.banquemisrtask.domain.entites.response.IngredientEntity


class IngredientAdapter(private val list: List<IngredientEntity>) :
    RecyclerView.Adapter<IngredientAdapter.IngredientViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): IngredientViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return IngredientViewHolder(
            IngredientsItemBinding.inflate(
                layoutInflater,
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: IngredientViewHolder, position: Int) {
        holder.bind(list[position])
    }

    override fun getItemCount(): Int {
        return list.size
    }

    class IngredientViewHolder
    constructor(
        private val binding: IngredientsItemBinding,
    ) : RecyclerView.ViewHolder(binding.root) {

        fun bind(item: IngredientEntity) = with(itemView) {
            binding.model = item
            binding.executePendingBindings()
        }
    }
}
