package id.learning.kotlin.basic.controlflow

fun main() {
    learnReturn()
    learnBreakAndContinue()
}

fun learnReturn() {
    // simple return
    val myName: String? = "null"
    val lengthOfName = myName?.length ?: return
    println("Length of name : $lengthOfName")

    // return to label
    intArrayOf(1, 2, 3, 4, 5).forEach {
        if (it == 3) return@forEach
        println("number : $it")
    }
    println("this point is unreachable")
}

fun learnBreakAndContinue() {
    val array1 = intArrayOf(1, 2, 3, 4, 5)
    val array2 = arrayOf(1, 2, 3, 4)
    loop@ for (i in array1) {
        println("======== index: $i ========")
          for (j in array2) {
            if (i == 3) break@loop
            println(j)
        }
    }
}

