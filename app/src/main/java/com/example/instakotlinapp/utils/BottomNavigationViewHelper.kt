package com.example.instakotlinapp.utils

import android.content.Context
import android.content.Intent
import android.view.MenuItem
import androidx.core.view.get
import com.example.instakotlinapp.Home.HomeActivity
import com.example.instakotlinapp.News.NewsActivity
import com.example.instakotlinapp.Profile.ProfileActivity
import com.example.instakotlinapp.R
import com.example.instakotlinapp.Search.SearchActivity
import com.example.instakotlinapp.Share.ShareActivity
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.ittianyu.bottomnavigationviewex.BottomNavigationViewEx

class BottomNavigationViewHelper {

    companion object {

        fun setupBottomNavigationView(bottomNavigationViewEx: BottomNavigationViewEx){

            bottomNavigationViewEx.enableAnimation(false)
            bottomNavigationViewEx.enableItemShiftingMode(false)
            bottomNavigationViewEx.enableShiftingMode(false)
            bottomNavigationViewEx.setTextVisibility(false)

            val iconSize: Float = 35f
            bottomNavigationViewEx.setIconSize(iconSize)
        }

        fun setupNavigation(context: Context, bottomNavigationViewEx: BottomNavigationViewEx){

            bottomNavigationViewEx.onNavigationItemSelectedListener = object: BottomNavigationView.OnNavigationItemSelectedListener{
                override fun onNavigationItemSelected(item: MenuItem): Boolean {

                    when(item.itemId){

                        R.id.ic_home -> {
                            val intent = Intent(context, HomeActivity::class.java).setFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION)
                            context.startActivity(intent)
                            return true
                        }

                        R.id.ic_search -> {
                            val intent = Intent(context, SearchActivity::class.java).setFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION)
                            context.startActivity(intent)
                            return true
                        }

                        R.id.ic_share-> {
                            val intent = Intent(context, ShareActivity::class.java).setFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION)
                            context.startActivity(intent)
                            return true
                        }

                        R.id.ic_news -> {
                            val intent = Intent(context, NewsActivity::class.java).setFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION)
                            context.startActivity(intent)
                            return true
                        }

                        R.id.ic_profile -> {
                            val intent = Intent(context, ProfileActivity::class.java).setFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION)
                            context.startActivity(intent)
                            return true
                        }
                    }
                    return false
                }
            }
        }

    }

}