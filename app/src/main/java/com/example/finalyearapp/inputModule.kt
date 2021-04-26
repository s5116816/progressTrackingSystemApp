package com.example.finalyearapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.method.ScrollingMovementMethod
import android.view.View
import android.widget.EditText
import android.widget.TextView

class inputModule : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_input_module)

        //allows textViews to scroll vertically
        val chapterScrollable: TextView = findViewById(R.id.chapterContainer)
        val moduleScrollable: TextView = findViewById(R.id.moduleContainer)
        chapterScrollable.movementMethod = ScrollingMovementMethod()
        moduleScrollable.movementMethod = ScrollingMovementMethod()
    }

    //store list of chapters
     var chapterList = arrayListOf<String>()



    fun addToList(view: View){

        //referencing textview and editText
        val chapterUserInput = findViewById<EditText>(R.id.chapterUserInput)
        val chapterTextView = findViewById<TextView>(R.id.chapterContainer)

        //change user input to string
        val userInput = chapterUserInput.text.toString()


        //add user input in textview
        chapterTextView.append(userInput)
        chapterTextView.append("\n")

        //add input in array
        chapterList.add(userInput)

        //remove from list if input hasn't been entered
        if(userInput == ""){

            chapterList.remove(userInput)
        }
    }


    fun addToModule(view: View){

        val moduleUserInput = findViewById<EditText>(R.id.moduleUserInput)
        val moduleTextView = findViewById<TextView>(R.id.moduleContainer)

        val artifactUserInput = moduleUserInput.text.toString()

        moduleTextView.append(artifactUserInput)
        moduleTextView.append("\n")

        chapterList.add(artifactUserInput)

        if(artifactUserInput == ""){

            chapterList.remove(artifactUserInput)
        }
    }

    fun continueToTracker(view: View){

        //activate the tracker activity
        val intent = Intent(this,trackerModule::class.java)
        intent.putExtra("chapter-list", chapterList)
        startActivity(intent)

    }


}