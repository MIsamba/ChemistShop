package com.example.chemistshop.ui.prescription

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class PrescriptionViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Please Upload Prescription"
    }
    val text: LiveData<String> = _text
}

