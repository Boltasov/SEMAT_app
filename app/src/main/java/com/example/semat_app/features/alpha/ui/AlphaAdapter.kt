package com.example.semat_app.features.alpha.ui

import android.media.audiofx.DynamicsProcessing
import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.semat_app.Test
import com.example.semat_app.databinding.StageItemBinding

class AlphaAdapter(private val onStageClick: (Test) -> Unit) : RecyclerView.Adapter<ViewHolder>() {

    var data: List<Test> = emptyList()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        Log.d("AlphaAdapter", "onCreateViewHolder")
        return  ViewHolder(
            StageItemBinding.inflate(
                LayoutInflater.from(parent.context), parent, false
            )
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        Log.d("AlphaAdapter", "onBindViewHolder $position")
        val item = data[position]
        with(holder.binding) {
            stageItemName.text = item.name
            stageItemNumber.text = item.number.toString()
            root.setOnClickListener {  onStageClick(item) }
        }
    }

    override fun getItemCount(): Int = data.size

}

class ViewHolder(val binding: StageItemBinding) : RecyclerView.ViewHolder(binding.root)