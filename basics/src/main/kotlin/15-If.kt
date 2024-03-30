package ru.niatomi

fun main() {
    var someValue = 0
    var conditionResult = if (someValue <= 100) {
        "Your value less than 100"
    } else {
        "Your value more than 100"
    }
    println(conditionResult)

//  Ternarny operator
    conditionResult = if (someValue <= 100) "Your value less than 100" else "Your value greater than 100"

}