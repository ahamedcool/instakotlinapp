package com.example.instakotlinapp.utils

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class HomePagerAdapter (fragmentManager: FragmentManager): FragmentPagerAdapter(fragmentManager) {

    private var mFragmentList: ArrayList<Fragment> = ArrayList()

    override fun getItem(position: Int): Fragment {
        return mFragmentList.get(position)
    }

    override fun getCount(): Int {
        return mFragmentList.size
    }

    // custom function to populate mFragmentList
    fun addFragment(fragment: Fragment){
        mFragmentList.add(fragment)
    }

}