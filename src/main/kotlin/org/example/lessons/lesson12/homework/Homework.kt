package org.example.lessons.lesson12.homework

class Homework {
    /*
Задачи на приведение коллекции к значению
*/

    /*
    Проверить, что размер коллекции больше 5 элементов.
    */
    fun isSizeGreaterThanFive(numbers: List<Int>): Boolean {
        return numbers.size > 5
    }

    /*
    Проверить, что коллекция пустая.
    */
    fun isCollectionEmpty(numbers: List<Int>): Boolean {
        return numbers.isEmpty()
    }

    /*
    Проверить, что коллекция не пустая.
    */
    fun isCollectionNotEmpty(numbers: List<Int>): Boolean {
        return numbers.isNotEmpty()
    }

    /*
    Взять элемент по индексу или создать значение, если индекса не существует.
    */
    fun getElementOrDefault(numbers: List<Int>, index: Int): Int {
        return numbers.getOrElse(index) { 0 }
    }

    /*
    Собрать коллекцию в строку.
    */
    fun numbersToString(numbers: List<Int>): String {
        return numbers.joinToString()
    }

    /*
    Посчитать сумму всех значений.
    */
    fun sumNumbers(numbers: List<Int>): Int {
        return numbers.sum()
    }

    /*
    Посчитать среднее.
    */
    fun averageNumber(numbers: List<Int>): Double {
        return numbers.average()
    }

    /*
    Взять максимальное число.
    */
    fun getMaximum(numbers: List<Int>): Int? {
        return numbers.maxOrNull()
    }

    /*
    Взять минимальное число.
    */
    fun getMinimum(numbers: List<Int>): Int? {
        return numbers.minOrNull()
    }

    /*
    Взять первое число или null.
    */
    fun getFirstNumber(numbers: List<Int>): Int? {
        return numbers.firstOrNull()
    }

    /*
    Проверить, что коллекция содержит элемент.
    */
    fun containsNumber(numbers: List<Int>, number: Int): Boolean {
        return numbers.contains(number)
    }

    /*
    Задачи на обработку коллекций
    */

    /*
    Отфильтровать коллекцию по диапазону 18-30.
    */
    fun filterNumbersFrom18To30(numbers: List<Int>): List<Int> {
        return numbers.filter { it in 18..30 }
    }

    /*
    Выбрать числа, которые не делятся на 2 и 3 одновременно.
    */
    fun filterNumbersNotDivisibleByTwoAndThree(numbers: List<Int>): List<Int> {
        return numbers.filterNot { it % 2 == 0 && it % 3 == 0 }
    }

    /*
    Очистить текстовую коллекцию от null элементов.
    */
    fun removeNullTexts(texts: List<String?>): List<String> {
        return texts.filterNotNull()
    }

    /*
    Преобразовать текстовую коллекцию в коллекцию длин слов.
    */
    fun getWordLengths(words: List<String>): List<Int> {
        return words.map { it.length }
    }

    /*
    Преобразовать текстовую коллекцию в мапу, где ключи — перевёрнутые слова,
    а значения — длина слов.
    */
    fun createReversedWordLengthMap(words: List<String>): Map<String, Int> {
        return words.associate { it.reversed() to it.length }
    }

    /*
    Отсортировать список в алфавитном порядке.
    */
    fun sortWordsAlphabetically(words: List<String>): List<String> {
        return words.sorted()
    }

    /*
    Взять первые 3 элемента списка.
    */
    fun takeFirstThree(numbers: List<Int>): List<Int> {
        return numbers.take(3)
    }

    /*
    Распечатать квадраты элементов списка.
    */
    fun printSquares(numbers: List<Int>) {
        numbers.forEach {
            println(it * it)
        }
    }

    /*
    Группировать список по первой букве слов.
    */
    fun groupWordsByFirstLetter(words: List<String>): Map<Char, List<String>> {
        return words.groupBy { it.first() }
    }

    /*
    Очистить список от дублей.
    */
    fun removeDuplicates(numbers: List<Int>): List<Int> {
        return numbers.distinct()
    }

    /*
    Отсортировать список по убыванию.
    */
    fun sortNumbersDescending(numbers: List<Int>): List<Int> {
        return numbers.sortedDescending()
    }

    /*
    Взять последние 3 элемента списка.
    */
    fun takeLastThree(numbers: List<Int>): List<Int> {
        return numbers.takeLast(3)
    }

    /*
    Задача 24. Характеристика числовой коллекции

    Напиши функцию, которая принимает коллекцию чисел и возвращает строку
    с характеристикой коллекции используя конструкцию when

    Если коллекция пустая - “Пусто”
    Если количество элементов меньше пяти - “Короткая”
    Если коллекция начинается с 0 - “Стартовая”
    Если сумма всех чисел больше 10000 - “Массивная”
    Если среднее значение равно 10 - “Сбалансированная”
    Если длина строки образованная склеиванием коллекции в строку равна 20 - “Клейкая”
    Если максимальное число меньше -10 - “Отрицательная”
    Если минимальное число больше 1000 - “Положительная”
    Если содержит одновременно числа 3 и 14 - “Пи***тая”
    Иначе - “Уникальная”

    Вызвать метод с данными, подходящими под каждую из веток.
    */
    fun getCollectionCharacteristic(numbers: List<Int>): String {
        return when {
            numbers.isEmpty() -> "Пусто"
            numbers.size < 5 -> "Короткая"
            numbers.firstOrNull() == 0 -> "Стартовая"
            numbers.sum() > 10000 -> "Массивная"
            numbers.average() == 10.0 -> "Сбалансированная"
            numbers.joinToString().length == 20 -> "Клейкая"
            (numbers.maxOrNull() ?: 0) < -10 -> "Отрицательная"
            (numbers.minOrNull() ?: 0) > 1000 -> "Положительная"
            3 in numbers && 14 in numbers -> "Пи***тая"
            else -> "Уникальная"
        }
    }

    /*
    Задача 25. Анализ учебных оценок

    Напиши функцию, которая принимает список чисел и возвращает список чисел.

    Пример данных:
    val grades = listOf(85, 58, 90, 74, 88, 67, 95, 92, 50, 42, 12)

    Цель: Отфильтровать удовлетворительные оценки (>=60), отсортировать оставшиеся
    по возрастанию и взять первые 3. Вызывай методы обработки и фильтрации
    последовательно один из другого, чтобы результат предыдущего метода
    являлся основой для следующего.
    */
    fun getTopThreePassingGrades(grades: List<Int>): List<Int> {
        return grades
            .filter { it >= 60 }
            .sorted()
            .take(3)
    }

    /*
    Задача 26. Создание каталога по первой букве

    Напиши функцию, которая принимает список строк и возвращает словарь
    с ключом - буквой и значением - списком строк.

    Начальные значения:
    val list = listOf(
        "Стол", "табурет", "ваза", "Кружка", "Зеркало", "ковер", "Шкаф",
        "часы", "Люстра", "подушка", "Картина", "столик", "Вазон", "шторы",
        "Пуф", "книга", "Фоторамка", "светильник", "Коврик", "вешалка",
        "Подставка", "телевизор", "Комод", "полка", "Абажур", "диван",
        "Кресло", "занавеска", "Бра", "пепельница", "Глобус", "статуэтка",
        "Поднос", "фигурка", "Ключница", "плед", "Тумба", "игрушка",
        "Настенные часы", "подсвечник", "Журнальный столик", "сувенир",
        "Корзина для белья", "посуда", "Настольная лампа", "торшер", "Этажерка"
    )

    Цель: Привести все слова в списке к нижнему регистру, сгруппировать
    в каталог по первой букве используя метод groupBy.
    */
    fun createCatalogByFirstLetter(items: List<String>): Map<Char, List<String>> {
        return items
            .map { it.lowercase() }
            .groupBy { it.first() }
    }

    /*
    Задача 27. Подсчёт средней длины слов в списке

    Напиши функцию, которая принимает список строк и возвращает строку.

    Начальные значения взять из предыдущей задачи.

    Цель: Перевести все слова в количество букв, подсчитать среднее значение.
    Вернуть форматированный текст с двумя знаками после запятой, используя
    функцию format и подходящий шаблон.
    */
    fun getAverageWordLength(words: List<String>): String {
        val averageLength: Double = words
            .map { it.length }
            .average()

        return "Средняя длина слов: %.2f".format(averageLength)
    }

    /*
    Задача 28: Категоризация чисел

    Напиши функцию, которая принимает список чисел и возвращает словарь
    с ключами - строками и значениями - список чисел.

    Начальные значения:
    val numbers = listOf(1, 3, 5, 7, 3, 1, 8, 9, 9, 7)

    Цель: Отобрать уникальные числа, отсортировать по убыванию и сгруппировать
    по четности (“четные” и “нечетные”).
    */
    fun groupUniqueNumbersByParity(numbers: List<Int>): Map<String, List<Int>> {
        return numbers
            .distinct()
            .sortedDescending()
            .groupBy {
                if (it % 2 == 0) "четные" else "нечетные"
            }
    }

    /*
    Задача 29: Поиск первого подходящего элемента

    Напиши функцию, которая принимает список чисел и число и возвращает
    nullable число.

    Начальные значения:
    val ages = listOf(22, 18, 30, 45, 17, null, 60)
    и число для проверки возраста, например 18.

    Цель: Найти первый возраст в списке, который соответствует условию
    (больше второго аргумента) и вернуть его, либо null если значения не нашлось.
    */
    fun findFirstAgeGreaterThan(ages: List<Int?>, minimumAge: Int): Int? {
        return ages
            .filterNotNull()
            .firstOrNull { it > minimumAge }
    }

    /*
    Начальные значения для задач 26 и 27:
    */
    val furnitureItems: List<String> = listOf(
        "Стол", "табурет", "ваза", "Кружка", "Зеркало", "ковер", "Шкаф",
        "часы", "Люстра", "подушка", "Картина", "столик", "Вазон", "шторы",
        "Пуф", "книга", "Фоторамка", "светильник", "Коврик", "вешалка",
        "Подставка", "телевизор", "Комод", "полка", "Абажур", "диван",
        "Кресло", "занавеска", "Бра", "пепельница", "Глобус", "статуэтка",
        "Поднос", "фигурка", "Ключница", "плед", "Тумба", "игрушка",
        "Настенные часы", "подсвечник", "Журнальный столик", "сувенир",
        "Корзина для белья", "посуда", "Настольная лампа", "торшер", "Этажерка"
    )

    /*
    Вызвать метод getCollectionCharacteristic с данными,
    подходящими под каждую из веток задачи 24.
    */
    fun main() {
        println(getCollectionCharacteristic(emptyList()))
        println(getCollectionCharacteristic(listOf(1, 2)))
        println(getCollectionCharacteristic(listOf(0, 1, 2, 4, 5)))
        println(getCollectionCharacteristic(listOf(2000, 2001, 2002, 2003, 2004)))
        println(getCollectionCharacteristic(listOf(2, 5, 10, 13, 20)))
        println(getCollectionCharacteristic(listOf(123, 456, 789, 12, 3)))
        println(getCollectionCharacteristic(listOf(-11, -12, -13, -14, -15)))
        println(getCollectionCharacteristic(listOf(1001, 1002, 1003, 1004, 1005)))
        println(getCollectionCharacteristic(listOf(3, 14, 1, 2, 4)))
        println(getCollectionCharacteristic(listOf(1, 2, 4, 5, 6)))

        val grades: List<Int> = listOf(85, 58, 90, 74, 88, 67, 95, 92, 50, 42, 12)
        println(getTopThreePassingGrades(grades))

        println(createCatalogByFirstLetter(furnitureItems))
        println(getAverageWordLength(furnitureItems))

        val numbers: List<Int> = listOf(1, 3, 5, 7, 3, 1, 8, 9, 9, 7)
        println(groupUniqueNumbersByParity(numbers))

        val ages: List<Int?> = listOf(22, 18, 30, 45, 17, null, 60)
        println(findFirstAgeGreaterThan(ages, 18))
    }
}