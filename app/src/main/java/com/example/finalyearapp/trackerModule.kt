package com.example.finalyearapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView

class trackerModule : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tracker_module)

        //getting chapterList from inputModule
        val chapterList = intent.getStringArrayListExtra("chapter-list")


        //holding a linearLayout from this activity's xml in a variable
        val scrollableList: LinearLayout = findViewById(R.id.trackerList)

        //loops through the chapterList array to generate buttons dynamically
        // and add them in the linearLayout
        for (i in chapterList){

            val button = Button(this)
            button.layoutParams =  LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT)
            button.text = i

            scrollableList.addView(button)

            // creates function for buttons
            button.setOnClickListener{
                //enter function for buttons here
            }

        }



    }
}