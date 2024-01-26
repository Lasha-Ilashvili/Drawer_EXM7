package com.example.drawer_exm7.presentation.screen

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.drawer_exm7.databinding.ActivityMainBinding
import com.example.drawer_exm7.presentation.model.DrawerItems

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.rvItems.adapter = MainRecyclerAdapter().apply {
            setData(DrawerItems.getDefaultItems())
        }
    }
}