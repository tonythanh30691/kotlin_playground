package com.codding.test.kotlinplayground

interface AttachType {
    fun getAttachType() : String
}

class Ranged : AttachType {
    override fun getAttachType() = "Ranged"
}

interface HeroType {
    fun getAttributeType() : String
}

class Hero : HeroType {
    override fun getAttributeType() = "Strength"
}

class Huskan : AttachType by Ranged(), HeroType by Hero()