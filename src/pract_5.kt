// Практическая работа №5: Нахождение числа
fun main() {
    print("Введите число: ")
    val n = readLine()?.toIntOrNull()
    if (n != null) {
        println("Результат: ${n + n * 2}")
    } else {
        println("Ошибка: Введите корректное число.")
    }
}