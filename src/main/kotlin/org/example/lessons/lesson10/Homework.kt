package org.example.lessons.lesson10

fun main() {
    /*
    1. Создайте пустой неизменяемый словарь, где ключи и значения - целые числа.
    */
    val emptyNumbers: Map<Int, Int> = mapOf()

    /*
    2. Создайте словарь, инициализированный несколькими парами "ключ-значение",
    где ключи - float, а значения - double.
    */
    val floatDoubleValues: Map<Float, Double> = mapOf(
        1.5f to 10.25,
        2.5f to 20.75
    )

    /*
    3. Создайте изменяемый словарь, где ключи - целые числа, а значения - строки.
    */
    val numberNames: MutableMap<Int, String> = mutableMapOf(
        1 to "один",
        2 to "два"
    )

    /*
    4. Имея изменяемый словарь, добавьте в него новые пары "ключ-значение".
    */
    numberNames[3] = "три"
    numberNames[4] = "четыре"

    /*
    5. Используя словарь из предыдущего задания, извлеките значение,
    используя ключ. Попробуй получить значение с ключом,
    которого в словаре нет.
    */
    println(numberNames[3])
    println(numberNames[99])

    /*
    6. Удалите определенный элемент из изменяемого словаря по его ключу.
    */
    numberNames.remove(2)

    /*
    7. Создайте словарь (ключи Double, значения Int) и выведи в цикле
    результат деления ключа на значение. Не забудь обработать деление на 0
    (в этом случае выведи слово “бесконечность”).
    */
    val divisionValues: Map<Double, Int> = mapOf(
        10.0 to 2,
        15.0 to 0,
        20.0 to 4
    )

    for ((key, value) in divisionValues) {
        if (value == 0) {
            println("бесконечность")
        } else {
            println(key / value.toDouble())
        }
    }

    /*
    8. Измените значение для существующего ключа в изменяемом словаре.
    */
    numberNames[1] = "единица"

    /*
    9. Создайте два словаря и объедините их в третьем изменяемом словаре
    через циклы.
    */
    val firstMap: Map<String, Int> = mapOf(
        "a" to 1,
        "b" to 2
    )

    val secondMap: Map<String, Int> = mapOf(
        "b" to 20,
        "c" to 3
    )

    val combinedMap: MutableMap<String, Int> = mutableMapOf()

    for ((key, value) in firstMap) {
        combinedMap[key] = value
    }

    for ((key, value) in secondMap) {
        combinedMap[key] = value
    }

    /*
    10. Создайте словарь, где ключами являются строки, а значениями -
    списки целых чисел. Добавьте несколько элементов в этот словарь.
    */
    val numbersByName: MutableMap<String, MutableList<Int>> = mutableMapOf()
    numbersByName["Анна"] = mutableListOf(1, 2, 3)
    numbersByName["Иван"] = mutableListOf(4, 5)

    /*
    11. Создай словарь, в котором ключи - это целые числа,
    а значения - изменяемые множества строк. Добавь данные в словарь.
    Получи значение по ключу (это должно быть множество строк)
    и добавь в это множество ещё строку. Распечатай полученное множество.
    */
    val wordsByNumber: MutableMap<Int, MutableSet<String>> = mutableMapOf(
        1 to mutableSetOf("кот", "пёс"),
        2 to mutableSetOf("дом", "лес")
    )

    val selectedSet: MutableSet<String>? = wordsByNumber[1]

    if (selectedSet != null) {
        selectedSet.add("птица")
        println(selectedSet)
    }

    /*
    12. Создай словарь, где ключами будут пары чисел.
    Через перебор найди значение у которого пара будет содержать цифру 5
    в качестве первого или второго значения.
    */
    val valuesByPair: Map<Pair<Int, Int>, String> = mapOf(
        (2 to 5) to "Первая пара",
        (5 to 3) to "Вторая пара",
        (4 to 7) to "Третья пара"
    )

    for ((pair, value) in valuesByPair) {
        if (pair.first == 5 || pair.second == 5) {
            println(value)
        }
    }

    /* Задачи на подбор оптимального типа для словаря
1. Словарь библиотека: Ключи - автор книги, значения - список книг.

Каталог пополняется: книги можно добавлять существующим авторам,
поэтому изменяемы словарь и списки.
*/
    val library: MutableMap<String, MutableList<String>> = mutableMapOf()

    /*
    2. Справочник растений: Ключи - типы растений (например, "Цветы",
    "Деревья"), значения - списки названий растений.
    */
    val plants: Map<String, List<String>> = mapOf()

    /*
    3. Четвертьфинала: Ключи - названия спортивных команд,
    значения - списки игроков каждой команды.

    Составы команд для матча считаю зафиксированными.
    */
    val quarterFinals: Map<String, List<String>> = mapOf()

    /*
    4. Курс лечения: Ключи - даты, значения - список препаратов
    принимаемых в дату.

    Предполагаю, что назначение может корректироваться,
   поэтому словарь и списки изменяемы.
    */
    val treatmentPlan: MutableMap<String, MutableList<String>> = mutableMapOf()

    /*
    5. Словарь путешественника: Ключи - страны, значения - словари
    из городов со списком интересных мест.

    Предполагаю, что путешественник дополняет справочник. Поэтому все
    уровни изменяемы: можно добавить страну, город или интересное место.
    */
    val travelGuide: MutableMap<String, MutableMap<String, MutableList<String>>> =
        mutableMapOf()
}