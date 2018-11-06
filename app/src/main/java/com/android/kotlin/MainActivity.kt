package com.android.kotlin

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import com.android.kotlin.ui.activity.Contacts

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d(Constants.TAG," onCreate ")
    }

    private fun startActivityA() {
        var intent = Intent(this, Contacts::class.java)
        startActivityForResult(intent,Constants.ActivityA_RequestCode)
    }

    fun onClick(v: View){
        when(v.id){
            R.id.activityA -> startActivityA()
        }
    }
}
