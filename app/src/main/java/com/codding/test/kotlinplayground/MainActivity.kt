package com.codding.test.kotlinplayground

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import java.lang.StringBuilder
import kotlin.reflect.full.primaryConstructor

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onResume() {
        super.onResume()

       // testExtention()
       // testClassDelegate()
       // testSingleTon()
        //statelessTest()
        //testLamdaReceiver()
        //evilOperator()
        //propertiesDelegate()
        //highOrdeFunction()
        //LamdaControllflow()
        //refiedParam()
        //reflection()
        dataClass()
    }


    fun log(str : String) {
        Log.d("KotlinPlayGround", str)
    }

    fun testExtention() {
        var base = Base()
        var delivered = Delivered()

        log(base.newString())
        log(delivered.newString())

        log("Test".second().toString())
        log("Test".second.toString())
    }

    fun testClassDelegate() {
        var huskan = Huskan()
        log(huskan.getAttachType())
        log(huskan.getAttributeType())
    }

    fun testSingleTon() {
        log(SingleTon.name)
        CompanionClass.instance.sendEvent()
    }

    fun statelessTest() {
        val result = (0..10).asSequence()
            .map {
                log("mapping $it")
                return@map it
            }
            .filter {
                log("filtering $it")
                return@filter it > 5
            }
            .take(3)
            .toList()
        log("result: $result")

        //Sequence.makeSequenceFilter()
    }


    fun testLamdaReceiver() {
        var xmlData = XMLContainer()
            .child("LinearLayout") {
                attr("layout_height", "match_parent")
                attr("layout_width", "match_parent")
                attr("orientation", "vertical")
                child("ImageView") {
                    attr("layout_height", "match_parent")
                    attr("layout_width", "match_parent")
                }
                child("TextView") {
                    attr("layout_height", "match_parent")
                    attr("layout_width", "match_parent")
                }
            }

        //log("result: ${xmlData.data()}")

        var xmlTest = encloseInXMLAttribute(StringBuilder(), "TEST") {
            append("MyAttibute")
        }
    }

    fun evilOperator() {
//        var testnull : String? = null
//        val result = testnull ?: "isnull"
//
//        testnull = "NotNull"
//
//        val result1 = if (testnull != null) testnull else "isnull"
//
//        log("result: $result $result1")
        var person : Person? = Person("thanh", 14)
        person = null

        var age = person?.age ?: 13
        log("age: $age")
    }

    fun propertiesDelegate() {
       var propertiesDelegate  = PropertiesDelegate()
        propertiesDelegate.obserPro = Person("Test 2", 34)
    }

    fun highOrdeFunction() {
        var highOrderFunctions = HighOrderFunctions()
        log("test: ${highOrderFunctions.filter2(4)}")
    }

    fun LamdaControllflow(){
        findStudentTest()
    }

    fun refiedParam() {
        doSomthingWithType(String)
    }

    fun reflection() {
        var myClass = MyReflection::class
        var cons = myClass.primaryConstructor
        var myObj = cons?.call("test reflection")

        log("test: ${myObj?.name}")
    }

    fun dataClass() {
        var myGame = MyGamePlay("test", 10)
        var (name, level) = myGame
        log("myGame: $name $level")

        var myGame2 = myGame.copy(level = 20)

        var (name1, level1) = myGame2
        log("myGame: $name1 $level1")

        var has1 = "a"
        log("MyHash: ${has1.hashCode()}")
        var has2 = "b"
        log("MyHash: ${has2.hashCode()}")

        var mySet : MutableSet<String> = mutableSetOf<String>()
        mySet.add(has1)

    }
}



