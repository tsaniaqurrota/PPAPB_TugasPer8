package com.example.tugasper8

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.tugasper8.LoginFragment
import com.example.tugasper8.RegisterFragment

class TabAdapter(fm:FragmentManager, lifecycle: Lifecycle): FragmentStateAdapter(fm, lifecycle) {
    val page = arrayOf(RegisterFragment(), LoginFragment())
    override fun getItemCount(): Int {
        return page.size
    }

    override fun createFragment(position: Int): Fragment {
        return page[position]
    }

}