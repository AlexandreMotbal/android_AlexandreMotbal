package com.example.flight_app

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    @Override
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)


        val buttonClick = findViewById<Button>(R.id.findBtn)
        buttonClick.setOnClickListener {
            val intent = Intent(this, availableFlights::class.java)
            startActivity(intent)
        }


    }


}