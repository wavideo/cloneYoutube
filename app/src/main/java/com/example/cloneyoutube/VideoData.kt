package com.example.cloneyoutube

import android.os.Parcel
import android.os.Parcelable
import java.time.Duration
import java.time.LocalDateTime

data class VideoData(val title:String, val chName:String, val thumb:Int, val chIcon:Int, val viewNum:Int, val subscriberNum:Int, val yy:Int, val MM:Int, val dd:Int, val hh:Int, val mm:Int) :
    Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readString().toString(),
        parcel.readString().toString(),
        parcel.readInt(),
        parcel.readInt(),
        parcel.readInt(),
        parcel.readInt(),
        parcel.readInt(),
        parcel.readInt(),
        parcel.readInt(),
        parcel.readInt(),
        parcel.readInt()
    ) {
    }
    constructor(title: String, chName: String, thumb: Int, chIcon: Int, viewNum:Int, subscriberNum:Int, yy:Int, MM:Int, dd:Int) :this(title, chName, thumb, chIcon, viewNum, subscriberNum, yy, MM, dd, 0,0)

    override fun describeContents(): Int {
        TODO("Not yet implemented")
    }

    override fun writeToParcel(dest: Parcel, flags: Int) {
        TODO("Not yet implemented")
    }

    companion object CREATOR : Parcelable.Creator<VideoData> {
        override fun createFromParcel(parcel: Parcel): VideoData {
            return VideoData(parcel)
        }

        override fun newArray(size: Int): Array<VideoData?> {
            return arrayOfNulls(size)
        }
    }
}

object VideoDataManager{
    val items = mutableListOf<VideoData>()

    fun getItems(){
        items.add( VideoData("오 아이디어 되게 좋은데?-나오면 사고싶은 이번주 신박제품 20가지 모음","나의시선", R.drawable.thumb01, R.drawable.ch01, 35348, 122000, 24,7,17) )
        items.add( VideoData("??? : 이 부분만 쇼츠로 빼면 되게 나쁘게 나갈 것 같아 | 메타코미디클럽 EP.23","메타코미디클럽", R.drawable.thumb02, R.drawable.ch02, 621309,741000, 24,7,10))
        items.add( VideoData("폴드 6년차 덕후의 갤럭시 Z폴드6 1주일 사용기, 하나만 빼고 만족합니다! 아쉬운 것들이 있지만","꿀단지PD", R.drawable.thumb03, R.drawable.ch03, 14441, 151000, 24,7,18, 5, 30) )
        items.add( VideoData("1년에 수백 권 읽는 사람이 알려주는 '까먹지 않는' 독서법!","캡선생의 서재", R.drawable.thumb04, R.drawable.ch04, 580,230,24,7,17) )
        items.add( VideoData("[ 2시간 반복 ] 반야심경 반야심경 반야심경...(계속) (Heart Sutra, KOR) by Gomdan #aimusic #kpop #suno #sunoai","GOMDAN", R.drawable.thumb05, R.drawable.ch05, 57319, 7060, 24,7,12) )
        items.add( VideoData("오 아이디어 되게 좋은데?-나오면 사고싶은 이번주 신박제품 20가지 모음","나의시선", R.drawable.thumb06, R.drawable.ch06, 35348, 122000, 24,7,17) )
        items.add( VideoData("??? : 이 부분만 쇼츠로 빼면 되게 나쁘게 나갈 것 같아 | 메타코미디클럽 EP.23","메타코미디클럽", R.drawable.thumb07, R.drawable.ch07, 621309,741000, 24,7,10))
        items.add( VideoData("폴드 6년차 덕후의 갤럭시 Z폴드6 1주일 사용기, 하나만 빼고 만족합니다! 아쉬운 것들이 있지만","꿀단지PD", R.drawable.thumb08, R.drawable.ch08, 14441, 151000, 24,7,18, 18, 20) )
        items.add( VideoData("1년에 수백 권 읽는 사람이 알려주는 '까먹지 않는' 독서법!","캡선생의 서재", R.drawable.thumb09, R.drawable.ch09, 580,230,24,7,17) )
        items.add( VideoData("[ 2시간 반복 ] 반야심경 반야심경 반야심경...(계속) (Heart Sutra, KOR) by Gomdan #aimusic #kpop #suno #sunoai","GOMDAN", R.drawable.thumb10, R.drawable.ch10, 57319, 7060, 24,7,12) )
        items.add( VideoData("오 아이디어 되게 좋은데?-나오면 사고싶은 이번주 신박제품 20가지 모음","나의시선", R.drawable.thumb11, R.drawable.ch11, 35348, 122000, 24,7,17) )
        items.add( VideoData("??? : 이 부분만 쇼츠로 빼면 되게 나쁘게 나갈 것 같아 | 메타코미디클럽 EP.23","메타코미디클럽", R.drawable.thumb12, R.drawable.ch12, 621309,741000, 24,7,10))
        items.add( VideoData("오 아이디어 되게 좋은데?-나오면 사고싶은 이번주 신박제품 20가지 모음","나의시선", R.drawable.thumb01, R.drawable.ch01, 35348, 122000, 24,7,17) )
        items.add( VideoData("??? : 이 부분만 쇼츠로 빼면 되게 나쁘게 나갈 것 같아 | 메타코미디클럽 EP.23","메타코미디클럽", R.drawable.thumb02, R.drawable.ch02, 621309,741000, 24,7,10))
        items.add( VideoData("폴드 6년차 덕후의 갤럭시 Z폴드6 1주일 사용기, 하나만 빼고 만족합니다! 아쉬운 것들이 있지만","꿀단지PD", R.drawable.thumb03, R.drawable.ch03, 14441, 151000, 24,7,18, 22, 10) )
        items.add( VideoData("1년에 수백 권 읽는 사람이 알려주는 '까먹지 않는' 독서법!","캡선생의 서재", R.drawable.thumb04, R.drawable.ch04, 580,230,24,7,17) )
        items.add( VideoData("[ 2시간 반복 ] 반야심경 반야심경 반야심경...(계속) (Heart Sutra, KOR) by Gomdan #aimusic #kpop #suno #sunoai","GOMDAN", R.drawable.thumb05, R.drawable.ch05, 57319, 7060, 24,7,12) )
        items.add( VideoData("오 아이디어 되게 좋은데?-나오면 사고싶은 이번주 신박제품 20가지 모음","나의시선", R.drawable.thumb06, R.drawable.ch06, 35348, 122000, 24,7,17) )
        items.add( VideoData("??? : 이 부분만 쇼츠로 빼면 되게 나쁘게 나갈 것 같아 | 메타코미디클럽 EP.23","메타코미디클럽", R.drawable.thumb07, R.drawable.ch07, 621309,741000, 24,7,10))
        items.add( VideoData("폴드 6년차 덕후의 갤럭시 Z폴드6 1주일 사용기, 하나만 빼고 만족합니다! 아쉬운 것들이 있지만","꿀단지PD", R.drawable.thumb08, R.drawable.ch08, 14441, 151000, 24,7,18, 23, 50) )
        items.add( VideoData("1년에 수백 권 읽는 사람이 알려주는 '까먹지 않는' 독서법!","캡선생의 서재", R.drawable.thumb09, R.drawable.ch09, 580,230,24,7,17) )
        items.add( VideoData("[ 2시간 반복 ] 반야심경 반야심경 반야심경...(계속) (Heart Sutra, KOR) by Gomdan #aimusic #kpop #suno #sunoai","GOMDAN", R.drawable.thumb10, R.drawable.ch10, 57319, 7060, 24,7,12) )
        items.add( VideoData("오 아이디어 되게 좋은데?-나오면 사고싶은 이번주 신박제품 20가지 모음","나의시선", R.drawable.thumb11, R.drawable.ch11, 35348, 122000, 24,7,17) )
        items.add( VideoData("??? : 이 부분만 쇼츠로 빼면 되게 나쁘게 나갈 것 같아 | 메타코미디클럽 EP.23","메타코미디클럽", R.drawable.thumb12, R.drawable.ch12, 621309,741000, 24,7,10))


    }
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

fun simplizeSubscridberNum(subscriberNum:Int):String{
    if (subscriberNum<1000){
        return "${subscriberNum}명"
    } else if (subscriberNum<10000){
        return "${(subscriberNum/10).toFloat()/100}천명"
    } else if (subscriberNum<100000){
        return "${(subscriberNum/100).toFloat()/100}만명"
    } else {
        return "${subscriberNum/10000}만명"
    }
}

fun simplizeDateTime(yy:Int, MM:Int, dd:Int, hh:Int, mm:Int):String{
    val uploadDateTime = LocalDateTime.of(2000+yy, MM, dd, hh, mm) //파라미터로 받아온 업로드 시각
    val duration: Duration = Duration.between(uploadDateTime, LocalDateTime.now()) // 현재 시간과 차이 계산

    val days = duration.toDays().toInt()
    val hours = (duration.toHours()%24).toInt()

    if (days >= 365){
        return "${days/365}년 전"
    } else if (days >= 30){
        return "${days/30}개월 전"
    } else if (days == 0 || (days ==1 && hours < 24) ){
        return "${hours}시간 전"
    } else {
        return "${days}일 전"
    }

}