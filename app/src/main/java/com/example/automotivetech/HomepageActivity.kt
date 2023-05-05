package com.example.automotivetech

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class HomepageActivity : AppCompatActivity() {
    lateinit var allservices : Button
    lateinit var puchaseautos : Button
    lateinit var findmechanic : Button
    lateinit var insurances : Button
    lateinit var ntsawebsite : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_homepage)
        allservices = findViewById(R.id.btn_procedetoservices)
        puchaseautos = findViewById(R.id.btn_autospares)
        findmechanic = findViewById(R.id.btn_mechanic)
        insurances = findViewById(R.id.btn_vehicleinsurance)
        ntsawebsite = findViewById(R.id.btn_ntsaweb)

        allservices.setOnClickListener {
            var all = Intent(this, ServicesActivity::class.java)
            startActivity(all)
        }
        ntsawebsite.setOnClickListener {
            var webweb = Intent(this, NtsawebsiteActivity::class.java)
            startActivity(webweb)
        }

    }
}