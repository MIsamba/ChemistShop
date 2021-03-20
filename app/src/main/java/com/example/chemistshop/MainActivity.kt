package com.example.chemistshop

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import androidx.annotation.NonNull
import androidx.fragment.app.Fragment
import com.example.chemistshop.ui.home.HomeFragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import kotlinx.android.synthetic.main.botton_nav.*

class MainActivity : AppCompatActivity() {

    internal lateinit var bottomNavigationView: BottomNavigationView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.botton_nav)
         // bottomNavigationView = findViewById(R.id.bottomNavigationView)
        //bottomNavigationView.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)
        //loadFragment(HomeFragment())

   }

/*
    private  val mOnNavigationItemSelectedListener = object :BottomNavigationView.OnNavigationItemSelectedListener() {
        override fun onNavigationItemSelected(@NonNull item: MenuItem): Boolean {
            val fragment :Fragment
            when(item.itemId){
                R.id.home_nav -> {
                    fragment = HomeFragment()
                    loadFragment(fragment)
                    return true
                }
            }
                return false
            }
        }


        private  fun loadFragment(fragment: Fragment){
            val transaction = supportFragmentManager.beginTransaction()
            transaction.replace(R.id.frameContainer, fragment);
            transaction.addToBackStack(null);
            transaction.commit()

        }
*/

    }



