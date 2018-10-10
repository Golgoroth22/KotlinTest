package com.falin.valentin.kotlintest

class Cat(val name: String,
          var age: Int,
          var gender: Boolean) {

    override fun toString(): String {
        return "$name is $age age old. And it`s a ${if (gender) "boy" else "girl"}."
    }
}

