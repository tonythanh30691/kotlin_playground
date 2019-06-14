package com.codding.test.kotlinplayground

import android.util.Log
import java.io.Serializable

object SingleTon : Serializable {
    var name = "TEST"
    init {
        Log.d(Constans.LOG_TAG, "Singleton init")
    }
}

