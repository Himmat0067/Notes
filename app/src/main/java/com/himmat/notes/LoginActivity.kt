package com.himmat.notes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import androidx.lifecycle.ViewModelStores
import com.himmat.notes.databinding.ActivityLoginBinding
import com.himmat.notes.viewmodels.LoginViewModel

class LoginActivity : AppCompatActivity() {

    private lateinit var loginViewModel: LoginViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val bindingLogin: ActivityLoginBinding = DataBindingUtil.setContentView(this,R.layout.activity_login)

        loginViewModel = ViewModelProvider(this).get(LoginViewModel::class.java)

        // send loginViewModel to xml
        bindingLogin.loginViewModel = loginViewModel

        bindingLogin.lifecycleOwner = this


    }
}