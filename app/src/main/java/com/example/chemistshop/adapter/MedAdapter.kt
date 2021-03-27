package com.example.chemistshop.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.FragmentActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.chemistshop.R
import com.example.chemistshop.databinding.MedicineBinding
import com.example.chemistshop.viewmodel.HomeViewModel



class MedAdapter(private val context: FragmentActivity?, private val arrayList: ArrayList<HomeViewModel>): RecyclerView.Adapter<MedAdapter.MedView>()
{

    class MedView(val medicineBinding: MedicineBinding) :RecyclerView.ViewHolder(medicineBinding.root)
    {
        fun bind(homeViewModel: HomeViewModel)
        {
            this.medicineBinding.medicine = homeViewModel
            medicineBinding.executePendingBindings ()
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MedView{


        val layoutInflater = LayoutInflater.from(parent.context)
        val medicineBinding: MedicineBinding= DataBindingUtil.inflate(layoutInflater, R.layout.activity_start,parent,false)
        return MedView(medicineBinding)

    }

    override fun getItemCount(): Int = arrayList.size




    override fun onBindViewHolder(holder: MedView, position: Int) {

        val homeViewModel = arrayList[position]
        holder.bind(homeViewModel)


    }


}