package com.codding.test.kotlinplayground

import android.util.Log

object Sequence {
    val myArr = (1..10)

    fun makeSequenceFilter() {
        var result = myArr.asSequence().

            map {
            Log.d(Constans.LOG_TAG, "Map $it")
            return@map it
        }
            .filter {
                Log.d(Constans.LOG_TAG, "filter $it")
                return@filter it > 5
            }
            .take(3)

        Log.d(Constans.LOG_TAG, "result $result")
    }
}