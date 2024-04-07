package ru.niatomi

fun main() {
    val statement: Int = 1
    when (statement) {
        1 -> println("one")
        2 -> println("two")
        3 -> println("three")
        else -> println("something else")
    }

    val strState = when (statement) {
        1 -> "one"
        2 -> "two"
        3 -> "three"
        else -> "something else"
    }
    println(strState)
}