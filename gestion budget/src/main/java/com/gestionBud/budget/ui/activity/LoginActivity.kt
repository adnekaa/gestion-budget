package com.gestionBud.budget.activity

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.TextView
import com.gestionBud.budget.R
import com.gestionBud.budget.ui.activity.SignupActivity


class LoginActivity : AppCompatActivity() {
    internal val signup = findViewById<TextView>(R.id.src_in)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        signup.setOnClickListener {
            // Start the Signup activity
            val intent = Intent(applicationContext, SignupActivity::class.java)
            startActivity(intent)
        }
    }

    override fun onBackPressed() {

        // Disable going back to the MainActivity
        moveTaskToBack(true)

    }
}


