package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.util.Log
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.Utils.AppPrefences
import com.example.myapplication.Utils.Dataholder

class Activity3 : AppCompatActivity() {
//    private var handler=Handler()
//    lateinit var runnable: Runnable


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity3)
        val txt1 = this.findViewById<TextView>(R.id.txt)
        var pref= AppPrefences(this)
        val name: String? =pref.getData("name")
        Log.d("Creation",name.toString())
        txt1.text=name.toString()
    }

//        val user=Dataholder.getUser()
//        txt1.text="${user.email} = ${user.password}"
//        runnable = Runnable {
//            Intent(this,MainActivity::class.java).apply {
//                startActivity(this)
//                finish()
//            }
//        }

//        handler.postDelayed(runnable,3000)


    }

//    override fun onDestroy() {
//        super.onDestroy()
//        handler.removeCallbacks(runnable)
//    }
