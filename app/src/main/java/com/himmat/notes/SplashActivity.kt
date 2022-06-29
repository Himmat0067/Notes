package com.himmat.notes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import androidx.databinding.DataBindingUtil
import com.himmat.notes.databinding.ActivitySplashBinding
import com.himmat.notes.utils.IntentUtils

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val bindingSplash : ActivitySplashBinding = DataBindingUtil.setContentView(this,R.layout.activity_splash)

        Handler().postDelayed({
            IntentUtils.gotoLoginActivity(this)
            finish()
        },3000)
    }
}