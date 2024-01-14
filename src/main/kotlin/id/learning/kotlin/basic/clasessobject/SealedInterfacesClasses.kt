package id.learning.kotlin.basic.clasessobject

import java.io.File
import javax.sql.DataSource

fun main() {
    getError(FileReadError)
}

fun getError(error: IOError) {
    when (error) {
        DatabaseError -> println("Database Error")
        FileReadError -> println("File Read Error")
        is NetworkError -> println("Network Error")
    }
}

sealed interface Error

sealed class IOError: Error

data object FileReadError: IOError()
data object DatabaseError: IOError()
class NetworkError(val error: String): IOError()
