package com.jesmerado.mydogage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.jesmerado.mydogage.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //Se pueden colocar en el lugar que deseamos sin crear variables.
        val ageEdit = binding.ageEdit
        val resultText = binding.resultText
        val btn = binding.btn

        btn.setOnClickListener {
            val ageString = ageEdit.text.toString()
            if (ageString.isNotEmpty()) {
                val ageInt = ageString.toInt()
                val result = ageInt * 7
                resultText.text = getString(R.string.Calculated_Age, result)
            } else {
                Toast.makeText(this, R.string.Insert_Age, Toast.LENGTH_SHORT).show()
            }
        }

    }
}



