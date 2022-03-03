package com.ebookfrenzy.motivateme

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.inputmethod.InputMethodManager
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

            // pick a motivational message
            val motivationalMessage = listOf("Keep working hard", "Never give in!", "Keep your head up","You can do it!", "You cant stop me!")
            val index = (0..4).random()
            val currentMessage = motivationalMessage[index]

        //Update the textView to display our message
            if (username.toString() == "") {
                message.text = "Make sure to enter your name"
            } else {
                message.text = "Hello $username! $currentMessage"
            }

            //Clear the editText and use setText because editText's require an editable
            name.setText("")

            //Hide the keyboard
            hideKeyboard()

        }

    // Hide the keyboard using an InputMethodManager
    private fun hideKeyboard() {
        val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        imm.hideSoftInputFromWindow(name.windowToken, 0)

    }

    }
