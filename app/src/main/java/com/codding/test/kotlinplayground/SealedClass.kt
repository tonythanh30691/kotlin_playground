package com.codding.test.kotlinplayground


sealed class Attribute

class Intelligence : Attribute()

class Agility : Attribute()

class Strength : Attribute()

fun getAttributeString(attribute: Attribute) : String {
    return when (attribute) {
        is Intelligence -> "Intelligence"
        is Strength -> "Strength"
        is Agility -> "Agility"
    }
}


