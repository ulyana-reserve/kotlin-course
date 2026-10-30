package org.example.lessons.lessons16.homework.printers

class Main {
}
fun main() {
    val text = "Полиморфизм в ООП позволяет одному методу работать по-разному в зависимости от объекта." +
            "Лазерный принтер печатает каждое слово чёрным цветом на белом фоне, " +
            "а струйный принтер использует разные цвета текста и фона."

    val printers: List<Printer> = listOf(
        LaserPrinter(),
        InkjetPrinter()
    )

    for (printer in printers) {
        printer.print(text)
        println()
    }
}