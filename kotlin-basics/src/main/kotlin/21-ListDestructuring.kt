package ru.niatomi

fun main() {
    val foo = listOf(1, 2, 3, 4, 5, 6)
    val (firstEl, secondEl, thirdEl) = foo

    val (fEl, sEl, tEl, _, fifEl) = foo
    println(fifEl)
}