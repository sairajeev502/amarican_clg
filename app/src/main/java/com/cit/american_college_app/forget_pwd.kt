package com.cit.american_college_app

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class forget_pwd: AppCompatActivity() {
    lateinit var btn: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.forget_pwd)
        btn = findViewById(R.id.btnForgotNext)
        btn.setOnClickListener {
            Toast.makeText(this@forget_pwd,"Password changed successfully", Toast.LENGTH_SHORT).show()
            var intent = Intent(this@forget_pwd, Login_Activity::class.java)
            startActivity(intent)
        }
    }
}