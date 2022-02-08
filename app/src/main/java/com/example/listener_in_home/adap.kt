package com.example.listener_in_home

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class adap(var context: Context,var list: ArrayList<String>):RecyclerView.Adapter<viewholder>() {
    lateinit var eventlistener:videoEventListener

    public interface videoEventListener{
        fun onclicked(text:String)
    }

    public fun updatenews(data:List<String>){
        list.addAll(data)
        notifyDataSetChanged()

    }
    open fun adap(context: Context, list: ArrayList<String>,){
        this.context=context
        this.list=list
        this.eventlistener=eventlistener
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): viewholder {
        var view=LayoutInflater.from(context).inflate(R.layout.each_item,parent,false)
        return viewholder(context,view,eventlistener)
    }

    override fun onBindViewHolder(holder: viewholder, position: Int) {
        holder.render(list,position,holder)
    }

    override fun getItemCount(): Int {
        return list.size
    }
}