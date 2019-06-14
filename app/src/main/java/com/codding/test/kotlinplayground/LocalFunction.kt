package com.codding.test.kotlinplayground

import android.util.Log

fun login(userName : String, password: String) {
    var count = 1
    fun validate(str : String) {
        if (str.isEmpty()) {
            count ++
        }
    }

    validate(userName)
    validate(password)
}