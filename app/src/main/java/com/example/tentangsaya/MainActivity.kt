package com.example.tentangsaya

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.tentangsaya.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        handleUser()
        setupKalkulatorButton()
    }

    private fun handleUser(){
        binding.fotosaya.setOnClickListener{
            val builder = AlertDialog.Builder(this)
            builder.setTitle("Tentang saya")
            builder.setMessage("Tentang saya : Saya adalah murid kelas 12")
            builder.setPositiveButton("OK"){dialog, _ ->
                dialog.dismiss()
            }

            val dialog = builder.create()
            dialog.show()
            Toast.makeText(applicationContext, "Tentang saya", Toast.LENGTH_LONG).show()
        }

        binding.logoutButton.setOnClickListener{
            finish()
        }
    }

    private fun setupKalkulatorButton() {
        binding.kalkulatorButton.setOnClickListener {
            startActivity(Intent(this, KalkulatorActivity::class.java))
        }
    }

}