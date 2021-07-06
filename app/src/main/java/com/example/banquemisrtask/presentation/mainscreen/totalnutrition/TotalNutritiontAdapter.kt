package com.example.banquemisrtask.presentation.mainscreen.totalnutrition

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.banquemisrtask.databinding.TotalnutritionItemBinding
import com.example.banquemisrtask.domain.entites.response.GEntity


class TotalNutritiontAdapter(private val list: List<GEntity>) :
    RecyclerView.Adapter<TotalNutritiontAdapter.TotalnutritionViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TotalnutritionViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return TotalnutritionViewHolder(
            TotalnutritionItemBinding.inflate(
                layoutInflater,
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: TotalnutritionViewHolder, position: Int) {
        holder.bind(list[position])
    }

    override fun getItemCount(): Int {
        return list.size
    }

    class  TotalnutritionViewHolder
    constructor(
        private val binding: TotalnutritionItemBinding,
    ) : RecyclerView.ViewHolder(binding.root) {

        fun bind(item: GEntity) = with(itemView) {
            binding.model = item
            binding.executePendingBindings()
        }
    }
}
