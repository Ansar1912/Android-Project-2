package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.Models.User

class HomeActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        lateinit var emailaddress:TextView
        super.onCreate(savedInstanceState)
        setContentView(R.layout.home_activity)
        val user=intent.extras?.getParcelable<User>("user")
        emailaddress=findViewById(R.id.emailaddress)
        emailaddress.text=user?.email

        findViewById<Button>(R.id.submit1).setOnClickListener(View.OnClickListener {
            val intent= Intent(this, Activity3::class.java)
            startActivity(intent)
        })
    }
}