package com.codding.test.kotlinplayground

import android.util.Log
import java.lang.StringBuilder

open class XMLContainer {
    var data = StringBuilder()

    fun child(tag : String, action: XMLChildContainer.() -> Unit) : XMLContainer {
        Log.d(Constans.LOG_TAG, "child: $tag")
        data.append("<$tag\n")
        var childXML = XMLChildContainer()
        childXML.action()
        data.append(childXML.attrData)
        data.append(">\n")
        data.append(childXML.data())
        data.append("\n</$tag>")

        return this
    }

    fun data() = data.toString()
}

class XMLChildContainer : XMLContainer() {
    var attrData = StringBuilder()

    fun attr(name : String, value : String) {
        Log.d(Constans.LOG_TAG, "attr: $name value: $value")
        attrData.append("android:$name=\"$value\"\n")
    }

    fun attrData() = attrData.toString()
}

fun encloseInXMLAttribute(sb : StringBuilder, attr : String, action : StringBuilder.() -> Unit) : String{
    sb.append("<$attr>")
    sb.action()
    sb.append("</$attr>")
    return sb.toString()
}