package com.cit.american_college_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import org.w3c.dom.Text

class Login_Activity : AppCompatActivity() {
    lateinit var btn:Button
    lateinit var txt:TextView
    lateinit var txt1:TextView
    lateinit var uid:TextView
    lateinit var pwd:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        btn=findViewById(R.id.btnLogin)
        txt=findViewById(R.id.txtRegisterYourself)
        txt1=findViewById(R.id.txtForgotPassword)
        uid=findViewById(R.id.userid)
        pwd=findViewById(R.id.Password)
        val validid="app_123"
        val passw="password"
        btn.setOnClickListener{
            val userid=uid.text.toString()
            val pass=pwd.text.toString()
            if((userid==validid) && (pass==passw)) {


                var intent = Intent(this@Login_Activity, MainActivity::class.java)
                startActivity(intent)
            }
            else{
                Toast.makeText(this@Login_Activity,"Incorrect Credentials",Toast.LENGTH_LONG).show()
            }
        }
        txt.setOnClickListener{
            var i=Intent(this@Login_Activity,Signup_Activity::class.java)
            startActivity(i)
        }
        txt1.setOnClickListener{
            var i1=Intent(this@Login_Activity,forget_pwd::class.java)
            startActivity(i1)
        }
    }
}