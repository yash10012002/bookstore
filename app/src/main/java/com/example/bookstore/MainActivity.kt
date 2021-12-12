package com.example.bookstore

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private  val img = arrayOf(R.drawable.a1,R.drawable.a2,R.drawable.a3,R.drawable.a4,)

    private val texts = arrayOf("Cloud Computing","Database Management System","Digital Electronics","Gate CE&IT")

   private val desc = arrayOf("Michael Miller", "Asim Kumar sen", "s. Chand", "Yash Patel")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = CustomAdapter(img,texts,desc)
    }
}