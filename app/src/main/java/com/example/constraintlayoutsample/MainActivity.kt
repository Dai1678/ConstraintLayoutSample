package com.example.constraintlayoutsample

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        activity_main_send_button.setOnClickListener {
            val inputMessage = activity_main_edit.text.toString()
            if (inputMessage.isEmpty()) {
                activity_main_result_text.text = "何かテキストを入力してください！"
            } else {
                activity_main_result_text.text = "送信しました: $inputMessage"

                val intent = SecondActivity.createIntent(this)
                intent.putExtra(SecondActivity.KEY, inputMessage)
                startActivity(intent)

                activity_main_edit.text.clear()
            }
        }
    }
}
