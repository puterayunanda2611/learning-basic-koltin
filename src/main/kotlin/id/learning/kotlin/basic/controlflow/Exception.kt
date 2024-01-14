package id.learning.kotlin.basic.controlflow

fun main() {
    learnException()
}

fun learnException() {
    try {
        println("Start Exception")
        throw IllegalArgumentException("illegal argument exception")
    } catch (e: Exception) {
        e.printStackTrace()
    } finally {
        println("Finally")
    }

    // expression
    val input = "Hello"
    val number: Int? = try {
        input.toInt()
    } catch (e: NumberFormatException) {
        e.printStackTrace()
        null
    }
    println("Input : $number")

    val name = null
    val message = name ?: throw IllegalArgumentException("Name required")
    println("Message : $message")
}

class InitOrder