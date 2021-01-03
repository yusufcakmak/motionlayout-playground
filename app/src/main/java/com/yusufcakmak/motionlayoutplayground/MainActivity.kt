package com.yusufcakmak.motionlayoutplayground

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.button.MaterialButton
import com.yusufcakmak.motionlayoutplayground.R


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initButtons()
    }

    private fun initButtons() {
        findViewById<MaterialButton>(R.id.btnTwitter).setOnClickListener {
            startActivity(Intent(this, TwitterActivity::class.java))
        }
    }
}