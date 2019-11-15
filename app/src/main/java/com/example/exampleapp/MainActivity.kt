package com.example.exampleapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    fun btnOnClick(view: View): Unit {
        Log.i("Name", edt.text.toString())
        val message = edt.text.toString()
        Toast.makeText(this, "Hi there $message", Toast.LENGTH_LONG).show()

    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //btn.setOnClickListener(btnOnClick)
    }
}
