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
    }

    fun maxOf(persons: List<Person>): Person? {
        return persons.maxBy { it.age ?: 0 }
    }

    fun test1(text1: String, text2: String): String {
        return if (Integer.parseInt(text1) > Integer.parseInt(text2)) text1 else text2
    }
}

fun test2(a: Int, b: Int): Int = if (a > b) a else b

