package com.example.finalyearapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    //Functions below handle navigation thoughout the app
    fun toAbout(view: View){
        val intent = Intent(this,AboutApp::class.java)
            startActivity(intent)
    }

    fun toInput(view: View){
        val intent = Intent(this,inputModule::class.java)
        startActivity(intent)
    }

    fun toTracker(view: View){
        val intent = Intent(this,trackerModule::class.java)
        startActivity(intent)
    }

    fun toUserInfo(view: View){
        val intent = Intent(this,UserInfoModule::class.java)
        startActivity(intent)
    }

}