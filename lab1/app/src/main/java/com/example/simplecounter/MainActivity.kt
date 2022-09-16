package com.example.simplecounter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

var counter = 0;
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val textView = findViewById<TextView>(R.id.textView)
        val button = findViewById<Button>(R.id.button)
        val button2 = findViewById<Button>(R.id.button2)
        button.setOnClickListener {
            counter++
            textView.text = counter.toString()
            if (counter >= 100) {
                button2.visibility = View.VISIBLE
                button2.setOnClickListener {
                    button.setOnClickListener {
                        counter += 2
                        textView.text = counter.toString()
                    }
                    button2.visibility = View.INVISIBLE
                }
            }
//            Toast.makeText(it.context, "Button Clicked!", Toast.LENGTH_SHORT).show()
        }
    }
}
