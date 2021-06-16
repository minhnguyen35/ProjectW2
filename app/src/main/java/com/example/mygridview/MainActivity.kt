package com.example.mygridview

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    companion object{
        val KEY = "USERNAME"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        checkUser()
        initRecycler()

    }

    private fun checkUser() {
        val preferences = getSharedPreferences("user", Context.MODE_PRIVATE)
        val username = preferences.getString(KEY, "null")
        if(username == "null"){
            val i = Intent(this, SignUp::class.java).apply {
                addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK)
                addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
            }
            startActivity(i)
        }
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