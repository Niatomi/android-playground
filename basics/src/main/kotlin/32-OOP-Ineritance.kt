package ru.niatomi

import java.lang.Exception

open class Product(
    var name: String,
    cost: Double) {

    var cost: Double = cost
        set(value) {
            if (value <= 0.0) throw Exception("Cost of product cannot be below or equals zero")
            field = value
        }
}

class IceCream(name: String, cost: Double) : Product(name, cost)


fun main() {
    val a = 1
    val ic = IceCream("asdf", 1.0)
//    ic.cost = -1.0
}