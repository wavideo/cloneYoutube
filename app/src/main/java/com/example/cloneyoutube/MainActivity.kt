package com.example.cloneyoutube

import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.cloneyoutube.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val categoryItems = CategoryDataManager.items
        CategoryDataManager.getItems()
        binding.rvCategories.adapter = CategoryAdapter(categoryItems)
        binding.rvCategories.isNestedScrollingEnabled = false
        //리사이클러뷰 ListAdapter 뷰타입
        binding.rvCategories.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)

        val  videoItems = VideoDataManager.items
        VideoDataManager.getItems()
//        Log.i("item_test", videoItems.toString())
        binding.rvVideos.adapter = VideoAdapter(videoItems)
        binding.rvVideos.layoutManager = LinearLayoutManager(this)

    }
}