package com.example.adminservicespace

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.adminservicespace.adapter.AddServiceAdapter
import com.example.adminservicespace.databinding.ActivityAddServiceBinding
import com.example.adminservicespace.databinding.ActivityAllServiceBinding

class AllServiceActivity : AppCompatActivity() {
    private val binding:ActivityAllServiceBinding by lazy {
        ActivityAllServiceBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
          setContentView(binding.root)
         val MenuServiceName= listOf("Wallpaper installation","Plumbing services","AC repair","Refrigerator repair","TV repair","Metal painting","Exterior painting","Sofa cleaning","Wallpaper installation","Plumbing services","AC repair","Refrigerator repair","TV repair","Metal painting","Exterior painting","Sofa cleaning")
         val MenuItemPrice= listOf("$4","$5","$7","$4","$4","$5","$7","$4","$4","$5","$7","$4","$4","$5","$7","$4")
         val MenuImage= listOf(
            R.drawable.plumber,
            R.drawable.plumber,R.drawable.plumber,
            R.drawable.plumber,R.drawable.plumber,
            R.drawable.plumber,R.drawable.plumber,
            R.drawable.plumber, R.drawable.plumber,
            R.drawable.plumber,R.drawable.plumber,
            R.drawable.plumber,R.drawable.plumber,
            R.drawable.plumber,R.drawable.plumber,
            R.drawable.plumber)
        binding.BackButton.setOnClickListener{
            finish()
        }
        val adapter=AddServiceAdapter(ArrayList(MenuServiceName),
            ArrayList(MenuItemPrice), ArrayList
        (MenuImage)
        )
        binding.MenuRecyclerView.layoutManager=LinearLayoutManager(this)
        binding.MenuRecyclerView.adapter=adapter
    }
}