package com.example.myapplication.Utils

import android.content.Context
import android.content.Context.MODE_PRIVATE

class AppPrefences (var context: Context) {
    private val prefences=context.getSharedPreferences("app_pref",MODE_PRIVATE)

    fun setData(key:String,value: String){
        prefences.edit().putString(key,value).apply()
    }
    fun getData(key: String):String?{
        return prefences.getString(key,"0");
    }
}