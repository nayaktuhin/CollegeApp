package salty.contaminated.collegeapp.onboarding.screens

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.viewpager2.widget.ViewPager2
import kotlinx.android.synthetic.main.fragment_zero_screen.view.*
import salty.contaminated.collegeapp.R

class ZeroScreen : Fragment() {


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_zero_screen, container, false)

        val viewPager = activity?.findViewById<ViewPager2>(R.id.viewPager2)

        view.next0.setOnClickListener {
            viewPager?.currentItem = 1
        }


        return view
    }


}