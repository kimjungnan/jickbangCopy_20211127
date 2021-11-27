package com.neppplus.jickbangcopy_20211127.datas

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import com.neppplus.jickbangcopy_20211127.R

class RoomAdater(
    val mContext: Context,
    val resId: Int,
    val mList: ArrayList<RoomData>

) : ArrayAdapter<RoomData>(mContext,resId, mList) {

    val mInflater =LayoutInflater.from(mContext)

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        var tempRow = convertView

        if(tempRow == null){

            tempRow = mInflater.inflate( R.layout.room_list_item, root:null)
        }

        val row = tempRow!!

        return row

    }

}