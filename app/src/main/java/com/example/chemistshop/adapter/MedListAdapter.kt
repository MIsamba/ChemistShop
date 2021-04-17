package com.example.chemistshop.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.chemistshop.R
import com.example.chemistshop.model.Iskmedicine
import kotlinx.android.synthetic.main.list_item.view.*

class MedListAdapter (

    private val context: Context
    ) : RecyclerView.Adapter<MedListAdapter.IskmedicineViewHolder>() {

        private lateinit var iskmedicineList: ArrayList<Iskmedicine>

        override fun onCreateViewHolder(
            parent: ViewGroup,
            viewType: Int
        ): IskmedicineViewHolder {

            val itemView = LayoutInflater.from(context).inflate(R.layout.list_item, parent, false)
            return IskmedicineViewHolder(
                itemView
            )
        }

        override fun getItemCount(): Int = iskmedicineList.size



        override fun onBindViewHolder(holder: IskmedicineViewHolder, position: Int) {

            val iskmedicine = iskmedicineList[position]
            holder.setData(iskmedicine.name, iskmedicine.designation)

        }

        fun setMedicine(iskmedicine: ArrayList<Iskmedicine>) {

            iskmedicineList = iskmedicine
            notifyDataSetChanged()
        }

        class IskmedicineViewHolder(itemView: View)  : RecyclerView.ViewHolder(itemView) {

            fun setData(name: String, designation: String) {
                itemView.tvEmpName.text = name
                itemView.tvEmpDesignation.text = designation

            }
        }
    }

