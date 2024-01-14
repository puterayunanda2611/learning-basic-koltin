package id.learning.kotlin.basic.clasessobject

fun main() {
    val source = Source { "Covariant Sample" }
    val text = demoString(source)
    println("Sample text covariant : $text")
    val isEven = Comparable<Double> { (it % 2) == 0.0 }
    val compare = demoComparable(isEven)
    println("Is even(contravariant)  : $compare")
    val ints: Array<Int> = arrayOf(1, 2, 3)
    val any = Array<Any>(3) {  }
    copy(ints, any)
}

fun interface Source<out T> {
    fun get(): T
}

fun interface Comparable<in T> {
    fun compareTo(other: T): Boolean
}

fun demoString(strs: Source<String>): Any {
    val objects: Source<Any> = strs
    return objects.get()
}

fun demoComparable(x: Comparable<Double>): Boolean {
    return x.compareTo(4.0)
}

// projection
fun copy(from: Array<out Any>, to: Array<Any>) {
    assert(from.size == to.size)
    for (i in from.indices)
        to[i] = from[i]

    for (i in from.indices) {
        println("value : ${to[i]}")
    }
}