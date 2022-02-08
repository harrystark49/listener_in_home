package com.example.listener_in_home

import android.content.Context
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.each_item.view.*

open class viewholder(var context: Context,var view: View, var evenlistener:adap.videoEventListener):RecyclerView.ViewHolder(view) {

    open fun render(list: ArrayList<String>,pos:Int,viewholder:viewholder){
        viewholder.view.tv.text=list[pos]
viewholder.view.tv.setOnClickListener {
    evenlistener.onclicked(list[pos])
}
    }
}