package com.cit.american_college_app

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

import androidx.appcompat.app.AppCompatActivity

class Signup_Activity : AppCompatActivity() {
    lateinit var button:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)
        button=findViewById(R.id.btnRegister)
        button.setOnClickListener{
            Toast.makeText(this@Signup_Activity,"Succesfully Signed Up",Toast.LENGTH_SHORT).show()
            var intent=Intent(this@Signup_Activity,Registration_approval::class.java)

            startActivity(intent)
        }
    }
}