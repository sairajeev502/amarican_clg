package com.cit.american_college_app

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

import androidx.appcompat.app.AppCompatActivity

class Registration_approval : AppCompatActivity() {
    lateinit var b1:Button
    lateinit var b2:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registration_approval)
        b1=findViewById(R.id.ap1)
        b2=findViewById(R.id.rr1)
        b1.setOnClickListener{

            var intent= Intent(this@Registration_approval,Login_Activity::class.java)

            startActivity(intent)
        }
        b2.setOnClickListener{

            var intent=Intent(this@Registration_approval,Signup_Activity::class.java)

            startActivity(intent)
        }

    }
}