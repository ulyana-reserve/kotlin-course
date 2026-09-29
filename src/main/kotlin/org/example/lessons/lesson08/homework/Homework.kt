/*
1. Преобразование строк

Создайте функцию, которая будет анализировать входящие фразы и
применять к ним различные преобразования, делая текст более
ироничным или забавным. Функция должна уметь распознавать ключевые
слова или условия и соответственно изменять фразу.

Правила проверки и преобразования:

- Если фраза содержит слово "невозможно":
  заменить "невозможно" на
  "совершенно точно возможно, просто требует времени".
- Если фраза начинается с "Я не уверен":
  добавить в конец фразы
  ", но моя интуиция говорит об обратном".
- Если фраза содержит слово "катастрофа":
  заменить "катастрофа" на "интересное событие".
- Если фраза заканчивается на "без проблем":
  заменить "без проблем" на
  "с парой интересных вызовов на пути".
- Если фраза содержит только одно слово:
  добавить перед словом "Иногда," и после слова ", но не всегда".

Примеры тестовых фраз:

- "Это невозможно выполнить за один день"
- "Я не уверен в успехе этого проекта"
- "Произошла катастрофа на сервере"
- "Этот код работает без проблем"
- "Удача"
*/
fun transformPhrase(input: String): String {
    var phrase = input

    if (phrase.contains("невозможно")) {
        phrase = phrase.replace(
            "невозможно",
            "совершенно точно возможно, просто требует времени"
        )
    }

    if (phrase.startsWith("Я не уверен")) {
        phrase += ", но моя интуиция говорит об обратном"
    }

    if (phrase.contains("катастрофа")) {
        phrase = phrase.replace("катастрофа", "интересное событие")
    }

    if (phrase.endsWith("без проблем")) {
        phrase = phrase.replace(
            "без проблем",
            "с парой интересных вызовов на пути"
        )
    }

    var wordCount = 0

    for (word in input.trim().split(" ")) {
        if (word != "") {
            wordCount++
        }
    }

    if (wordCount == 1) {
        phrase = "Иногда, $phrase, но не всегда"
    }

    return phrase
}

/*
2. Извлечение даты из строки лога

У вас есть строка лога, например:
"Пользователь вошел в систему -> 2021-12-01 09:48:23"
(данные могут быть любыми, но формат всегда такой).

Извлеките отдельно дату и время из этой строки и сразу распечатайте
их по очереди. Используйте indexOf или split для получения правой
части сообщения.
*/
fun printLogDateAndTime(log: String) {
    val rightPart = log.split(" -> ")[1]
    val dateAndTime = rightPart.split(" ")

    println(dateAndTime[0])
    println(dateAndTime[1])
}

/*
3. Маскирование личных данных

Дана строка с номером кредитной карты, например:
"4539 1488 0343 6467".

Замаскируйте все цифры, кроме последних четырёх, символами "*".
*/
fun maskCardNumber(cardNumber: String): String {
    var result = ""

    for (i in 0 until cardNumber.length) {
        if (cardNumber[i] == ' ') {
            result += " "
        } else {
            var charactersAfter = 0

            for (j in i + 1 until cardNumber.length) {
                if (cardNumber[j] != ' ') {
                    charactersAfter++
                }
            }

            if (charactersAfter >= 4) {
                result += "*"
            } else {
                result += cardNumber[i]
            }
        }
    }

    return result
}

/*
4. Форматирование адреса электронной почты

У вас есть электронный адрес, например:
"username@example.com".

Преобразуйте его в строку:
"username [at] example [dot] com",
используя функцию replace().
*/
fun formatEmail(email: String): String {
    return email
        .replace("@", " [at] ")
        .replace(".", " [dot] ")
}

/*
5. Извлечение имени файла из пути

Дан путь к файлу, например:
"C:/Пользователи/Документы/report.txt"
или "D:/good.themes/dracula.theme"
(путь может быть любым).

Извлеките название файла с расширением.
*/
fun extractFileName(path: String): String {
    var lastSlashIndex = -1

    for (i in 0 until path.length) {
        if (path[i] == '/') {
            lastSlashIndex = i
        }
    }

    return path.substring(lastSlashIndex + 1, path.length)
}

/*
6. Создание аббревиатуры из фразы

У вас есть фраза, например:
"Котлин лучший язык программирования"
(фраза может быть любой, слова разделены пробелами).

Создайте аббревиатуру из начальных букв слов
(например, "ООП").

Используйте split для разделения фразы, for для перебора слов
и var-переменную для накопления первых букв.
*/
fun createAbbreviation(phrase: String): String {
    var abbreviation = ""

    for (word in phrase.trim().split(" ")) {
        if (word != "") {
            abbreviation += word[0]
        }
    }

    return abbreviation
}

fun main() {
    println(transformPhrase("Это невозможно выполнить за один день"))
    println(transformPhrase("Я не уверен в успехе этого проекта"))
    println(transformPhrase("Произошла катастрофа на сервере"))
    println(transformPhrase("Этот код работает без проблем"))
    println(transformPhrase("Удача"))

    printLogDateAndTime(
        "Пользователь вошел в систему -> 2021-12-01 09:48:23"
    )

    println(maskCardNumber("4539 1488 0343 6467"))
    println(formatEmail("username@example.com"))
    println(extractFileName("C:/Пользователи/Документы/report.txt"))
    println(createAbbreviation("Котлин лучший язык программирования"))
}