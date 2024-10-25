package com.zukira.uts_raidatulzukira_mi2a

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class LaunchWelcomeActivity : AppCompatActivity() {
    private lateinit var btnLogin : Button
    private lateinit var btnSignUp : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_launch_welcome)

        btnLogin = findViewById(R.id.btnLogIn)
        btnSignUp = findViewById(R.id.btnSignUp)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        btnLogin.setOnClickListener() {
            val intentMenu2 = Intent(this@LaunchWelcomeActivity, LogInActivity::class.java)
            startActivity(intentMenu2)
        }
        btnSignUp.setOnClickListener(){
            val intentMenu2 = Intent(this@LaunchWelcomeActivity, PageRegisterActivity::class.java)
            startActivity(intentMenu2)
        }
    }
}