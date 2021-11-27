package com.neppplus.jickbangcopy_20211127

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper

class activity_Splash : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

//        2.5초 지연후 화면전환 (핸들러)

        val myHandler = Handler( Looper.getMainLooper() ) //메인쓰레드 (UI전담쓰레드)소환

        myHandler.postDelayed( {

//      2.5초 실행 할 일 : 메인화면 이동하기
            val myIntent = Intent(this,MainActivity::class.java)

            startActivity(myIntent)

            finish()

        }, 2500 )


    }
}