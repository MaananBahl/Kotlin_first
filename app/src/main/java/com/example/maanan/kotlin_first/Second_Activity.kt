package com.example.maanan.kotlin_first

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.view.View.OnClickListener
import android.widget.Button
import android.widget.TextView

class Second_Activity : AppCompatActivity(), OnClickListener{

    var fname : TextView?=null
    var lname : TextView? =null
    var Return: Button? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.second_activity)
        fname=findViewById(R.id.textView) as TextView
        lname=findViewById(R.id.textView2) as TextView
        Return=findViewById(R.id.button2) as Button
        val b= intent.extras

        if(b!=null){
            val s1name = b.get("firstname")
            fname?.text= s1name as CharSequence?
            val s2name = b.get("lastname")
            lname?.text=s2name as CharSequence?
        }
        Return?.setOnClickListener(this)
    }

    override fun onClick(v: View?) {

        val r = Intent(this,MainActivity::class.java)
        startActivity(r)
    }

}


