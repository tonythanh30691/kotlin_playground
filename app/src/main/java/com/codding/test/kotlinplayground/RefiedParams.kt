package com.codding.test.kotlinplayground

import android.util.Log

fun <T> getCount(list: List<T>) : Int = list.size

fun <T> isListOfString(list : List<T>) : Boolean {
    return list is List<*>
}

inline fun <reified T>  doSomthingWithType(obj : T) {
    var typeName = T::class.java
    Log.d(Constans.LOG_TAG, "type name is: $typeName")
}

fun testType() {
    doSomthingWithType(String)
}