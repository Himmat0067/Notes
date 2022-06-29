package com.himmat.notes.utils

import android.content.Intent
import androidx.core.content.ContextCompat
import com.himmat.notes.LoginActivity
import com.himmat.notes.SplashActivity

class IntentUtils {

    companion object{

        fun gotoLoginActivity(splashActivity: SplashActivity) {
            val intent = Intent(splashActivity,LoginActivity::class.java)
            splashActivity.startActivity(intent)
        }
    }
}