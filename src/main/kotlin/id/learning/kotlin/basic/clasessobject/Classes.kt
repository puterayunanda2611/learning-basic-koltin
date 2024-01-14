package id.learning.kotlin.basic.clasessobject

fun main() {
    println("=======================Person 1========================")
    Person("Andrian Palopo")
    println("=======================Person 2========================")
    Person2("Adrian Palopo", 26)
    println("=======================Person 3========================")
    val person = Person3("Adrian", "Palopo", 26)
    person.getPersonalInformation()
    println("=======================Person 4========================")
    val person2 = Person4.create("Adrian", "Palopo", 26)
    person2.getPersonalInformation()
}

// Creating constructor
class Person(fullName: String) {

    init {
        println("First initializer block that prints")
        println("Full Name : $fullName")
    }
}

class Person2(fullName: String) {

    init {
        println("First initializer block that prints")
        println("Full name : $fullName")
    }

    constructor(fullName: String, age: Int) : this(fullName) {
        println("Second initializer block that prints")
        println("Full name : $fullName")
        println("Age : $age")
    }
}

class Person3(
    val firstName: String,
    val lastName: String,
    val age: Int
) {

    fun getPersonalInformation() {
        println("First name : $firstName")
        println("Last name : $lastName")
        println("Age : $age")
    }
}

class Person4 private constructor(
    val firstName: String,
    val lastName: String,
    val age: Int
) {

    fun getPersonalInformation() {
        println("First name : $firstName")
        println("Last name : $lastName")
        println("Age : $age")
    }

    companion object {
        fun create(
            firstName: String,
            lastName: String,
            age: Int
        ): Person4 {
            return Person4(
                firstName = firstName,
                lastName = lastName,
                age = age
            )
        }
    }
}
