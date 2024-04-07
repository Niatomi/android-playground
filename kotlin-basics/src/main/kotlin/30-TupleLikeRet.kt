package ru.niatomi


fun twoValuesReturn(): Pair<String, Int> {
    return "Key" to 42
}

//fun twoValuesReturn(): Pair<String, Int> {
//    return Pair("Key", 42)
//}

fun tripleValueRet(): Triple<String, Int, Double> {
    return Triple("Key", 42, 42.0)
}

fun main() {
    val (keyValue, numberValue) = twoValuesReturn()
    println("$keyValue, $numberValue")
    println(tripleValueRet())
}