package ru.niatomi

fun main() {
    val foo = mutableListOf(1, 2, 3, 4, 5, 6)
    println(foo.joinToString())
    foo.add(7)
    println(foo.joinToString())
    foo.remove(4)
    println(foo.joinToString())

    val emptyList = mutableListOf<Any>()
    emptyList.add(1)
    emptyList.add("qwe")
    println(emptyList.joinToString())
}