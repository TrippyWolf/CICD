package com.example.myapplication;

import android.annotation.SuppressLint
import android.os.Bundle;
import android.widget.TextView

import androidx.appcompat.app.AppCompatActivity;


 class MainActivity : AppCompatActivity() {

     @SuppressLint("MissingInflatedId")
     @Override
     override fun onCreate(savedInstanceState: Bundle?)
      {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

          findViewById<TextView>(R.id.hello_world_text).setOnClickListener{
              println("j")

          }

    }
}