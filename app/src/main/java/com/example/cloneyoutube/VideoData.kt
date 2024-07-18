package com.example.cloneyoutube

import java.time.LocalDateTime

data class VideoData(val title:String, val chName:String, val thumb:Int, val chIcon:Int, val viewNum:Int, val yy:Int, val MM:Int, val dd:Int, val hh:Int, val mm:Int){
    constructor(title: String, chName: String, thumb: Int, chIcon: Int) :this(title, chName, thumb, chIcon, 100, 24, 7, 17, 22,30)
}

object VideoDataManager{
    val items = mutableListOf<VideoData>()

    fun getItems(){
        items.add( VideoData("영상을 업로드합니다","김은택", R.drawable.ic_launcher_background, R.drawable.ic_launcher_background) )
        items.add( VideoData("[특종] 영상을 업로드했습니다 (feat. 스파르타 코딩캠프)","마이채널", R.drawable.ic_launcher_background, R.drawable.ic_launcher_background, 330000, 2024, 3, 18, 10, 30 ))
        items.add( VideoData("영상을 업로드합니다","김은택", R.drawable.ic_launcher_background, R.drawable.ic_launcher_background) )
        items.add( VideoData("[특종] 영상을 업로드했습니다 (feat. 스파르타 코딩캠프)","마이채널", R.drawable.ic_launcher_background, R.drawable.ic_launcher_background, 330000, 2024, 3, 18, 10, 30 ))
        items.add( VideoData("영상을 업로드합니다","김은택", R.drawable.ic_launcher_background, R.drawable.ic_launcher_background) )
        items.add( VideoData("[특종] 영상을 업로드했습니다 (feat. 스파르타 코딩캠프)","마이채널", R.drawable.ic_launcher_background, R.drawable.ic_launcher_background, 330000, 2024, 3, 18, 10, 30 ))
        items.add( VideoData("영상을 업로드합니다","김은택", R.drawable.ic_launcher_background, R.drawable.ic_launcher_background) )
        items.add( VideoData("[특종] 영상을 업로드했습니다 (feat. 스파르타 코딩캠프)","마이채널", R.drawable.ic_launcher_background, R.drawable.ic_launcher_background, 330000, 2024, 3, 18, 10, 30 ))
        items.add( VideoData("영상을 업로드합니다","김은택", R.drawable.ic_launcher_background, R.drawable.ic_launcher_background) )
        items.add( VideoData("[특종] 영상을 업로드했습니다 (feat. 스파르타 코딩캠프)","마이채널", R.drawable.ic_launcher_background, R.drawable.ic_launcher_background, 330000, 2024, 3, 18, 10, 30 ))
        items.add( VideoData("영상을 업로드합니다","김은택", R.drawable.ic_launcher_background, R.drawable.ic_launcher_background) )
        items.add( VideoData("[특종] 영상을 업로드했습니다 (feat. 스파르타 코딩캠프)","마이채널", R.drawable.ic_launcher_background, R.drawable.ic_launcher_background, 330000, 2024, 3, 18, 10, 30 ))
        items.add( VideoData("영상을 업로드합니다","김은택", R.drawable.ic_launcher_background, R.drawable.ic_launcher_background) )
        items.add( VideoData("[특종] 영상을 업로드했습니다 (feat. 스파르타 코딩캠프)","마이채널", R.drawable.ic_launcher_background, R.drawable.ic_launcher_background, 330000, 2024, 3, 18, 10, 30 ))

    }
}