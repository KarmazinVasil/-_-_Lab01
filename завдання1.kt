@file:JvmName("TrigonometryComparator")

import kotlin.math.*

fun compareTrigonometricValues() {
    val radians = readLine()?.toDoubleOrNull()?.takeIf { it.isFinite() } 
        ?: run {
            println("Неправильне число")
            return
        }

    with(radians) {
        val sineValue = sin(this)
        val cosineValue = cos(this)
        
        listOf("Синус" to sineValue, "Косинус" to cosineValue)
            .sortedByDescending { it.second }
            .let { (first, second) ->
                when {
                    first.second == second.second -> "Довівнює (${first.second})"
                    else -> "${first.first} (${first.second}) більше чим ${second.first} (${second.second})"
                }
            }
            .let(::println)
    }
}

fun main() {
    print("Введіть угол в радіанах: ")
    compareTrigonometricValues()
}
