package com.example.cloneyoutube

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.cloneyoutube.databinding.ItemVideoBinding
import java.time.Duration
import java.time.LocalDateTime

class VideoAdapter(val items : MutableList<VideoData>) : RecyclerView.Adapter<VideoAdapter.Holder>() {

    inner class Holder(binding: ItemVideoBinding) : RecyclerView.ViewHolder(binding.root){
        val tvTitle = binding.tvTitle
        val tvChData = binding.tvChData
        val ivThumb = binding.ivThumb
        val ivChIcon = binding.ivChIcon
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val binding = ItemVideoBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return Holder(binding)
    }

    interface ItemClick {
        fun onClick(view : View, position: Int){
            Log.i("onclick_test", "눌림")
        }
    }
    var itemClick : ItemClick? = null

    override fun onBindViewHolder(holder: Holder, position: Int) {

        val myItem = items[position]

        holder.tvTitle.text = myItem.title
        holder.ivThumb.setImageResource(myItem.thumb)
        holder.ivChIcon.setImageResource(myItem.chIcon)

        val chName = myItem.chName
        val viewNumSimple = simplizeViewNum(myItem.viewNum)
        val uploadDateTimeSimple = simplizeDateTime(myItem.yy, myItem.MM, myItem.dd, myItem.hh, myItem.mm)
        holder.tvChData.text = "${chName} ● ${viewNumSimple} ● ${uploadDateTimeSimple}"

        holder.itemView.setOnClickListener {
            itemClick?.onClick(it, position)
            Log.i ("onclick_test",position.toString())
        }
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }
}


