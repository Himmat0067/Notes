package com.himmat.notes.viewmodels

import android.util.Log
import android.widget.Toast
import androidx.databinding.Bindable
import androidx.databinding.Observable
import androidx.databinding.ObservableField
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class LoginViewModel(): ViewModel() {

    val TAG: String = "LoginViewModel"

    var inputEmailOrPhone = ObservableField("")
    var inputPassword = ObservableField("")

    fun onLoginBtnClick(){
        Log.d(TAG, "onLoginBtnClick: Login Button Clicked ${inputEmailOrPhone.get().toString()} and ${inputPassword.get().toString()}")
    }
}