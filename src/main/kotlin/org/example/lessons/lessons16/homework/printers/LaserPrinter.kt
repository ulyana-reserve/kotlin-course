package org.example.lessons.lessons16.homework.printers

class LaserPrinter : Printer() {
    override fun print(text: String) {
        val words = text.trim().split(Regex("\\s+"))

        for (word in words) {
            println("${Colors.BLACK}${Colors.WHITE_BACKGROUND}$word${Colors.RESET}")
        }
    }
}