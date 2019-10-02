package com.example.constraintlayoutsample

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        activity_second_result_text.text = intent.getStringExtra(KEY)

        activity_second_back_button.setOnClickListener {
            finish()
        }
    }

    companion object {
        const val KEY = "INPUT"

        fun createIntent(context: Context): Intent = Intent(context, SecondActivity::class.java)
    }
}
