package com.himmat.notes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.himmat.notes.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val bindingLogin: ActivityLoginBinding = DataBindingUtil.setContentView(this,R.layout.activity_login);


    }
}