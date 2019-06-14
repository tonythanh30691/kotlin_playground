package com.codding.test.kotlinplayground

fun varianceTest() {
    val numbers = mutableListOf<Number>()
    genericVariance(numbers)

    val integers = mutableListOf<Int>()
    genericVariance(integers) // compile error
}

fun <T> genericVariance(numbers: MutableList<out T>) {
}