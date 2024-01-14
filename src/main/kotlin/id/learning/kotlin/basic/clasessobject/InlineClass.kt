package id.learning.kotlin.basic.clasessobject

fun main() {
    val name1 = PersonInline("Kotlin", "Mascot")
    val name2 = PersonInline("Kodee")
    name1.greet()
    println(name2.length)
}

@JvmInline
value class PersonInline(private val fullName: String) {
    val length: Int
        get() = fullName.length

    constructor(firstName: String, lastName: String) : this("$firstName $lastName")

    fun greet() {
        println("Hello, $fullName")
    }
}

