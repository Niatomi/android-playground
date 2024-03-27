package ru.niatomi

fun main(args: Array<String>) {
    val argsMsg  = if (args.isEmpty()) "You didn't wrote args" else "Your args is ${args.joinToString()}"
    println(argsMsg)
}