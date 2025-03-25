// Практическая работа №4: Работа с числами
fun main() {
    val days = 2642
    val years = days / 365
    val weeks = (days % 365) / 7
    val remainingDays = (days % 365) % 7
    println("Лет: $years, недель: $weeks, дней: $remainingDays")
}