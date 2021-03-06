package com.example.filmapp

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

abstract class BaseActivity : AppCompatActivity() {

    private val logTag: String = this::class.java.simpleName

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(logTag, "onCreate")
    }

    override fun onStart() {
        super.onStart()
        Log.d(logTag, "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d(logTag, "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d(logTag, "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d(logTag, "onStop")
    }
}