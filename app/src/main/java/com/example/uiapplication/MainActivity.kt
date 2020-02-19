package com.example.uiapplication

//import android.support.v7.app.AppCompatActivity
import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toolbar
import androidx.appcompat.app.AppCompatActivity
//import android.support.design.widget.TabLayout
//import android.support.v4.view.ViewPager
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout

class MainActivity : AppCompatActivity() {

    var tabLayout: TabLayout? = null
    var viewPager: ViewPager? = null
    var toolBar:Toolbar?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

     //   var dc = supportActionBar
     //   dc!!.show()

        tabLayout = findViewById<TabLayout>(R.id.tabLayout)
        viewPager = findViewById<ViewPager>(R.id.viewPager)
//        toolBar = findViewById(R.id.tool_bar)

        tabLayout!!.addTab(tabLayout!!.newTab().setText("Fragment_1"))
        tabLayout!!.addTab(tabLayout!!.newTab().setText("Fragment_2"))
        tabLayout!!.addTab(tabLayout!!.newTab().setText("Fragment_3"))
        tabLayout!!.tabGravity = TabLayout.GRAVITY_FILL

     //   setSupportActionBar(toolBar)

        val adapter = UiAdapter(this, supportFragmentManager, tabLayout!!.tabCount)
        viewPager!!.adapter = adapter

        viewPager!!.addOnPageChangeListener(TabLayout.TabLayoutOnPageChangeListener(tabLayout))

        tabLayout!!.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
            override fun onTabSelected(tab: TabLayout.Tab) {
                viewPager!!.currentItem = tab.position
            }
            override fun onTabUnselected(tab: TabLayout.Tab) {

            }
            override fun onTabReselected(tab: TabLayout.Tab) {

            }
        })

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.actionbar_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        when(item?.itemId){
            R.id.search -> {
            //    val intent = Intent(this, SearchActivity::class.java)
            //    startActivity(intent)

                return true
            }
        }
        return super.onOptionsItemSelected(item)
    }
}