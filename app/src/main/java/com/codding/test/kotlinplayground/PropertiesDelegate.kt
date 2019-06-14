package com.codding.test.kotlinplayground

import android.provider.ContactsContract
import android.util.Log
import kotlin.properties.Delegates
import kotlin.properties.ReadOnlyProperty
import kotlin.reflect.KProperty


class PropertiesDelegate {
    val name : String by NameDelegate(Database())

    val person : Person by lazy {
        Person("thanh", 12)
    }

    var obserPro : Person by Delegates.observable(Person("test", 1)) {
        pro, old, new -> Log.d(Constans.LOG_TAG, "Obser change from ${old.name} to ${new.name}")
    }
}

class Database {
    fun queryName() = "MyDatabaseName"
}

class NameDelegate<T>(private val db : Database) : ReadOnlyProperty<T, String> {
    override fun getValue(thisRef: T, property: KProperty<*>): String {
        return db.queryName()
    }
}