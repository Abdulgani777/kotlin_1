// Практическая работа №3: Разделение числа на символы
fun main() {
    print("Введите четырехзначное число: ")
    val input = readLine()?.toIntOrNull()
    if (input != null && input in 1000..9999) {
        val digits = input.toString().toCharArray().joinToString(", ")
        println("Разделенные цифры: $digits")
    } else {
        println("Ошибка: Введите корректное четырехзначное число.")
    }
}