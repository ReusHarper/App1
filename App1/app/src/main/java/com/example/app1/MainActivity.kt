package com.example.app1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val a = 5
        val b = 20
        val c = a * b

        Log.d("INFORMATION", "Este es un mensaje de informacion")
        Log.d("INFORMATION", "La multiplicacion de axb es: " + c)
    }
}