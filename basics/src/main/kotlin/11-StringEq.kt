package ru.niatomi

//String in Kotlin stores like in Java in String pool
fun main() {
    val name1: String = "Niatomi"
    val name2: String = "Niatomia"
    println(name1.compareTo(name2))
    println(name1 == name2)

//  Checks for memory location
    println(name1 === name2)
    println(name1.equals(name2))
}