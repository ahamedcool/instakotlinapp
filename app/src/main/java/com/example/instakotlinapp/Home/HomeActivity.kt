package com.example.instakotlinapp.Home

import android.graphics.Color
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.annotation.RequiresApi
import com.example.instakotlinapp.R
import com.example.instakotlinapp.utils.BottomNavigationViewHelper
import com.example.instakotlinapp.utils.HomePagerAdapter
import kotlinx.android.synthetic.main.activity_home.*

class HomeActivity : AppCompatActivity() {

    private val ACTIVITY_NO = 0
    private val TAG = "HomeActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        setupNavigationView()
        setupHomeViewPager()
    }


    fun setupNavigationView(){
        BottomNavigationViewHelper.setupBottomNavigationView(bottomNavigationView)
        BottomNavigationViewHelper.setupNavigation(this, bottomNavigationView)

        var menu = bottomNavigationView.menu
        //var menuItem = menu.findItem(R.id.ic_home)
        var menuItem = menu.getItem(ACTIVITY_NO)
        menuItem.setChecked(true)
        //menuItem.icon.setTint(Color.argb(0, 255, 0, 0))
    }

    private fun setupHomeViewPager() {
        var homePagerAdapter = HomePagerAdapter(supportFragmentManager)
        homePagerAdapter.addFragment(CameraFragment())         // index 0
        homePagerAdapter.addFragment(HomeFragment())           // index 1
        homePagerAdapter.addFragment(MessagesFragment())       // index 2

        homeViewPager.adapter = homePagerAdapter

        homeViewPager.setCurrentItem(1)                        // index of HomeFragment
    }
}
