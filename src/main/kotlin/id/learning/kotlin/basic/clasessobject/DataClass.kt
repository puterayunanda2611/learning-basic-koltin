package id.learning.kotlin.basic.clasessobject

fun main() {
    val user1 = User("Putera Yunanda", 20)
    val user2 = User("Putera Yunanda", 20)
    println("Is equals user 1 & user 2 : ${user1 == user2}")
    println("User 1 & user 2 : $user1 & $user2")
    println("User 1 age : ${user1.component2()}")
}

data class User(val name: String, val age: Int)
