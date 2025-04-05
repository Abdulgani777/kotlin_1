fun main() {
    print("Введите число: ")
    val input = readLine() ?: return

    // Преобразуем введенное значение в число
    val n = input.toIntOrNull()
    if (n != null) {
        // Вычисляем результат
        val result = "$n${n * 2}"
        println("Результат: $result")
    } else {
        println("Пожалуйста, введите корректное число.")
    }
}