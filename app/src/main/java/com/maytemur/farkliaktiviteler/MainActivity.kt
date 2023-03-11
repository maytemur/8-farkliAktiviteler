package com.maytemur.farkliaktiviteler

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //var numara=1
        println("onCreate çağrıldı")

    }
    override fun onStart() {
        super.onStart()
        println("onStart çağrıldı")
    }

    override fun onResume() {
        super.onResume()
        println("onResume çağrıldı")
    }

    override fun onPause() {
        super.onPause()
        println("onPause çağrıldı")
    }

    override fun onStop() {
        super.onStop()
        println("onStop çağrıldı")
    }

    override fun onDestroy() {
        super.onDestroy()
        println("onDestroy çağrıldı")
    }

    fun aktiviteDegistir(view: View){

        val kullaniciVerisi = editText.text.toString()

        val intent = Intent(applicationContext,ikinciAktivite::class.java)
        intent.putExtra("yollananVeri",kullaniciVerisi)
        startActivity(intent)
        finish()
    }
}