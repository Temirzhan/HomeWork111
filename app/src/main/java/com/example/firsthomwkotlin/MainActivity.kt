package com.example.firsthomwkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.example.firsthomwkotlin.domain.DataClass
import com.example.firsthomwkotlin.domain.ObjectClass
import org.w3c.dom.Text

val dataClass = DataClass("Set")


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.button)
        val text = findViewById<TextView>(R.id.textView)
        text.setText("4")
        onClick(button, text)

        if(1 in 1..10){
            print("Hello")
        }

        cases("Hello")
        cases(1)
        cases(0L)
        cases("hello")
    }
}

fun onClick(view: View, viewText: TextView) {
    view.setOnClickListener(object : View.OnClickListener {
        override fun onClick(v: View?) {
            viewText.setText("${dataClass.dataInt} ${dataClass.dataTitle} object class = ${ObjectClass.getCount()}")
        }

    })



}
fun cases(obj: Any) {
    when (obj) {
        1 -> println("One")
        "Hello" -> println("Greeting")
        is Long -> println("Long")
        !is String -> println("Not a string")
        else -> println("Unknown")
    }
}