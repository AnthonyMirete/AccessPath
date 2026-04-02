package com.example.accesspath

import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val stairs = findViewById<CheckBox>(R.id.stairs)
        val ramps = findViewById<CheckBox>(R.id.ramps)
        val wheelchair = findViewById<CheckBox>(R.id.wheelchair)
        val button = findViewById<Button>(R.id.apply)
        val result = findViewById<TextView>(R.id.result)

        button.setOnClickListener {
            val selected = mutableListOf<String>()

            if (stairs.isChecked) selected.add("Avoid stairs")
            if (ramps.isChecked) selected.add("Include ramps")
            if (wheelchair.isChecked) selected.add("Wheelchair accessible")

            result.text =
                if (selected.isEmpty()) "No filters selected"
                else "Selected: ${selected.joinToString(", ")}"
        }
    }
}