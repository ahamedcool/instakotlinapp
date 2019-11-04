package com.example.instakotlinapp.Share

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.instakotlinapp.R
import com.example.instakotlinapp.utils.BottomNavigationViewHelper
import kotlinx.android.synthetic.main.activity_home.*

class ShareActivity : AppCompatActivity() {

    private val ACTIVITY_NO = 2
    private val TAG = "ShareActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_share)

        setupNavigationView()
    }

    fun setupNavigationView(){
        BottomNavigationViewHelper.setupBottomNavigationView(bottomNavigationView)
        BottomNavigationViewHelper.setupNavigation(this, bottomNavigationView)

        var menu = bottomNavigationView.menu
        var menuItem = menu.getItem(ACTIVITY_NO)
        menuItem.setChecked(true)
    }
}
