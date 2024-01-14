package id.learning.kotlin.basic.clasessobject

fun main() {
    val hpPrinter = HpPrinter()
    val epsonPrinter = EpsonPrinter()
    val cannonPrinter = CannonPrinter()

    println("=========================Delegation Pattern (OLD)==========================")
    val hpPrinterController = PrinterController(hpPrinter)
    val epsonPrinterController = PrinterController(epsonPrinter)
    val cannonPrinterController = PrinterController(cannonPrinter)

    hpPrinterController.print("HP Printer Controller")
    epsonPrinterController.print("Epson Printer Controller")
    cannonPrinterController.print("Cannon Printer Controller")

    println("=========================Delegation Pattern (NEW)==========================")
    val newHpPrinterController = PrinterController2(hpPrinter)
    val newEpsonPrinterController = PrinterController(epsonPrinter)
    val newCannonPrinterController = PrinterController(cannonPrinter)

    newHpPrinterController.print("HP Printer Controller")
    newEpsonPrinterController.print("Epson Printer Controller")
    newCannonPrinterController.print("Cannon Printer Controller")
}

// old style
interface Printer {
    fun print(message: String)
}

class CannonPrinter : Printer {

    override fun print(message: String) {
        println("Cannon Printer : $message")
    }
}

class EpsonPrinter : Printer {

    override fun print(message: String) {
        println("Epson Printer : $message")
    }
}

class HpPrinter : Printer {

    override fun print(message: String) {
        println("HP Printer : $message")
    }
}

class PrinterController(
    private val printer: Printer
) : Printer {

    override fun print(message: String) {
        printer.print(message)
    }
}

class PrinterController2(
    private val printer: Printer
) : Printer by printer