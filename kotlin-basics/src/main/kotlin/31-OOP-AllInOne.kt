package ru.niatomi

class SmartDevice constructor(
    name: String,
    var cost: Double,
) {

    constructor(): this("", -1.0)
    constructor(name: String): this(name, cost = -1.0)

    var name = name
        set(value) {
            field = value.uppercase()
        }

    var powerState: Boolean = false
        set(value) = if (value != field) field = value else Unit

    fun turnOn() {
        this.powerState = true
    }

    fun turnOff() {
        this.powerState = false
    }

    override fun toString(): String {
        return "SmartDevice(cost=$cost, name='$name', powerState=$powerState)"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as SmartDevice

        if (cost != other.cost) return false
        if (name != other.name) return false
        if (powerState != other.powerState) return false

        return true
    }

    override fun hashCode(): Int {
        var result = cost.hashCode()
        result = 31 * result + name.hashCode()
        result = 31 * result + powerState.hashCode()
        return result
    }


}

class Device {

    var name: String = ""
    var cost: Double = 0.0

    constructor(name: String) {
        this.name = name
        this.cost = -1.0
    }

    constructor(name: String, cost: Double) {
        this.name = name
        this.cost = cost
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Device

        if (name != other.name) return false
        if (cost != other.cost) return false

        return true
    }

    override fun hashCode(): Int {
        var result = name.hashCode()
        result = 31 * result + cost.hashCode()
        return result
    }


}

fun main() {

    val tv = SmartDevice("LG OLED")
    println(tv.name)
    println(tv.powerState)
    tv.turnOn()
    println(tv.powerState)
    tv.turnOff()
    tv.turnOff()
    println(tv.powerState)
    println(tv.cost)
    println(tv)
    println()

    val phone_1 = Device("IPhone")
    println("${phone_1.name} ${phone_1.cost}")
    val phone_2 = Device("IPhone 11", 4242.42)
    println("${phone_2.name} ${phone_2.cost}")

    println(Device("IPhone 11", 4242.42) == Device("IPhone 11", 4242.42))
}