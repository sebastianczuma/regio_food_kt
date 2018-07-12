package com.scz.produktyregionalne

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.scz.produktyregionalne.chooseProvinceMVP.ChooseProvince
import kotlinx.android.synthetic.main.activity_ask_for_permission.*

class AskForPermission : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ask_for_permission)

        button.setOnClickListener {
            val intent = Intent(this, ChooseProvince::class.java)
            this.startActivity(intent)
        }
    }
}
