package ru.niatomi

fun main() {
    val nonTypedArray = arrayOf("Value", 1, 2)
    val typedArray = arrayOf<String>("Value1", "Value2", "Value3")

    println(nonTypedArray.contentToString())
    println(typedArray.contentToString())
}