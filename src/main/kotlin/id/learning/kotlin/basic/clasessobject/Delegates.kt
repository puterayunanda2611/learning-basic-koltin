package id.learning.kotlin.basic.clasessobject

import kotlin.properties.Delegates
import kotlin.reflect.KProperty

fun main() {
    println("=========================Simple Delegation==========================")
    val delegating = SampleDelegateImpl()
    println(delegating.property)
    delegating.property = "New property"
    println("=========================Lazy Properties=============================")
    val sampleDelegateLazy = SampleDelegateLazy()
    println("Waiting for lazy value...")
    println(sampleDelegateLazy.lazyValue)
    val sampleDelegateObservable = SampleDelegateObservable()
    sampleDelegateObservable.name = "First"
    sampleDelegateObservable.name = "Second"
    println("=========================Map Delegation=============================")
    val sampleDelegateMap = SampleDelegateMap(
        mapOf(
            "name" to "John Doe",
            "age" to 25,
            "company" to "Google, Inc.",
            "position" to "Software Engineer"
        )
    )
    println(sampleDelegateMap)
}

class SampleDelegate1 {
    operator fun getValue(thisRef: Any?, property: KProperty<*>): String {
        return "$thisRef, thank you for delegating '${property.name}' to me!"
    }

    operator fun setValue(thisRef: Any?, property: KProperty<*>, value: String) {
        println("$value has been assigned to '${property.name}' in $thisRef.")
    }
}

class SampleDelegateImpl {
    var property: String by SampleDelegate1()
}

class SampleDelegateLazy {
    val lazyValue: String by lazy {
        println("computed!")
        "Hello"
    }
}

class SampleDelegateObservable {
    var name: String by Delegates.observable("<no name>") { prop, old, new ->
        println("$old -> $new")
    }
}

class SampleDelegateMap(map: Map<String, Any?>) {
    val name: String by map
    val age: Int by map
    val company: String by map
    val position: String by map

    override fun toString(): String {
        return "Data : \nname=$name,\nage=$age,\ncompany=$company,\nposition=$position"
    }
}
