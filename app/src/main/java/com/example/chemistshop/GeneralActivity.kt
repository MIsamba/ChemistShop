package com.example.chemistshop

import android.Manifest
import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.example.chemistshop.ui.activities.BaseActivity
import com.example.chemistshop.ui.home.HomeFragment
import com.example.chemistshop.ui.prescription.PrescriptionFragment
import com.google.android.material.navigation.NavigationView
import kotlinx.android.synthetic.main.activity_menuitems.*
import kotlinx.android.synthetic.main.app_bar_main.*


class GeneralActivity : BaseActivity() /*, NavigationView.OnNavigationItemSelectedListener*/ {

    private lateinit var appBarConfiguration: AppBarConfiguration

    lateinit var toggle : ActionBarDrawerToggle

    val phone = "0000000000"
    val REQUEST_PHONE_CALL = 1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menuitems)

      /*

        fab.setOnClickListener {

            if (ActivityCompat.checkSelfPermission(
                    this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED
            ) {
                ActivityCompat.requestPermissions(
                    this,
                    arrayOf(Manifest.permission.CALL_PHONE),
                    REQUEST_PHONE_CALL
                )
            } else {
                startCall()
            }
        }



         toggle = ActionBarDrawerToggle(
            this, drawer_layout, toolbar, R.string.navigation_drawer_open,R.string.navigation_drawer_close
        )
        drawer_layout.addDrawerListener(toggle)
        toggle.syncState()

        nav_view.setNavigationItemSelectedListener(this)



        val drawerLayout: DrawerLayout = findViewById(R.id.drawer_layout)
        val navView: NavigationView = findViewById(R.id.nav_view)
        val navController = findNavController(R.id.nav_host_fragment)

        setSupportActionBar(toolbar)
        setupActionBarWithNavController(navController, appBarConfiguration)
        navView.setupWithNavController(navController)


        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        this.appBarConfiguration = AppBarConfiguration(
            setOf(
               R.id.nav_home,R.id.nav_payment, R.id.nav_prescription, R.id.nav_track
            ), drawerLayout
        )



    }



    override fun onBackPressed() {
        if (drawer_layout.isDrawerOpen(GravityCompat.START)) {
            drawer_layout.closeDrawer(GravityCompat.START)
        } else {
            super.onBackPressed()
        }

    }

    private fun startCall() {
        val callIntent = Intent(Intent.ACTION_CALL)
        callIntent.setData( Uri.parse("tel://" + phone))
        startActivity(callIntent)

    }


    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<out String>,
        grantResults: IntArray
    ) {
        if(requestCode == REQUEST_PHONE_CALL)startCall()
    }


    override fun onSupportNavigateUp(): Boolean {
        val navController = findNavController(R.id.nav_host_fragment)
        return navController.navigateUp(appBarConfiguration) || super.onSupportNavigateUp()
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        when(item.itemId){

            R.id.nav_home -> {
                startActivity(Intent(this, HomeFragment::class.java))
            }

            R.id.nav_payment -> {
            startActivity(Intent(this, wish_activity::class.java))
            }
            R.id.nav_prescription -> {
                startActivity(Intent(this, PrescriptionFragment::class.java))

            }
            R.id.nav_track -> {
                startActivity(Intent(this, wish_activity::class.java))
            }
        }
        drawer_layout.closeDrawer(GravityCompat.START)
        return true
    }

*/

}}