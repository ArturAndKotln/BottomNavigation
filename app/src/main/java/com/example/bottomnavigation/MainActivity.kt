package com.example.bottomnavigation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.bottomnavigation.databinding.ActivityMainBinding
import com.example.material.databinding.ActivityMainBinding
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    private var binding: ActivityMainBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)


        supportFragmentManager.beginTransaction().replace(R.id.content, Home()).commit()

        binding?.bottomNav?.setOnItemReselectedListener { item ->

            when(item.itemId) {
                R.id.homeItemBotNav -> supportFragmentManager.beginTransaction().replace(R.id.content, Home()).commit()
                R.id.shopItemBotNav -> {}
                R.id.carItemBotNav -> {}
                R.id.accountItemBotNav -> {}
            }

            return@setOnItemReselectedListener


        }
        binding?.bottomNav?.selectedItemId = R.id.homeItemBotNav
    }

}