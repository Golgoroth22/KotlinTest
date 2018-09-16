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
    }
}

