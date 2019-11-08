package com.example.instakotlinapp.Profile

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.instakotlinapp.R
import com.example.instakotlinapp.utils.BottomNavigationViewHelper
import com.example.instakotlinapp.utils.UniversalImageLoader
import kotlinx.android.synthetic.main.activity_profile.*
import kotlinx.android.synthetic.main.activity_profile.bottomNavigationView

class ProfileActivity : AppCompatActivity() {

    private val ACTIVITY_NO = 4
    private val TAG = "ProfileActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        setupNavigationView()
        setupToolbar()
        setupButtons()
        setProfileImage()
    }

    private fun setupButtons() {
        btnProfiliDuzenle.setOnClickListener(View.OnClickListener {

            clActivityProfileRoot.visibility = View.GONE
            var transaction = supportFragmentManager.beginTransaction()
            transaction.replace(R.id.flActivityProfile, ProfileEditFragment())
            transaction.addToBackStack("Edit Profile Fragment")
            transaction.commit()
        })
    }

    private fun setupToolbar() {
        imgProfileSettings.setOnClickListener(View.OnClickListener {

            var intent = Intent(this, ProfileSettingsActivity::class.java)
            startActivity(intent)
        })
    }

    private fun setupNavigationView(){
        BottomNavigationViewHelper.setupBottomNavigationView(bottomNavigationView)
        BottomNavigationViewHelper.setupNavigation(this, bottomNavigationView)

        var menu = bottomNavigationView.menu
        var menuItem = menu.getItem(ACTIVITY_NO)
        menuItem.setChecked(true)
    }

    override fun onBackPressed() {
        clActivityProfileRoot.visibility = View.VISIBLE
        super.onBackPressed()
    }

    private fun setProfileImage(){
        val imgURI: String = "p7.hiclipart.com/preview/312/283/679/avatar-computer-icons-user-profile-business-user-avatar.jpg"
        UniversalImageLoader.setImage(imgURI, circleProfileImage, null, "https://")
    }
}
