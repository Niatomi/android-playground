package ru.niatomi

fun main() {
//  String type
    var foo: String = "asdf"
    println(foo.plus("qwer"))

    println(foo.length)
    println(foo[0])

    foo += "qwer"
    println(foo)
}