package io.angelappdev.blocnote

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun addButtonTouched(button:View) {
        val userInput = userField.text
        var existingText = fullTextView.text
        fullTextView.text = "$existingText \n $userInput"
        userField.text = null
       // Log.i("Angie", "Coucou")
    }
}