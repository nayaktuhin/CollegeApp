package salty.contaminated.collegeapp.onboarding

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_view_pager.view.*
import salty.contaminated.collegeapp.R
import salty.contaminated.collegeapp.onboarding.screens.FirstScreen
import salty.contaminated.collegeapp.onboarding.screens.SecondScreen
import salty.contaminated.collegeapp.onboarding.screens.ThirdScreen
import salty.contaminated.collegeapp.onboarding.screens.ZeroScreen


class ViewPagerFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val view =  inflater.inflate(R.layout.fragment_view_pager, container, false)

        // here we pass our fragments screens
        val fragmentList = arrayListOf<Fragment>(
                ZeroScreen(),
                FirstScreen(),
                SecondScreen(),
                ThirdScreen()
        )

        val adapter = ViewPagerAdapter(
                fragmentList,
                requireActivity().supportFragmentManager,
                lifecycle
        )

        // add plugin kotlin-android-extension so that view can access the fragment layout id
        view.viewPager2.adapter = adapter

        return view
    }

}