package com.neppplus.jickbangcopy_20211127.datas

import java.io.Serializable
import java.text.NumberFormat
import java.util.*

class RoomData(
    val price: Int,
    val address: String,
    val floor: Int,
    val descrition:  String

) : Serializable {

//    방데이터 기능 : 가격 가공해서 String으로 주는 기능 => 리스트뷰/상세화면 두군데에서 사용
    fun getFormattedPrice() : String {

        if(this.price < 10000){

            return NumberFormat.getNumberInstance(Locale.KOREA).format(this.price)

        }else{

            val uk = this.price / 10000    // int/int -> 결과 int. 소수점 버림, 억 단위 추출
            val rest = this.price % 10000  // 나눈 나머지
            val str = NumberFormat.getNumberInstance(Locale.KOREA).format(rest)
            return "${uk}억 ${str}"

        }

    }


//    층수도 가공해서 String으로 주자
    fun getFormattedFloor() : String {

        if( this.floor > 0 ) {
            return "${this.floor}층"
        }else if( this.floor ==0 ) {
            return "반지하"
        }else {
            return "지하 ${-this.floor}층" //-2 : - 떼서 지하 2층
        }


    }


}