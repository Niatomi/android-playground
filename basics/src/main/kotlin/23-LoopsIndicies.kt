package ru.niatomi

fun main() {
    val names = listOf("James", "John", "Mary")
    val numbers = intArrayOf(1, 2, 3, 4, 5)

    for (index in names.indices) {
        println("$index - ${names[index]}")
    }

    for (index in names.indices.reversed()) {
        println("$index - ${names[index]}")
    }
}