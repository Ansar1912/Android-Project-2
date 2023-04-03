package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.example.myapplication.Models.User

class MainActivity : AppCompatActivity(),View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        findViewById<Button>(R.id.button2).setOnClickListener(View.OnClickListener {
//            showmsg("Button 2 Clicked Using Find View By ID")
//        })
//        findViewById<Button>(R.id.button3).setOnClickListener(this)


    }
    fun submitbtn(view: View){
        val email=findViewById<EditText>(R.id.editTextTextEmailAddress).text.toString()
        val password=findViewById<TextView>(R.id.editTextTextPassword).text.toString()
        val user=User(email, password)
        val intent=Intent(this,HomeActivity::class.java)
        intent.putExtra("email",email)
        intent.putExtra("password",password)
        intent.putExtra("user",user)
        startActivity(intent)
}



fun showmsg(msg:String){
    Toast.makeText(this,msg,Toast.LENGTH_SHORT).show()
}

    override fun onClick(view: View?) {
//        if(view?.id == R.id.button3){
//            showmsg("Clicked Using Onclick Function")
//        }
        when(view?.id){
//            R.id.button3-> {
//                showmsg("Clicked Using Onclick Function")
//            }
        }

    }

}