package com.example.adminservicespace

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.adminservicespace.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {
private val binding:ActivityLoginBinding by lazy{
    ActivityLoginBinding.inflate(layoutInflater)
}
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding.loginButton.setOnClickListener{
            val intent = Intent(this,SignUpActivity::class.java)
            startActivity(intent)
        }
       binding.dontHaveAccountButton.setOnClickListener{
           val intent= Intent(this,SignUpActivity::class.java)
           startActivity(intent)
       }
    }
}