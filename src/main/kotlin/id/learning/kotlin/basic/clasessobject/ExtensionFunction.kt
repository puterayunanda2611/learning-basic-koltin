package id.learning.kotlin.basic.clasessobject

fun main() {
    val number: Int? = null
    val text: String? = null
    println("Number : ${number.orZero()}")
    println("Text : ${text.orDash()}")
    MyClass.printCompanion()
}

fun Int?.orZero(): Int {
    return this ?: 0
}

fun String?.orDash(): String {
    return this ?: "-"
}


class MyClass {
    companion object
}

fun MyClass.Companion.printCompanion() {
    println("companion")
}

