package ru.niatomi

fun foo(bar: () -> Unit) {
    println("This is foo function")
    bar()
}

fun passedFunction() {
    println("Aboba")
}


fun main() {
    foo({
        println("This is passed function")
    })
    println()
    foo {
        println("This is passed function")
    }
}