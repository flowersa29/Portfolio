package com.ebookfrenzy.motivateme

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

  //Declare our references to views before layout inflation
    private lateinit var name: EditText
    private lateinit var message: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val updateButton: Button = findViewById(R.id.activity_main_button)
        updateButton.setOnClickListener { updateMessage() }

        //Set the value to our declared views
        name = findViewById(R.id.activity_main_et_name)
        message = findViewById(R.id.main_activity_tv_message)



    }
        // get a name from edittext and display a personalized message
        private fun updateMessage(){
            //Get the username from the editText
            val username = name.text

            //Update the textView to display our message
            message.text = "Hello $username"

            //Clear the editText and use setText because
        }

    }
