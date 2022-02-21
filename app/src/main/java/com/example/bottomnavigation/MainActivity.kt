package com.example.bottomnavigation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.bottomnavigation.databinding.ActivityMainBinding



class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //установка первого фрогмено home
//        supportFragmentManager.beginTransaction().replace(R.id.content, Home()).commit()
        binding.bottomNav.setOnItemReselectedListener{item ->
//
            when(item.itemId){
                R.id.homeItemBotNav -> supportFragmentManager.beginTransaction().replace(androidx.appcompat.R.id.content, Home()).commit()
                R.id.shopItemBotNav -> supportFragmentManager.beginTransaction().replace(androidx.appcompat.R.id.content, Shop()).commit()
                R.id.carItemBotNav -> supportFragmentManager.beginTransaction().replace(androidx.appcompat.R.id.content, Car()).commit()
                R.id.accountItemBotNav -> supportFragmentManager.beginTransaction().replace(androidx.appcompat.R.id.content, Account()).commit()
            }
            return@setOnItemReselectedListener
        }
        binding.bottomNav.selectedItemId = R.id.homeItemBotNav
    }

}
