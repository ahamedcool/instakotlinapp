package com.example.instakotlinapp.Profile


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView

import com.example.instakotlinapp.R
import com.example.instakotlinapp.utils.UniversalImageLoader
import com.nostra13.universalimageloader.core.ImageLoader
import kotlinx.android.synthetic.main.fragment_profile_edit.*
import kotlinx.android.synthetic.main.fragment_profile_edit.view.*

/**
 * A simple [Fragment] subclass.
 */
class ProfileEditFragment : Fragment() {

    lateinit var imageView: ImageView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_profile_edit, container, false)
        imageView = view!!.findViewById(R.id.circleProfileImageInFragment)

        setupToolbar(view)
        setupProfilePicture()

        return view
    }

    private fun setupToolbar(view: View){

        // Close Button
        view.imgClose.setOnClickListener(View.OnClickListener {
            activity?.onBackPressed()
        })

        // Apply Button
        view.imgCheck.setOnClickListener(View.OnClickListener {
            TODO("Place apply button functionality here.")
        })
    }


    private fun setupProfilePicture(){
        var imgURI: String = "p7.hiclipart.com/preview/312/283/679/avatar-computer-icons-user-profile-business-user-avatar.jpg"
        UniversalImageLoader.setImage(imgURI, imageView, null, "https://")
    }

}
