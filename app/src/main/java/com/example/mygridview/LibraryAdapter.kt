package com.example.mygridview

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CheckBox
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class LibraryAdapter(): RecyclerView.Adapter<RecyclerView.ViewHolder>(){
    private var listBooks: List<Books> = ArrayList<Books>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        //Toast.makeText(parent.context, "invoked onCreateView", Toast.LENGTH_SHORT).show()
        return LibraryViewholder(
                LayoutInflater.from(parent.context)
                        .inflate(R.layout.book_layout,parent,false)
        )
    }

    override fun getItemCount(): Int {
        return listBooks.size
    }

    fun initList(books: List<Books>){
        listBooks = books
    }
    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {

        //Toast.makeText(holder.itemView.context, "invoked Bind Data $position", Toast.LENGTH_SHORT).show()
        when(holder){
            is LibraryViewholder ->{
                holder.setUp(listBooks.get(position))
            }
        }
    }

    class LibraryViewholder(itemView: View) : RecyclerView.ViewHolder(itemView){
        init{
            Log.d("view: ", "invoked onCreateView")
        }
        val imgBook = itemView.findViewById<ImageView>(R.id.bookImage)
        val nameBook = itemView.findViewById<TextView>(R.id.nameBook)
        val authorBook = itemView.findViewById<TextView>(R.id.authorBook)
        val checkBox = itemView.findViewById<CheckBox>(R.id.checkBox)
        fun setUp(item: Books){

            nameBook.text = item.name
            authorBook.text = item.author
            //imgBook.setImageResource(R.drawable.doraemon)
            
            val default = RequestOptions().placeholder(R.drawable.ic_launcher_background)
                    .error(R.drawable.ic_launcher_background)

            Glide.with(itemView.context)
                    .applyDefaultRequestOptions(default)
                    .load(item.img).into(imgBook)
        }
    }
}


