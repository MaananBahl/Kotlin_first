package com.example.maanan.kotlin_first

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.View.OnClickListener
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity(),OnClickListener {

    var fname : EditText? = null
    var lname : EditText? = null
    var submit : Button? = null
    var s1 : String? = null
    var s2 : String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        fname=findViewById(R.id.editText) as EditText
        lname=findViewById(R.id.editText2) as EditText
        submit=findViewById(R.id.button) as Button
        submit?.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
       if(v==submit) {
           s1 = fname?.text.toString()
           s2 = lname?.text.toString()
           launchactivity()
       }
    }

     fun launchactivity() {
        val i = Intent(this,Second_Activity::class.java)
        i.putExtra("firstname",s1)
        i.putExtra("lastname",s2)
        startActivity(i)
        finish()

    }
}
