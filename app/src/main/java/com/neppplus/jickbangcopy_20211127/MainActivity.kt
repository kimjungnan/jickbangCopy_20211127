package com.neppplus.jickbangcopy_20211127

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.neppplus.jickbangcopy_20211127.datas.RoomData

class MainActivity : AppCompatActivity() {
    
    val mRoomList = ArrayList<RoomData>()
    
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        
        mRoomList.add(RoomData(8000, "서울시 동대문구", 5, "1번째 방입니다."))
        mRoomList.add(RoomData(12000, "서울시 용산구", 10, "1번째 방입니다."))
        mRoomList.add(RoomData(5000, "서울시 서대문구", 8, "1번째 방입니다."))
        mRoomList.add(RoomData(30000, "서울시 종로구", -2, "1번째 방입니다."))
        mRoomList.add(RoomData(19000, "서울시 영등포구", 0, "1번째 방입니다."))
        mRoomList.add(RoomData(80000, "서울시 동작구", 1, "1번째 방입니다."))
        mRoomList.add(RoomData(1000, "서울시 강남구", -3, "1번째 방입니다."))
        mRoomList.add(RoomData(200, "서울시 성북구", 20, "1번째 방입니다."))
        mRoomList.add(RoomData(23500, "서울시 마포구", 100, "1번째 방입니다."))
        mRoomList.add(RoomData(4000, "서울시 동대문구", 2, "1번째 방입니다."))
        
    }
}