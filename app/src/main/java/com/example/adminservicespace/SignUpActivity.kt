package com.example.adminservicespace

import android.R
import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.adminservicespace.databinding.ActivitySignUpBinding

class SignUpActivity : AppCompatActivity() {
    private val binding: ActivitySignUpBinding by lazy {
        ActivitySignUpBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding.CreateButton.setOnClickListener{
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
        binding.alreadyHaveAccountButton.setOnClickListener{
            val intent= Intent(this,LoginActivity::class.java)
            startActivity(intent)
        }
       val locationList = arrayOf("Jaipur","Odisha","Bundi","Sikar")
        val adapter = ArrayAdapter(this, R.layout.simple_list_item_1, locationList)
        val autoCompleteTextView = binding.listOfLocation
        autoCompleteTextView.setAdapter(adapter)
        }
    }
