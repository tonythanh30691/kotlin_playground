package com.codding.test.kotlinplayground

open class Base {
    open fun getString() = "Base"
}

class Delivered : Base() {
    override fun getString() = "Deliverd"
}

fun Base.newString() = "New Base String"
fun Delivered.newString() = "New Delivered String"

fun String.second() : Char = this[2]

val String.second : Char
    get() {
        return this[2]
    }

