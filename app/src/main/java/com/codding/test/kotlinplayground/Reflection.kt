package com.codding.test.kotlinplayground

class MyReflection (val name : String) {

}

@SourceData(
    author = "Benedict Cumberbatch",
    version = 1,
    lastModified = "2018-05-09")
class MyClass {

    fun getHelloString(): String {
        return "Hello World!"
    }
}