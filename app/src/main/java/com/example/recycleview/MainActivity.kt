package com.example.recycleview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView.layoutManager = LinearLayoutManager(this)
        val items = fetchData()
        val adapter: Adapter = Adapter(items)
        recyclerView.adapter=adapter
    }


    private fun fetchData():ArrayList<String>{
        val list =ArrayList<String>()
        for (i in 0 until 100){
            list.add("cha $i")
        }
        return list
    }
}