package com.example.cloneyoutube

import android.util.Log
import android.view.LayoutInflater
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

    override fun onBindViewHolder(holder: Holder, position: Int) {

        val myItem = items[position]

        holder.tvTitle.text = myItem.title
        holder.ivThumb.setImageResource(myItem.thumb)
        holder.ivChIcon.setImageResource(myItem.chIcon)

        val chName = myItem.chName
        val viewNumSimple = simplizeViewNum(myItem.viewNum)
        val uploadDateTimeSimple = simplizeDateTime(myItem.yy, myItem.MM, myItem.dd, myItem.hh, myItem.mm)
        holder.tvChData.text = "${chName} ● ${viewNumSimple} ● ${uploadDateTimeSimple}"

//        Log.i("item_test", items.toString())
        Log.i ("item_test", myItem.toString())
    }
    fun simplizeViewNum(viewNum:Int):String{
        if (viewNum<1000){
            return "${viewNum}회"
        } else if (viewNum<10000){
            return "${(viewNum/100).toFloat()/10}천회"
        } else if (viewNum<100000){
            return "${(viewNum/1000).toFloat()/10}만회"
        } else {
            return "${viewNum/10000}만회"
        }
    }

    fun simplizeDateTime(yy:Int, MM:Int, dd:Int, hh:Int, mm:Int):String{
        val uploadDateTime = LocalDateTime.of(yy, MM, dd, hh, mm) //파라미터로 받아온 업로드 시각
        val duration: Duration = Duration.between(uploadDateTime, LocalDateTime.now()) // 현재 시간과 차이 계산

        val days = duration.toDays().toInt()
        val hours = (duration.toHours()%24).toInt()

        if (hours < 24){
            return "${hours}시간 전"
        } else if (days < 30)  {
            return "${days}일 전"
        } else if (days < 365) {
            return "${days%30}개월 전"
        } else {
            return "${days % 365}년 전"
        }

    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }
}
