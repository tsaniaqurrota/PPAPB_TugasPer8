package com.example.tugasper8

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.viewpager.widget.ViewPager
import androidx.viewpager2.widget.ViewPager2
import com.example.tugasper8.databinding.ActivityMainBinding
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {

    lateinit var mediator: TabLayoutMediator
    lateinit var viewPager2: ViewPager2

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        with(binding){

            viewPager.adapter =  TabAdapter(supportFragmentManager, this@MainActivity.lifecycle)
            viewPager2 = viewPager
            mediator = TabLayoutMediator(tabLayout, viewPager)
            {tab,position ->
                when (position){
                    0->tab.text = "Register"
                    1->tab.text = "Login"
                }
            }
            mediator.attach()

        }
    }



//    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
//        menuInflater.inflate(R.menu.menu_option, menu)
//        return super.onCreateOptionsMenu(menu)
//    }

//    override fun onOptionsItemSelected(item: MenuItem): Boolean {
//        return when (item.itemId) {
//            R.id.action_logout -> {
//                Toast.makeText(this, "Logout", Toast.LENGTH_LONG).show()
//                true
//            }
//            else-> {true}
//        }
//    }



}