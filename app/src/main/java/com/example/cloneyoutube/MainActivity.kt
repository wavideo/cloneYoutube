package com.example.cloneyoutube

import android.content.Intent
import android.os.Bundle
import android.text.TextUtils.replace
import android.util.Log
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.fragment.app.Fragment
import androidx.fragment.app.commit
import androidx.lifecycle.ReportFragment.Companion.reportFragment
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

        CategoryAdapter(categoryItems).itemClick = object  : CategoryAdapter.ItemClick {
            override fun onClick(view: View, position: Int) {
                TODO("Not yet implemented")
            }
        }

        val  videoItems = VideoDataManager.items
        VideoDataManager.getItems()
        val videoAdapter = VideoAdapter(videoItems)
//        Log.i("item_test", videoItems.toString())
        binding.rvVideos.adapter = videoAdapter
        binding.rvVideos.layoutManager = LinearLayoutManager(this)

        Log.i ("onclick_test", videoItems[0].title.toString())
        Log.i ("onclick_test", videoItems[1].title.toString())

        videoAdapter.itemClick = object : VideoAdapter.ItemClick {
            override fun onClick(view: View, position: Int) {
                Log.i("onclick_test", "눌림")
                val myItem = videoItems[position]
                Log.i("onclick_test", myItem.title.toString())
                val fragment = VideoFragment.newInstance(myItem, myItem.title)
                setFragment(fragment)
            }

            private fun setFragment (frag : Fragment){
                supportFragmentManager.commit {
                    replace(R.id.fv_video_player, frag)
                    setReorderingAllowed(true)
                    addToBackStack("")

                }
            }
        }



    }
}