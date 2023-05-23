package com.owoko.androidintro

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class RegisterActivity : AppCompatActivity() {
    lateinit var BUttonRegister:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        BUttonRegister=findViewById(R.id.btn_register)

        BUttonRegister.setOnClickListener {
            val intent= Intent(this,animeactivity::class.java)
            startActivity(intent)
        }
    }
}