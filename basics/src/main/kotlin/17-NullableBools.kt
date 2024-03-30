package ru.niatomi

fun main() {
    val value: Boolean? = null

//  Check on null already performed
    if (value == true) {
        println("Value is true")
    } else {
        println("value is null or false")
    }
}