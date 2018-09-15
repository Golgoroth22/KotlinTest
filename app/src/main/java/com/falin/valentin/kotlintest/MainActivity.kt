package com.falin.valentin.kotlintest

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    inner class JavaCode {
        fun toJSON(collection: Collection<Int>): String {
            val sb = StringBuilder()
            sb.append("[")
            val iterator = collection.iterator()
            while (iterator.hasNext()) {
                val element = iterator.next()
                sb.append(element)
                if (iterator.hasNext()) {
                    sb.append(", ")
                }
            }
            sb.append("]")
            return sb.toString()
        }
    }
}
