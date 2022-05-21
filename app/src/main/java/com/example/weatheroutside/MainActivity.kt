package com.example.weatheroutside

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import androidx.annotation.RequiresApi
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

class MainActivity : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
                setContentView(R.layout.activity_main)

        //Current Date
        var currentDate = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd-MM-yyyy"))
        var dateTV: TextView? = null
        dateTV = findViewById(R.id.dateCurrent)
        dateTV.text=currentDate

        //Current Time
        var currentTime = LocalDateTime.now().format(DateTimeFormatter.ofPattern("HH:mm a"))
        var timeTV: TextView? = null
        timeTV = findViewById(R.id.timeCurrent)
        timeTV.text=currentTime

        //Current Weather Details
        val weatherAPI = "f0fc3f507fb1b69f7ba2a0f297169820"
        val weatherURL = api.openweathermap.org/data/2.5/forecast?q={city name}&appid={API key}
        //Another API option
        //api.openweathermap.org/data/2.5/forecast?lat=35&lon=139&appid={API key}

        //check coroutine library
//        dateTV.setOnClickListener{
//            Toast.makeText(applicationContext, dateTV.text, Toast.LENGTH_SHORT).show()
//        }
    }
}