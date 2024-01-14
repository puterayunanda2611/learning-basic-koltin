package id.learning.kotlin.basic.controlflow

fun main() {
    learnIfExpression()
    learnWhenExpression()
    learnForLoop()
}

fun learnIfExpression() {
    println("========== Conditional If ==========")
    val number1 = 30
    val number2 = 40
    var max = 0

    // Statement
    if (number2 > number1) {
        println("Number 2 is higher than number 1")
    } else {
        println("Number 1 is higher than number 2")
    }

    // As expression
    max = if (number2 > number1) number2 else number1
    println("Max Number : ${max}")
}

fun learnWhenExpression() {
    println("========== Conditional when ==========")
    // statement
    val x = 1
    when (x) {
        1 -> println("x == 1")
        2 -> println("x == 2")
    }

    val color = Color.BLUE
    when (color) {
        Color.RED -> println("Color is red")
        Color.GREEN -> println("Color is green")
        Color.BLUE -> println("Color is blue")
    }

    when (x) {
        0, 1 -> println("x == 0 or x == 1")
        else -> println("otherwise")
    }

    when (x) {
        in 1..10 -> println("x is in the range")
        !in 10..20 -> println("x is outside the range")
        else -> println("none of the above")
    }
}

fun learnForLoop() {
    println("========== Loop ==========")
    val collection = arrayOf("a", "b", "c")
    var x = 10
    var y = 0

    for (item in collection) {
        print(item)
    }

    while (x > 0) {
        x--
    }

    do {
        println(y)
        y++
    } while (y < 10)
}

enum class Color {
    RED, GREEN, BLUE
}