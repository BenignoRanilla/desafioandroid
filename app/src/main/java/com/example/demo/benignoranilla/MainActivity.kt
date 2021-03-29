package com.example.demo.benignoranilla

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.demo.benignoranilla.R
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        login.setOnClickListener {
            var status = if (username.text.toString().equals("Admin")
                    && password.text.toString().equals("Password*123")) "Inicio de Sesión Exitoso"
            else "Inicio de Sesión Fallido"

            Toast.makeText( this,status,Toast.LENGTH_SHORT).show()

            setContentView(R.layout.activity_main)
        }

    }
}
