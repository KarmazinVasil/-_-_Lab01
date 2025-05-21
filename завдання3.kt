@file:JvmName("DigitSwapper")

fun Int.swapFirstAndLast(): Int = when {
    this < 10 -> this
    else -> toString().let { digits ->
        (digits.last() + digits.drop(1).dropLast(1) + digits.first()).toInt()
    }
}

fun processNumberInput() {
    print("Введіть число: ")
    readLine()
        ?.toIntOrNull()
        ?.let { original ->
            val result = original.swapFirstAndLast()
            println("Результат перестановки: $result")
        }
        ?: println("Помилка: потрібно ціле число")
}

fun main() = processNumberInput()
