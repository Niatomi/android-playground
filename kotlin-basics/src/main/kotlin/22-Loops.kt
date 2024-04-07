package ru.niatomi

fun main() {
    val names = listOf("James", "John", "Mary")
    val numbers = intArrayOf(1, 2, 3, 4, 5)

    for (name in names) {
        println(name)
    }

    for (i in 0..numbers.size - 1) println(numbers[i])
    for (i in 0 downTo numbers.size - 1) println(numbers[i])
    for (i in 0 .. numbers.size - 1 step 2) println(numbers[i])

}