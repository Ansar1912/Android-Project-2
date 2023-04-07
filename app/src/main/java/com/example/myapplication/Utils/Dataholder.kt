package com.example.myapplication.Utils

import com.example.myapplication.Models.User

//class Dataholder {
//}

object Dataholder{
    lateinit var user: User
    internal fun getUser():User {
        return user
    }
}