package com.example.learnwithvidyarthi

import android.content.Intent
import android.content.Intent.ACTION_DIAL
import android.net.Uri
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class home : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_home)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        var web = findViewById<CardView>(R.id.webdev)
        var android = findViewById<CardView>(R.id.androiddev)
        var ml = findViewById<CardView>(R.id.ml)
        var datasc = findViewById<CardView>(R.id.datascience)
        var blockc = findViewById<CardView>(R.id.block)
        var iosdev = findViewById<CardView>(R.id.iosdev)
        var support = findViewById<CardView>(R.id.support)



        web.setOnClickListener {
            val intent = Intent(this, webtech::class.java)
            startActivity(intent)
        }

        android.setOnClickListener {

            var i = Intent(this,androiddev::class.java)
            startActivity(i)

        }

            iosdev.setOnClickListener {

                var i = Intent(this,iosdevlopment::class.java)
                startActivity(i)

            }

        ml.setOnClickListener {
            var i = Intent(this,machinelearning::class.java)
            startActivity(i)
        }

        blockc.setOnClickListener {
            var i = Intent(this,blockchain::class.java)
            startActivity(i)

        }

        datasc.setOnClickListener {
            var i = Intent(this, datascience::class.java)
            startActivity(i)
        }


        support.setOnClickListener {
            var i = Intent(ACTION_DIAL, Uri.parse("tel:7903408859"))
            startActivity(i)
        }







    }
}