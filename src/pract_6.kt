// Практическая работа №6: Работа с переменными
fun main() {
    print("Введите имя: ")
    val name = readLine() ?: ""
    print("Введите возраст: ")
    val age = readLine()?.toIntOrNull()
    if (age != null) {
        println("Привет, $name! Тебе уже $age.")
    } else {
        println("Ошибка: Введите корректный возраст.")
    }
}