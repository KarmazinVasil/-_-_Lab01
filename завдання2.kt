@file:JvmName("NumberCounter")

fun countThreeDigitNumbers() {
    println("Введіть натуральні числа через пробіл:")
    readLine()
        ?.split(" ")
        ?.mapNotNull { it.toIntOrNull() }
        ?.count { it in 100..999 }
        ?.let { println("кількість трьозначних чисел: $it") }
        ?: println("Неправильний формат ")
}

fun main() = countThreeDigitNumbers()
