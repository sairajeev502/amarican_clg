package com.cit.american_college_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.FrameLayout
import android.widget.Toolbar
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.coordinatorlayout.widget.CoordinatorLayout
import androidx.drawerlayout.widget.DrawerLayout
import com.fragments.*
import com.google.android.material.navigation.NavigationView

class MainActivity : AppCompatActivity()   {

    lateinit var drawerLayout: DrawerLayout
    lateinit var coordinatorLayout: CoordinatorLayout
    lateinit var frameLayout: FrameLayout
    lateinit var navigationView: NavigationView
    lateinit var toolbar: Toolbar



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        drawerLayout = findViewById(R.id.drawer_layout)
        coordinatorLayout = findViewById(R.id.coordinatorlayout)
        frameLayout = findViewById(R.id.frame)
        navigationView = findViewById(R.id.navigation_view)


        //toolbar = findViewById(R.id.toolbar)
        setuptoolbar()
        val actionBarDrawerToggle = ActionBarDrawerToggle(this@MainActivity, drawerLayout, R.string.open_drawer, R.string.close_drawer)
        drawerLayout.addDrawerListener(actionBarDrawerToggle)
        actionBarDrawerToggle.syncState()
        navigationView.setNavigationItemSelectedListener {

            when (it.itemId) {
                R.id.home -> {
                    supportFragmentManager
                            .beginTransaction().replace(R.id.frame, Home()).addToBackStack("Home").commit()
                    supportActionBar?.title = "Home"
                    drawerLayout.closeDrawers()
                }
                R.id.Digital_id -> {
                    supportFragmentManager
                            .beginTransaction().replace(R.id.frame, Digital_ID()).addToBackStack("Digital ID").commit()
                    supportActionBar?.title = "Digital ID"
                    drawerLayout.closeDrawers()

                }
                R.id.profile_update -> {
                    supportFragmentManager
                            .beginTransaction().replace(R.id.frame, Profile_update()).addToBackStack("Profile Update").commit()
                    supportActionBar?.title = "Profile Update"
                    drawerLayout.closeDrawers()

                }
                R.id.rewards -> {
                    supportFragmentManager
                            .beginTransaction().replace(R.id.frame, Rewards_Recognition()).addToBackStack("Rewards and Recognition").commit()
                    supportActionBar?.title = "Rewards and Recognition"
                    drawerLayout.closeDrawers()

                }
                R.id.career -> {
                    supportFragmentManager
                            .beginTransaction().replace(R.id.frame, Career_Support()).addToBackStack("Career Support").commit()
                    supportActionBar?.title = "Career Support"
                    drawerLayout.closeDrawers()

                }
                R.id.events -> {
                    supportFragmentManager
                            .beginTransaction().replace(R.id.frame, Events()).addToBackStack("Events").commit()
                    supportActionBar?.title = "Events"
                    drawerLayout.closeDrawers()

                }
                R.id.contact -> {
                    supportFragmentManager
                            .beginTransaction().replace(R.id.frame, Contact()).addToBackStack("Contact").commit()
                    supportActionBar?.title = "Contact"
                    drawerLayout.closeDrawers()

                }
                R.id.form -> {
                    supportFragmentManager
                            .beginTransaction().replace(R.id.frame, Form_Blog()).addToBackStack("Form/Blog").commit()
                    supportActionBar?.title = "Form/Blog"
                    drawerLayout.closeDrawers()

                }


            }
            return@setNavigationItemSelectedListener true

        }
    }




    fun setuptoolbar() {

            //setSupportActionBar(toolbar)
            supportActionBar?.title = "toolbar title"
            supportActionBar?.setHomeButtonEnabled(true)
            supportActionBar?.setDisplayHomeAsUpEnabled(true)

        }



}