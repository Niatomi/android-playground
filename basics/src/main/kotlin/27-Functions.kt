package ru.niatomi

fun fooFunc(someVar: String = "No value"): String {
//  Some complecated logic whooooooooooooooooo
    return "Yep that is: $someVar"
}

fun main() {
    println(fooFunc("Meow"))
}