package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val myname="kotlinDemo"// val is immutable datatype
        println("first value will be given as="+myname)
        var s="Myfirstkotlin demo"// var is mutable dataType that means its value can be changed
        s="Myfirstkotlin demo for android"
        println("Second value will be given as="+s)
    }
}
