package com.utsmp.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        imgBtn_about.setOnClickListener {
            val proIntent = Intent(this, TentangActivity::class.java)
            startActivity(proIntent)
        }
        imgBtn_kalkulator.setOnClickListener {
            val proIntent = Intent(this, KalkulatorActivity::class.java)
            startActivity(proIntent)
        }
        imgBtn_Berita.setOnClickListener {
            val proIntent = Intent(this, BeritaActivity::class.java)
            startActivity(proIntent)
        }
        imgBtn_Close.setOnClickListener {
            finish();
        }
    }
}
