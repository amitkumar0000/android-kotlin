package com.android.kotlin.ui.activity

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Message
import android.os.PersistableBundle
import android.util.Log
import com.android.kotlin.Constants
import com.android.kotlin.R
import com.android.kotlin.ui.fragment.MobileNumFragment
import com.android.kotlin.ui.fragment.UserInfoFragment
import com.android.kotlin.ui.interfaces.FragmentInteraction

class Contacts : AppCompatActivity(),FragmentInteraction {

    var mobileNumCont = R.id.mobileNum
    var userInfo = R.id.UserInfo


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_activity)

        attachPhoneNumList()
        attachUserInfo()
    }

    private fun attachUserInfo() {
        supportFragmentManager.beginTransaction().replace(userInfo,UserInfoFragment(),Constants.USERINFO_FRAGTAG).commitAllowingStateLoss()
    }

    private fun attachPhoneNumList() {
        supportFragmentManager.beginTransaction().replace(mobileNumCont,MobileNumFragment(),Constants.MOBILENUM_FRAGTAG).commitAllowingStateLoss()
    }


    override fun onNewIntent(intent: Intent?) {
        super.onNewIntent(intent)
        Log.d(Constants.TAG," onNewIntent ")

    }

    override fun onRestart() {
        super.onRestart()
        Log.d(Constants.TAG," onRestart ")

    }

    override fun onStart() {
        super.onStart()
        Log.d(Constants.TAG," onStart ")
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle?) {
        super.onRestoreInstanceState(savedInstanceState)
        Log.d(Constants.TAG," onRestoreInstanceState ")
    }

    override fun onResume() {
        super.onResume()
        Log.d(Constants.TAG," onResume ")

    }

    override fun onPause() {
        super.onPause()
        Log.d(Constants.TAG," onPause ")

    }

    override fun onSaveInstanceState(outState: Bundle?, outPersistentState: PersistableBundle?) {
        super.onSaveInstanceState(outState, outPersistentState)
        Log.d(Constants.TAG," onSaveInstanceState ")
    }

    override fun onStop() {
        super.onStop()
        Log.d(Constants.TAG," onStop ")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(Constants.TAG," onDestroy ")
    }

    override fun onFragmentInteraction(message: String) {
        var userInfoFragment = UserInfoFragment()
//        userInfoFragment.onMessageReceived(message)


        var bundle = Bundle()
        bundle.putString(Constants.MESSAGE,message)
        userInfoFragment.arguments = bundle

        supportFragmentManager.beginTransaction().replace(userInfo,userInfoFragment,Constants.USERINFO_FRAGTAG).commitAllowingStateLoss()


    }
}
