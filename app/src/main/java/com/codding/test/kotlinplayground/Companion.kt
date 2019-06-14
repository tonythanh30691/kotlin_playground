package com.codding.test.kotlinplayground

import android.util.Log

class CompanionClass {

    private constructor()

    companion object {
        private lateinit var INSTANCE : CompanionClass
        val instance : CompanionClass
            get() {
                if (INSTANCE == null) {
                    INSTANCE = CompanionClass()
                }
                return INSTANCE
            }
    }

    fun sendEvent() {
        Log.d(Constans.LOG_TAG, "Send event")
    }
}