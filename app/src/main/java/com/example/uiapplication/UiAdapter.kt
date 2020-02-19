package com.example.uiapplication
import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class UiAdapter(private val myContext: Context, fm: FragmentManager, internal var totalTabs: Int) : FragmentPagerAdapter(fm, FragmentPagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT)
{

    // this is for fragment tabs
    override fun getItem(position: Int) : Fragment {
        when (position) {
            0 -> {
                return Fragment_1()
            }
            1 -> {
                return Fragment_2()
            }
            else -> {
                return Fragment_3()
            }
        }
    }
        // this counts total number of tabs
         override fun getCount(): Int {
            return totalTabs
        }
    }



