package com.falin.valentin.kotlintest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private var i1: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        main_text.setOnClickListener { main_text.text = "$i1" }

//        println(useFoo()[0])
//        println(useFoo()[1])
//        println(useFoo()[2])
//        println(useFoo()[3])
//        i1 = 1
//        val int = sum(25)
//        println(int)
//        printSmf("First", b = 1)
//        printSmf("Second")
//        printSmf("Third", b = -66)
//        fakeSum("2", "3")
//        fakeSum("gggg", "3")
    }

//    fun foo(name: String, number: Int = 20, toUpperCase: Boolean = false) = (if (toUpperCase) name.toUpperCase() else name) + number
//
//    fun useFoo() = listOf(
//            foo("a"),
//            foo("b", number = 1),
//            foo("c", toUpperCase = true),
//            foo(name = "d", number = 2, toUpperCase = true)
//    )
//
//    fun sum(a: Int, b: Int = -11): Int {
//        val c: Int = a + b
//        return c
//    }
//
//    fun printSmf(a: String, b: Int = 66) {
//        println("Text $a + $b")
//    }
//
//    fun fakeSum(a: String, b: String) {
//        val x = parseInt(a)
//        val y = parseInt(b)
//
//        if (x != null && y != null) {
//            println(x * y)
//        } else {
//            println("$a or $b is not number")
//        }
//    }
}
