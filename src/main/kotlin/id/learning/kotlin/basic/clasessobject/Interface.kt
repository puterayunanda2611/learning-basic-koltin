package id.learning.kotlin.basic.clasessobject

fun main() {
    val car = Hatchback()
    car.drive()
    car.info()
}

interface Vehicle {
    var speed: Int

    fun drive()
    fun info()
}

interface Car : Vehicle {
    val chassis: String
}

class Hatchback : Car {
    override val chassis: String
        get() = "monocoque"

    override var speed: Int = 0

    override fun drive() {
        speed+=1
        println("Current speed : $speed")
    }

    override fun info() {
        println("Chassis : $chassis")
    }
}