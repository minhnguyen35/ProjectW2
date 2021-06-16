package com.example.mygridview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initRecycler()

    }


    private fun initRecycler() {
        val books = Books.create()
        val bookAdapter = LibraryAdapter()
        bookAdapter.initList(books)
        //Toast.makeText(this,"size is ${books.size}",Toast.LENGTH_SHORT).show()
        val recyclerView = findViewById<RecyclerView>(R.id.recylerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = bookAdapter

    }
}