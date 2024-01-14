package id.learning.kotlin.basic.clasessobject

fun main() {
    val isEven = IntPredicate { number -> (number % 2) == 0 }
    println("is even : ${isEven.accept(10)}")
}

fun interface IntPredicate {
    fun accept(i: Int): Boolean
}