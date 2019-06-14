package com.codding.test.kotlinplayground

class HighOrderFunctions {
    var test : (Int) -> Boolean = { it > 2}
    var filter = {x: Int -> x > 2}
    var filter2 = fun(x: Int) : Boolean = x < 2

    var filter3 = String::filter
}