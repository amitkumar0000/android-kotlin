package com.android.kotlin.ui.adapters

import android.content.Context
import android.support.v4.view.PagerAdapter
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.android.kotlin.models.ModelObject


class CustomPageAdapter(var context: Context): PagerAdapter() {


    override fun instantiateItem(container: ViewGroup, position: Int): Any {
        var modelObject = ModelObject.values()[position]
        var inflator = LayoutInflater.from(context)
        var layout = inflator.inflate(modelObject.layoutId,container,false)
        container.addView(layout)
        return layout
    }


    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
        container.removeView(`object` as View?)
    }

    override fun getCount(): Int {
        return  ModelObject.values().size
    }

    override fun isViewFromObject(p0: View, p1: Any): Boolean {
        return p0 == p1
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return ModelObject.values()[position].titleResId.toString()
    }

}