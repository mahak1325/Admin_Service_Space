package com.example.adminservicespace

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.activity.result.PickVisualMediaRequest
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.adminservicespace.databinding.ActivityAddServiceBinding

class AddServiceActivity : AppCompatActivity() {
    private val binding : ActivityAddServiceBinding by lazy{
        ActivityAddServiceBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding.SelectImage.setOnClickListener {
            pickimage.launch(PickVisualMediaRequest(ActivityResultContracts.PickVisualMedia.ImageOnly))
        }
        binding.BackButton.setOnClickListener{
            finish()
        }
    }
        val pickimage = registerForActivityResult(ActivityResultContracts.PickVisualMedia()){ uri->
            if (uri != null){
                binding.SelectedImage.setImageURI(uri)
            }
        }
    }
