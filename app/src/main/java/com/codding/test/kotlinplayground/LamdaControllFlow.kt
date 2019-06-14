package com.codding.test.kotlinplayground

import android.util.Log

data class Student(val name : String, val id : Int)

fun findStock(list : List<Student>) {
    list.forEach label@ {
        if (it.name == "thanh") {
            Log.d(Constans.LOG_TAG, "Find Thanh")
            return@label
        }
    }
    Log.d(Constans.LOG_TAG, "Out of loop")
}

inline fun findStockLamda(list : List<Student>, func: (Student) -> Unit) {
    list.forEach  {
        func(it)
    }
    Log.d(Constans.LOG_TAG, "Out of loop")
}

fun findStockAnoymousFuntion(list : List<Student>) {
    list.forEach(fun(student) {
        if (student.name == "thanh") {
            Log.d(Constans.LOG_TAG, "Find Thanh")
        }
    })
    Log.d(Constans.LOG_TAG, "Out of loop")
}

fun findStudentTest() {
    var studentList = listOf<Student>(Student("test", 2), Student("thanh", 3),
        Student("test4", 5)
    )
    //findStockAnoymousFuntion(studentList)

    findStockLamda(studentList) {
        if (it.name == "thanh") {
            Log.d(Constans.LOG_TAG, "Find Thanh")
            return
        }
        Log.d(Constans.LOG_TAG, "end lamda")
    }

    Log.d(Constans.LOG_TAG, "end test")
}