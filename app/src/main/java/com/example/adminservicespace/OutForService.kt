package com.example.adminservicespace

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.adminservicespace.adapter.DeliveryAdapter
import com.example.adminservicespace.databinding.ActivityOutForServiceBinding

class OutForService : AppCompatActivity() {
    private val binding:ActivityOutForServiceBinding by lazy {
        ActivityOutForServiceBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(binding.root)
        binding.backButton.setOnClickListener{
            finish()
        }
        val customerName= arrayListOf(
            "John Doe","Jane Smith","Mike Johnson",
        )
        val moneyStatus= arrayListOf(
            "received","notReceived","Pending",
        )
        val adapter=DeliveryAdapter(customerName,moneyStatus)
        binding.deliveryRecyclerView.adapter=adapter
        binding.deliveryRecyclerView.layoutManager=LinearLayoutManager(this)
    }
}