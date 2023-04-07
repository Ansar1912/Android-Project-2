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
import com.example.myapplication.Utils.AppPrefences
import com.example.myapplication.Utils.Dataholder

class MainActivity : AppCompatActivity(),View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        findViewById<Button>(R.id.button2).setOnClickListener(View.OnClickListener {
//            showmsg("Button 2 Clicked Using Find View By ID")
//        })
//        findViewById<Button>(R.id.button3).setOnClickListener(this)
        val txError=findViewById<TextView>(R.id.txError)
        val error=savedInstanceState?.getString("error")
        txError.text=error.toString()
    }

    override fun onSaveInstanceState(outState: Bundle) {

        super.onSaveInstanceState(outState)
        val txError=findViewById<TextView>(R.id.txError)
        if(txError.visibility == View.VISIBLE)
            outState.putString("error",txError.text.toString())
    }


    fun submitbtn(view: View){
        val emailAddress=findViewById<EditText>(R.id.editTextTextEmailAddress).text.toString()
        val password=findViewById<TextView>(R.id.editTextTextPassword).text.toString()
        val user=User(emailAddress, password)
        val intent=Intent(this,Activity3::class.java)
        intent.putExtra("email",emailAddress)
        intent.putExtra("password",password)
        intent.putExtra("user",user)
        Dataholder.user=user
        var pref=AppPrefences(this)
        pref.setData("name","John123")

        if(emailAddress.isEmpty()){
            //showMessageOnUI("Please enter email address")
            showError("Please enter email address")
            return
        }
        else if (password.isEmpty()){
            //showMessageOnUI("Please enter password")
            showError("Please enter password")
            return
        }
        else
            startActivity(intent)

    }

    fun showError(message:String) {
        val txError=findViewById<TextView>(R.id.txError)
        txError.visibility = View.VISIBLE
        txError.text = message
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