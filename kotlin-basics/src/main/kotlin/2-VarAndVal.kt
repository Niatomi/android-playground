package ru.niatomi

fun main() {
//    This is bad practice
//    Cause var is mutable variable
    var name: String = "Niatomi"
    println(name)

//    This is good in most cases
    val immutableName: String = "Niatomi"
    println(immutableName)
////    throws error
//    immutableName = "NiatomiChanged"
}