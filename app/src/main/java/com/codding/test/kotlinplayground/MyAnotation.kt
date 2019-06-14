package com.codding.test.kotlinplayground

@Target(AnnotationTarget.CLASS)
@Retention(AnnotationRetention.RUNTIME)
@MustBeDocumented
annotation class SourceData(val author : String,
                            val version : Int,
                            val lastModified: String)