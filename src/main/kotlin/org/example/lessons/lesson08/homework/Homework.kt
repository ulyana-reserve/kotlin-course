package org.example.lessons.lesson08.homework

class Homework {

    // 1. Преобразование строк
    fun makeFunny(phrase: String): String {
        val words = phrase.trim().split(" ")

        return when {
            phrase.contains("невозможно") ->
                phrase.replace(
                    "невозможно",
                    "совершенно точно возможно, просто требует времени"
                )

            phrase.startsWith("Я не уверен") ->
                "$phrase, но моя интуиция говорит об обратном"

            phrase.contains("катастрофа") ->
                phrase.replace("катастрофа", "интересное событие")

            phrase.endsWith("без проблем") ->
                phrase.replace(
                    "без проблем",
                    "с парой интересных вызовов на пути"
                )

            phrase.trim().isNotEmpty() && words.size == 1 ->
                "Иногда, ${phrase.trim()}, но не всегда"

            else -> phrase
        }
    }

    // 2. Извлечение даты и времени из лога
    fun printDateAndTime(log: String) {
        val rightPart = log.split("->")[1].trim()
        val dateAndTime = rightPart.split(" ")

        println(dateAndTime[0])
        println(dateAndTime[1])
    }

    // 3. Маскирование номера карты
    fun maskCard(card: String): String {
        val lastFour = card.substring(card.length - 4)
        var masked = ""

        for (i in 0 until card.length - 4) {
            masked += if (card[i] == ' ') " " else "*"
        }

        return masked + lastFour
    }

    // 4. Форматирование электронной почты
    fun formatEmail(email: String): String {
        return email.replace("@", " [at] ")
            .replace(".", " [dot] ")
    }

    // 5. Извлечение имени файла
    fun getFileName(path: String): String {
        val parts = path.split("/")
        return parts[parts.size - 1]
    }

    // 6. Создание аббревиатуры
    fun makeAbbreviation(phrase: String): String {
        val words = phrase.split(" ")
        var abbreviation = ""

        for (word in words) {
            if (word.isNotEmpty()) {
                abbreviation += word[0].uppercase()
            }
        }

        return abbreviation
    }
}

fun main() {
    val homework = Homework()

    println("1. Преобразование строк:")
    println(homework.makeFunny("Это невозможно выполнить за один день"))
    println(homework.makeFunny("Я не уверен в успехе этого проекта"))
    println(homework.makeFunny("Произошла катастрофа на сервере"))
    println(homework.makeFunny("Этот код работает без проблем"))
    println(homework.makeFunny("Удача"))

    println("\n2. Дата и время из лога:")
    homework.printDateAndTime(
        "Пользователь вошел в систему -> 2021-12-01 09:48:23"
    )

    println("\n3. Маскирование номера карты:")
    println(homework.maskCard("4539 1488 0343 6467"))

    println("\n4. Форматирование почты:")
    println(homework.formatEmail("username@example.com"))

    println("\n5. Имена файлов:")
    println(homework.getFileName("C:/Пользователи/Документы/report.txt"))
    println(homework.getFileName("D:/good.themes/dracula.theme"))

    println("\n6. Аббревиатура:")
    println(homework.makeAbbreviation("Котлин лучший язык программирования"))
}