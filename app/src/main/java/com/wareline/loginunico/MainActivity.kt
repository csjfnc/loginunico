package com.wareline.loginunico

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.wareline.login.LoginUnico

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        LoginUnico().getOauth2("")
    }
}