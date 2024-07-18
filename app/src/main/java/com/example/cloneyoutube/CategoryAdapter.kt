package com.example.cloneyoutube

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.cloneyoutube.databinding.ItemCategoryBinding

class CategoryAdapter (val items:MutableList<CategoryData>) : RecyclerView.Adapter<CategoryAdapter.Holder>() {
    inner class Holder (val binding: ItemCategoryBinding) : RecyclerView.ViewHolder(binding.root){
        val background = binding.clBackground
        val text = binding.tvText
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val binding = ItemCategoryBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return Holder(binding)
    }

    interface ItemClick {
        fun onClick (view : View, position : Int)
    }
    var itemClick :ItemClick? = null

    override fun onBindViewHolder(holder: Holder, position: Int) {
        holder.text.text = CategoryDataManager.items[position].text

        holder.itemView.setOnClickListener {
            itemClick?.onClick(it, position)
        }
    }

    override fun getItemCount(): Int {
        return CategoryDataManager.items.size
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

}

data class CategoryData (val text:String)

object CategoryDataManager {
    val items = mutableListOf<CategoryData>()

    fun getItems(){
        items.add((CategoryData("전체")))
        items.add((CategoryData("뉴스")))
        items.add((CategoryData("라이브")))
        items.add((CategoryData("음악")))
        items.add((CategoryData("게임")))
        items.add((CategoryData("믹스")))
        items.add((CategoryData("최근에 업로드된 동영상")))
        items.add((CategoryData("새로운 맞춤 동영상")))
        items.add((CategoryData("의견 보내기")))
    }
}