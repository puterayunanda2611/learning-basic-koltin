package id.learning.kotlin.basic.clasessobject

fun main() {
    println("===========Backing Field=================")
    val car = MPVCar()
    println("Number of tire : : ${car.numberOfTire}")
    println("Number of seat : ${car.numberOfSeat}")

    println("Update set : ${car.numberOfSeat}")
    println("===========Backing Property=================")
    val student = Student()
    student.addHobby(arrayOf("Watching a movie", "Reading a book", "Badminton"))
    for (hobby in student.hobbies) {
        println("Number of seat : $hobby")
    }
}

class MPVCar {
    val numberOfTire: Int
        get() = 4

    // Backing Field
    var numberOfSeat: Int = 7
        set(value) {
            if (value > 7 || value < 2) {
                throw IllegalArgumentException("minimum seat ")
            }

            field = value
        }
}

class Student {
    private var _hobbies: Array<String> = arrayOf()

    val hobbies: Array<String>
        get() = _hobbies

    fun addHobby(hobbies: Array<String>) {
        _hobbies = hobbies
    }
}