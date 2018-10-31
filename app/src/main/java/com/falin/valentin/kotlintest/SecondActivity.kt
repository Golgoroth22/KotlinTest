package com.falin.valentin.kotlintest

import android.os.Bundle
import android.support.v7.app.AppCompatActivity

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val persons = listOf(Person("Bob", null, true),
                Person("Alice", 13, false),
                Person("Jhon", 45, true))

        val oldest = persons.maxBy { it.age ?: 0 }

        println("The oldest is - $oldest")

        println(maxOf(persons))

        println(test1("111", "222"))

        println("${test2(2, 5)} ${persons[2]}")

        val catBarsik = Cat("Barsik", 3, true)
        catBarsik.age = 6

        println(catBarsik.toString().chik())

        println(testStreams().toString())

        highOrderFunc { arg1, arg2 ->
            Unit
            println("callback runned")
        }
    }

    fun maxOf(persons: List<Person>): Person? {
        return persons.maxBy { it.age ?: 0 }
    }

    fun test1(text1: String, text2: String): String {
        return if (Integer.parseInt(text1) > Integer.parseInt(text2)) text1 else text2
    }
}

fun highOrderFunc(callback: (arg1: Int, arg2: String) -> Unit) {
    val result = test2(4, 5)
    callback(result, "Kotlin > Java")
}

fun testStreams(): List<Int> {
    val list = listOf(1, 2, 3, 4, 5)
            .filter { n -> n % 2 == 1 } // 1, 3, 5
            .map { n -> n * n } // 1, 9, 25
            .drop(1) // 9, 25
            .take(1) // 9

    return list
}

fun test2(a: Int, b: Int): Int = if (a > b) a else b

fun String.chik(): String {
    return "$this chik";
}
