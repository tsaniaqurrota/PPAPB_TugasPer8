package com.example.tugasper8

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.viewpager2.widget.ViewPager2
import com.example.tugasper8.databinding.ActivityWelcomeBinding
import com.example.tugasper8.databinding.FragmentLoginBinding
import com.google.android.material.tabs.TabLayoutMediator

class WelcomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        title = "Dashboard"

        val binding = ActivityWelcomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setContentView(R.layout.activity_welcome)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_option, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.action_logout -> {
                val intent =
                    Intent(this@WelcomeActivity, MainActivity::class.java)
                    startActivity(intent)
                true
            }

            else -> {
                true
            }
        }
    }


}
