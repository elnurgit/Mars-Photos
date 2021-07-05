package com.example.marsphotos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.LayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recy_view.adapter = RecyAdapter(dummyList(20))
        recy_view.layoutManager = LinearLayoutManager(this)
        recy_view.setHasFixedSize(true)

    }
    fun dummyList(size:Int):List<ListItem>{
        val listItems = ArrayList<ListItem>()
        for (i in 0 until size)
        {
            val text:String = when(i%3){
                0->"0"
                1->"1"
                2->"2"
                else ->"else"
            }
            val listItem = ListItem("null",text)
            listItems+=listItem
        }
        return listItems
    }
}