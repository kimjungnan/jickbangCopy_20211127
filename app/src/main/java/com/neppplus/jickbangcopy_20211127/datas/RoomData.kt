package com.neppplus.jickbangcopy_20211127.datas

class RoomData(
    val price: Int,
    val address: String,
    val floor: Int,
    val descrition:  String

) {

//    방데이터 기능 : 가격 가공해서 String으로 주는 기능 => 리스트뷰/상세화면 두군데에서 사용



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