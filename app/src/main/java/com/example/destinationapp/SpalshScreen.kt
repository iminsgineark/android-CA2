package com.example.destinationapp

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity
import com.example.destinationapp.MainActivity
import com.example.travelio_mobile_application_kotlin.R

class SplashScreen : AppCompatActivity() {

    private val splashTimeout: Long = 4000 // Adjust as needed

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_spalsh_screen)

        // Using a Handler to delay the start of the MainActivity
        Handler().postDelayed({
            // Start the main activity
            startActivity(Intent(this, MainActivity::class.java))
            finish() // Close the splash activity
        }, splashTimeout)
    }
}
