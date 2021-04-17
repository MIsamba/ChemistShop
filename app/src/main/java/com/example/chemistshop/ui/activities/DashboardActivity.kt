package com.example.chemistshop.ui.activities

import android.os.Bundle
import androidx.core.content.ContextCompat
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.NavigationUI
import androidx.navigation.ui.NavigationUI.setupActionBarWithNavController
import androidx.navigation.ui.NavigationUI.setupWithNavController
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.example.chemistshop.R
import com.google.android.material.bottomnavigation.BottomNavigationView
import kotlinx.android.synthetic.main.activity_dashboard.*


/**
 *  Dashboard Screen of the app.
 */
class DashboardActivity : BaseActivity() {

    lateinit var appBarConfiguration: AppBarConfiguration
    lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        // Update the background color of the action bar as per our design requirement.
        supportActionBar!!.setBackgroundDrawable(
            ContextCompat.getDrawable(
                this@DashboardActivity,
                R.drawable.app_gradient_color_background
            )
        )

        //bottom nav
         navController = findNavController(R.id.nav_host_fragment_dash)
        bottom_navigation.setupWithNavController(navController)

        //navigation up arrow button and menu
        //appbarconf return the navgraph

        appBarConfiguration = AppBarConfiguration(navController.graph,drawer_layout)

        //creates arrow button

        NavigationUI.setupActionBarWithNavController(this,navController)

        //Drawer layout

        NavigationUI.setupWithNavController(nav_view,navController)

   }

    override fun onSupportNavigateUp(): Boolean {
        return NavigationUI.navigateUp(navController,appBarConfiguration)
    }

    override fun onBackPressed() {
        doubleBackToExit()
    }
}
