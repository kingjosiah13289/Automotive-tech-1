package com.example.automotivetech

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class SigninActivity : AppCompatActivity() {
    lateinit var username: EditText
    lateinit var userphone: EditText
    lateinit var userplatenum: EditText
    lateinit var usersignin: Button
    lateinit var userregister: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signin)
        username = findViewById(R.id.edt_username)
        userphone = findViewById(R.id.edt_userphone)
        userplatenum = findViewById(R.id.edt_usercarplate)
        usersignin = findViewById(R.id.btn_usersSignin)
        userregister = findViewById(R.id.edt_userRegister)

        userregister.setOnClickListener {
            var kurejesta = Intent(this, MainActivity::class.java)
            startActivity(kurejesta)
        }
        usersignin.setOnClickListener {
            var dereva = username.text.toString().trim()
            var mtambo = userphone.text.toString().trim()
            var nambari = userplatenum.text.toString().trim()
            var id = System.currentTimeMillis().toString()
            if (dereva.isEmpty()) {
                username.setError("Please fill this field")
                username.requestFocus()
            } else if (mtambo.isEmpty()) {
                userphone.setError("Please fill this field")
                userphone.requestFocus()
            }
         else if (nambari.isEmpty()) {
            userplatenum.setError("please fill this field")
            userplatenum.requestFocus()
        }
            startActivity(Intent(this@SigninActivity,HomepageActivity::class.java))
            finish()
    }
// Procede to homepage and services

    }
}