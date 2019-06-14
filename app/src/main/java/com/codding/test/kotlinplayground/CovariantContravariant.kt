package com.codding.test.kotlinplayground

interface Group<T> {
    fun setGroup(input : T)
    fun getGroup() : T
}

fun doSomthingVariant(input1 : Group<out Number>, input2 : Group<in Number>) {
    var result = input1.getGroup()
    input2.setGroup(4)
}