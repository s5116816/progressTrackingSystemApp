package com.example.finalyearapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ViewGroup
import android.widget.Button
import android.widget.LinearLayout

class trackerModule : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tracker_module)

        //passing chapterlist to this activity
        val intent = intent
        val array = intent.getStringArrayListExtra("chapter-list")

        val scrollableList: LinearLayout = findViewById(R.id.trackerList)



        for (i in array){

            val button = Button(this)
            button.layoutParams =  LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT)
            button.text = i

            scrollableList.addView(button)

        }

    }
}