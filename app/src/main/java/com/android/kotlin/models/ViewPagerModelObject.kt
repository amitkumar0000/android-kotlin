package com.android.kotlin.models

import com.android.kotlin.R

enum class ModelObject(var titleResId: Int,var layoutId: Int) {

    RED(R.string.RED, R.layout.red),
    GREEN(R.string.GREEN, R.layout.green),
    BLUE(R.string.BLUE, R.layout.blue)
}