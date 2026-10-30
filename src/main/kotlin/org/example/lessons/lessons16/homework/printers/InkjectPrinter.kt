package org.example.lessons.lessons16.homework.printers

class InkjetPrinter : Printer() {
    private val colorPairs = listOf(
        Colors.WHITE to Colors.RED_BACKGROUND,
        Colors.BLACK to Colors.YELLOW_BACKGROUND,
        Colors.WHITE to Colors.BLUE_BACKGROUND,
        Colors.BLACK to Colors.CYAN_BACKGROUND,
        Colors.WHITE to Colors.PURPLE_BACKGROUND
    )

    override fun print(text: String) {
        val words = text.split(" ")
        var i = 0

        for (word in words) {
            val colorPair = colorPairs[i]
            val textColor = colorPair.first
            val backgroundColor = colorPair.second

            println("$textColor$backgroundColor$word${Colors.RESET}")

            i++
            if (i == colorPairs.size) {
                i = 0
            }
        }
    }
}