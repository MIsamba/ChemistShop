package com.example.chemistshop.ui.home

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.GridView
import android.widget.TextView
import androidx.appcompat.widget.Toolbar
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.chemistshop.database.helper.DatabaseHelper
import com.example.chemistshop.R
import com.example.chemistshop.menuitems_activity
import com.example.chemistshop.viewmodel.HomeViewModel
import kotlinx.android.synthetic.main.fragment_home.*
import com.example.chemistshop.adapter.MedAdapter
import com.example.chemistshop.ui.payment.PaymentViewModel
import com.example.chemistshop.wish_activity
import kotlinx.android.synthetic.main.app_bar_main.*

class HomeFragment  : Fragment() {


    private lateinit var homeViewModel: HomeViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        homeViewModel =
            ViewModelProviders.of(this).get(HomeViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_home, container, false)

        val textView: TextView? = root.findViewById(R.id.text_home)!!
        homeViewModel.text.observe(viewLifecycleOwner, Observer {
            textView?.text = it

            bmedicine.setOnClickListener{
                val addedMed = Intent(activity, wish_activity::class.java)
                startActivityForResult(addedMed, 1)
            }

        })

        return root
    }




    }


