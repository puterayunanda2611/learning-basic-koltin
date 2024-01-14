package id.learning.kotlin.basic.types

fun main() {
    learnIntTypes()
    learnFloatTypes()
    learnBoolean()
    learnCharacters()
    learnString()
    learnTypeCheck()
}

fun learnIntTypes() {
    println("========== Int ==========")
    val one = 1 // Int
    val threeBillion = 3000000000 // Long
    val oneLong = 1L // Long
    val oneByte: Byte = 1

    println("$one is int : ${one is Int}")
    println("$threeBillion is double : ${threeBillion is Long}")
    println("$oneLong is long : ${oneLong is Long}")
    println("$oneByte is byte : ${oneByte is Byte}")
}

fun learnFloatTypes() {
    println("========== Float ==========")
    val pi = 3.14 // Double
    val oneFloat = 1.0f // Float
    println("$pi : ${pi is Double}")
    println("$oneFloat Double : ${oneFloat is Float}")
}

fun learnBoolean() {
    println("========== Boolean ==========")
    val myTrue: Boolean = true
    val myFalse: Boolean = false
    val boolNull: Boolean? = null

    println(myTrue || myFalse)
    println(myTrue && myFalse)
    println(!myTrue)
}

fun learnCharacters() {
    println("========== Char ==========")
    val aChar: Char = 'a'
    println(aChar)
    println('\uFF00')
}

fun learnString() {
    println("========== String ==========")
    val escaped = "Hello, world!"
    val multiline1 = """
        for (c in "foo")
            print(c)
    """.trimIndent()
    val multiline2 = """
        |Tell me and I forget.
        |Teach me and I remember.
        |Involve me and I learn.
        |(Benjamin Franklin)
    """.trimIndent()
    val myName = "Putra"
    val price = """
        ${'$'}_9.99
    """.trimIndent()
    println("Escaped : " + escaped)
    println("Multiline : " + multiline1)
    println("Multiline 2 : " + multiline2)
    println("Templates : $myName, length : ${myName.length}")
    println("Price : $price")
}

fun learnTypeCheck() {
    val newObject = SampleObject()
    if (newObject is SampleObject) {
        newObject.foo()
        newObject.bar()
    }

    val text = "Sample Text"
    println("This type is string : ${text is String}")
    text as SampleObject
}

class SampleObject {

    fun foo() {
        println("foo")
    }

    fun bar() {
        println("bar")
    }
}