package com.codding.test.kotlinplayground

class CompanionTest  {
    companion object : MhInterFace {
        var name = "test"
        fun test() : Boolean = true
        override fun getString() : String = "TEST"
    }
}

interface MhInterFace {
    fun getString() : String
}