package ru.niatomi

fun main() {
    val foo = listOf(1, 2, 3)
    println(foo.joinToString())
    println(1 in foo)
    println(foo.indexOf(3))
}