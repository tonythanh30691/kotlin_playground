package com.codding.test.kotlinplayground

fun someHigherOrderFunction(message: String, func: (String) -> Unit) {
}

inline fun crossInlineTest(message: String, crossinline func: (String) -> Unit) {
    someHigherOrderFunction("crossInlineTest") {
        func(it) // Compile error here
    }
}

fun testCrossInline() {
    crossInlineTest("Hello") {
        println(it)
       // return // Compile error here because crossinline does not allow return
    }
    println("Main finished")
}

fun <T : Number> test(input : T) {

}