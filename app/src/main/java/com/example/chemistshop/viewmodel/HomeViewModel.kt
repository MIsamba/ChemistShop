package com.example.chemistshop.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.chemistshop.R
import com.example.chemistshop.model.Medicine
import kotlin.collections.ArrayList

class HomeViewModel : ViewModel {



    private val _text = MutableLiveData<String>().apply {
        value = "This is home Fragment"
    }
    val text: LiveData<String> = _text

    var id =""
    var name =""
    var decription = ""
    var imagepath = ""



    constructor() : super()

    constructor(medicine : Medicine) : super()
    {
        this.id = medicine.id
        this.name = medicine.name
        this.decription = medicine.decription
        this.imagepath = medicine.imagepath
    }

        var arraylistmutablelivedata = MutableLiveData<ArrayList<HomeViewModel>>()

        var arraylist = ArrayList<HomeViewModel>()




    fun getArrayList(): MutableLiveData<ArrayList<HomeViewModel>>
    {

        val medicine1= Medicine("1", "Salmon Omega", "Rich in vitamin E", "image1.png")
        val medicine2= Medicine("2", "Calcimax", "Rich in vitamin B", "image2.png")

        val homeViewModel1 : HomeViewModel =  HomeViewModel(medicine1)
        val homeViewModel2 : HomeViewModel =  HomeViewModel(medicine2)

        arraylist.add(homeViewModel1)
        arraylist.add(homeViewModel2)


        return arraylistmutablelivedata
    }


}