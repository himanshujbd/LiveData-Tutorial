package com.madhusudan.livedatademo

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MyViewModel : ViewModel()
{
    val edittextName = MutableLiveData<String>()
    val edittextEmail = MutableLiveData<String>()
}