package com.internsala.activitylifecycle

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class LoginActivity : AppCompatActivity() {


    lateinit var txtcontact: EditText
    lateinit var txtpassword: EditText
    lateinit var btnlogin: Button
    lateinit var forgotpassword: TextView
    lateinit var txtregister: TextView
    val validMobileNumber = "0123456789"
    val validpassword = arrayOf("thanos", "tony", "bruce", "hitesh", "hkc")



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        title = "Log In"
        txtcontact = findViewById(R.id.txtcontact)
        txtpassword = findViewById(R.id.txtpassword)
        btnlogin = findViewById(R.id.btnlogin)
        forgotpassword = findViewById(R.id.forgotpassword)
        txtregister = findViewById(R.id.txtregister)

        btnlogin.setOnClickListener {
            val mobilenumber = txtcontact.text.toString()
            val password = txtpassword.text.toString()
            var nameofAvenger = "Avenger"
            val intent = Intent(this@LoginActivity, MainActivity::class.java)
            if ((mobilenumber == validMobileNumber)) {
                if (password == validpassword[0]) {

                    nameofAvenger = "im thanos"
                    intent.putExtra("Name", nameofAvenger)
                    startActivity(intent)
                } else if (password == validpassword[1]) {



                    nameofAvenger = "im tony"
                    intent.putExtra("Name", nameofAvenger)
                    startActivity(intent)
                } else if (password == validpassword[2]) {



                    nameofAvenger = "im bruce"
                    intent.putExtra("Name", nameofAvenger)
                    startActivity(intent)
                } else if (password == validpassword[3]) {


                    nameofAvenger = "im hitesh"
                    intent.putExtra("Name", nameofAvenger)
                    startActivity(intent)
                } else if (password == validpassword[4]) {



                    nameofAvenger = "im hkc"
                    intent.putExtra("Name", nameofAvenger)
                    startActivity(intent)
                }
            } else {
                Toast.makeText(this@LoginActivity, "Incorrect Credentials", Toast.LENGTH_LONG)
                    .show()
            }
        }
        fun onPause() {
            super.onPause()
            finish()
        }


    }


}
