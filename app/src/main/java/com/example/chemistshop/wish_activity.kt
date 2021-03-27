package com.example.chemistshop

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.chemistshop.adapter.MedListAdapter
import com.example.chemistshop.database.DataManager
import com.example.chemistshop.database.helper.DatabaseHelper
import kotlinx.android.synthetic.main.activity_main.*

class wish_activity : AppCompatActivity() {

    lateinit var databaseHelper: DatabaseHelper
    private val medListAdapter =
        MedListAdapter(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        databaseHelper =
            DatabaseHelper(this)
        recyclerView.adapter = medListAdapter
        recyclerView.layoutManager = LinearLayoutManager(this)
        medListAdapter.setMedicine(DataManager.fetchAllEmployees(databaseHelper))


    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if (resultCode == Activity.RESULT_OK) {
            medListAdapter.setMedicine(DataManager.fetchAllEmployees(databaseHelper))
        }
    }
}

