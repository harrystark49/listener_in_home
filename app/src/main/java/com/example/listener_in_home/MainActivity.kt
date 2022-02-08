package com.example.listener_in_home

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    lateinit var adap: adap
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var list=ArrayList<String>()
        list.add("sfsfjkl")
        list.add("sfsfjkl")
        list.add("sfsfjkl")
        list.add("sfsfjkl")
        adap= adap(this, list)
        var layoutmanager=LinearLayoutManager(this)
        layoutmanager.orientation=LinearLayoutManager.VERTICAL


        adap.eventlistener= object : adap.videoEventListener{
            override fun onclicked(text: String) {
                Toast.makeText(this@MainActivity, "safsddf", Toast.LENGTH_SHORT).show()
            }
        }
        rcv.layoutManager=layoutmanager
        rcv.adapter=adap
    }
}