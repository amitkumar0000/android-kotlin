package com.android.kotlin

/*
Object is equivalent to Singleton class.
The instance of the object will be created the first time we use it.
So there’s a lazy instantiation here: if an object is never used, the instance will never be created.

Every class can implement a companion object,
which is an object that is common to all instances of that class.
It’d come to be similar to static fields in Java. */
object Constants{
    var TAG:String = "android-Kotlin"
}