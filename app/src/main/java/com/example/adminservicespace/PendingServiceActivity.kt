package com.example.adminservicespace

import android.os.Bundle
import android.view.LayoutInflater
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.adminservicespace.adapter.DeliveryAdapter
import com.example.adminservicespace.adapter.PendingOrderAdapter
import com.example.adminservicespace.databinding.ActivityPendingServiceBinding
import com.example.adminservicespace.databinding.PendingOrderItemBinding

class PendingServiceActivity : AppCompatActivity() {
    private lateinit var binding:ActivityPendingServiceBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityPendingServiceBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.backButton.setOnClickListener{
            finish()
        }
        val orderedCustomerName= arrayListOf(
            "John Doe","Jane Smith","Mike Johnson",
        )
        val PriceTextView= arrayListOf(
            "7","6","5",
        )
        val orderedFoodImage= arrayListOf(
            R.drawable.plumber,
            R.drawable.plumber,
            R.drawable.plumber,
        )

        val adapter= PendingOrderAdapter(orderedCustomerName,PriceTextView,orderedFoodImage, this)
        binding.pendingServiceRecyclerView.adapter=adapter
        binding.pendingServiceRecyclerView.layoutManager= LinearLayoutManager(this)
    }
}