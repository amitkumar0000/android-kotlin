package com.android.kotlin.ui.activity

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.view.ViewPager
import com.android.kotlin.R
import com.android.kotlin.ui.adapters.CustomPageAdapter

class PagerActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pager)

        var viewPager:ViewPager = findViewById(R.id.pager)
        viewPager.adapter = CustomPageAdapter(this)
    }
}
