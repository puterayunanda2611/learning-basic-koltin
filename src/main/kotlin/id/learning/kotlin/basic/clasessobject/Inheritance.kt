package id.learning.kotlin.basic.clasessobject

fun main() {
    val house = HouseSubsidies()
    house.getRoomInfo()
    house.getDescription()
}

open class House {
    open val numberOfRoom: Int = 3

    init {
        println("======Number of room on default house : $numberOfRoom========")
    }

    open fun getRoomInfo() {
        for (i in 1..numberOfRoom) {
            when (i) {
                1 -> println("Bedroom")
                2 -> println("Bathroom")
                else -> println("Family room")
            }
        }
    }

    open fun getDescription() {
        println("The facilities of house depend of the type hose")
    }
}

open class HouseSubsidies : House() {
    override val numberOfRoom: Int = 4

    init {
        println("======Number of room on subsidies(default) : $numberOfRoom========")
    }

    override fun getRoomInfo() {
        for (i in 1..numberOfRoom) {
            when (i) {
                1 -> println("Bedroom subsidies")
                2 -> println("Bathroom subsidies")
                3 -> println("Family room subsidies")
                else -> println("Dining room subsidies")
            }
        }
    }

    override fun getDescription() {
        super.getDescription()
        println("This house include of kitchen set")
    }
}