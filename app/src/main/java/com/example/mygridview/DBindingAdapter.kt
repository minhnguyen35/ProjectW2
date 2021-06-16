package com.example.mygridview

import android.graphics.Color
import android.widget.TextView
import androidx.databinding.BindingAdapter

@BindingAdapter("header")
fun TextView.showHeader(header: String){
        this.text = header
        this.setTextColor(Color.RED)
        this.textSize = 20F
}
