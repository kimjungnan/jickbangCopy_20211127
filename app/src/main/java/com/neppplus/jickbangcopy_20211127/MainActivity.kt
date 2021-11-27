package com.neppplus.jickbangcopy_20211127

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.neppplus.jickbangcopy_20211127.datas.RoomAdater
import com.neppplus.jickbangcopy_20211127.datas.RoomData
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    // 방목록 담기 위한 그릇  comment01_20211127_branch

    val mRoomList = ArrayList<RoomData>()

    lateinit var mRoomAdater: RoomAdater
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        
        mRoomList.add(RoomData(8000, "서울시 동대문구", 5, "1번째 방입니다."))
        mRoomList.add(RoomData(12000, "서울시 용산구", 10, "2번째 방입니다."))
        mRoomList.add(RoomData(5000, "서울시 서대문구", 8, "3번째 방입니다."))
        mRoomList.add(RoomData(30000, "서울시 종로구", -2, "4번째 방입니다."))
        mRoomList.add(RoomData(19000, "서울시 영등포구", 0, "5번째 방입니다."))
        mRoomList.add(RoomData(80000, "서울시 동작구", 1, "6번째 방입니다."))
        mRoomList.add(RoomData(1000, "서울시 강남구", -3, "7번째 방입니다."))
        mRoomList.add(RoomData(200, "서울시 성북구", 20, "8번째 방입니다."))
        mRoomList.add(RoomData(23500, "서울시 마포구", 100, "9번째 방입니다."))
        mRoomList.add(RoomData(4000, "서울시 동대문구", 2, "10번째 방입니다."))

        mRoomAdater = RoomAdater(this, R.layout.room_list_item, mRoomList)

        roomListView.adapter = mRoomAdater

        roomListView.setOnItemClickListener { adapterView, view, position, l ->

         val clickedRoom = mRoomList[position]

         val myIntent = Intent( this, ViewRoomDetailActivity::class.java)

            myIntent.putExtra("room",clickedRoom)

            startActivity(myIntent)

        }



    }
}