package id.learning.kotlin.basic.clasessobject

fun main() {
    println("=========================Simple Object Exp 1==========================")
    val helloWorld = object {
        val hello = "Hello"
        val world = "World"

        override fun toString(): String = "$hello $world"
    }
    println(helloWorld)

    println("=========================Simple Object Exp 2==========================")
    val sampleObjectExp1 = SampleObjectExp1()
    sampleObjectExp1.printX()

    println("=========================Object Exp 3==========================")
    val sampleObjectExp2 = SampleObjectExp2()
    println(sampleObjectExp2)

    println("=========================Object Declaration 1==========================")
    DataProviderManager.registerDataProvider("A")
    val allDataProvider = DataProviderManager.allDataProvider
    println("Sample Object Declare 1 : ${allDataProvider[0]}")

    println("=========================Data Object==========================")
    println(SampleDataObject)

    println("=========================Companion Object==========================")
    println(SampleCompanionObject1.create())

    println("=========================Companion Object 2==========================")
    val factory: SampleCompanionFactory<SampleCompanionObject2> = SampleCompanionObject2
    println(factory.create())
}

class SampleObjectExp1 {
    // objects as return and value types
    private fun getObject() = object {
        val x: String = "Sample Inline 1"
    }

    fun printX() {
        println(getObject().x)
    }
}

interface SampleObjectInterface1 {
    fun funFromA(): String
}

interface SampleObjectInterface2

class SampleObjectExp2 {
    fun getObject() = object {
        val x: String = "x - object"

        fun funFromA(): String {
            return x
        }
    }

    fun getObjectA() = object : SampleObjectInterface1 {
        val x: String = "x - object A"
        override fun funFromA(): String {
            return x
        }
    }

    fun getObjectB(): SampleObjectInterface2 = object : SampleObjectInterface1, SampleObjectInterface2 {
        val x: String = "x - object B"
        override fun funFromA(): String {
            return x
        }
    }

    override fun toString(): String {
        return "Default Object : ${getObject()}\n" +
                "Object A : ${getObjectA().funFromA()}\n" +
                "Object B : ${getObjectB()}"
    }
}

object DataProviderManager {
    var allDataProvider: Array<String> = emptyArray()

    fun registerDataProvider(provider: String) {
        val items = arrayOf(provider)
        allDataProvider = items
    }
}

data object SampleDataObject

class SampleCompanionObject1 {

    override fun toString(): String {
        return "Sample Companion Object 1"
    }

    companion object Factory {
        fun create(): SampleCompanionObject1 = SampleCompanionObject1()
    }
}

interface SampleCompanionFactory<T> {
    fun create(): T
}

class SampleCompanionObject2 {

    override fun toString(): String {
        return "Sample Companion Object 2"
    }

    companion object : SampleCompanionFactory<SampleCompanionObject2> {
        override fun create(): SampleCompanionObject2 = SampleCompanionObject2()
    }
}
