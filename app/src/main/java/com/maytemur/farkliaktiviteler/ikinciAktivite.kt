package com.maytemur.farkliaktiviteler

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_ikinci_aktivite.*

class ikinciAktivite : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ikinci_aktivite)

        val intent = intent
        val alinanVeri= intent.getStringExtra("yollananVeri")
        textView2.text = alinanVeri

    }
    fun geriDon(view: View){
        val intent=Intent (applicationContext,MainActivity::class.java)
        startActivity(intent)
        finish()
    }
}