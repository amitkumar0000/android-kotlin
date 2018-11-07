package com.android.kotlin

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import com.android.kotlin.ui.activity.Contacts
import com.android.kotlin.ui.activity.PagerActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d(Constants.TAG," onCreate ")
    }

    fun onClick(v: View){
        when(v.id){
            R.id.activityA -> startContactsActivity()
            R.id.pagerbtn -> startPagerActivity()
        }
    }

    private fun startContactsActivity() {
        var intent = Intent(this, Contacts::class.java)
        startActivityForResult(intent,Constants.ContactsA_RequestCode)
    }

    private fun startPagerActivity(){
        startActivityForResult(Intent(this,PagerActivity::class.java),Constants.PagerA_RequestCode)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        when(requestCode){
            Constants.ContactsA_RequestCode -> {}
            Constants.PagerA_RequestCode -> {}
        }
    }
}
