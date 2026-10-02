package org.example.lessons.lesson09.homework

/*
ДЗ: массивы, списки и множества
*/

fun main() {

    //Работа с массивами Array

    /*
    1. Создайте массив из 5 целых чисел и инициализируйте его значениями
    от 1 до 5.
    */
    val a = arrayOf(1, 2, 3, 4, 5)

    /*
    2. Создайте пустой массив строк размером 10 элементов.
    */
    val b = Array(10) {""}

    /*
    3. Создайте массив из 5 элементов типа Double и заполните его
    значениями, являющимися удвоенным индексом элемента.
    */
    val c = Array(5) { 0.0 }
    for (index in c.indices) {
        c[index] =index.toDouble()*2.0
    }

    /*
    4. Создайте массив из 5 элементов типа Int. Используйте цикл,
    чтобы присвоить каждому элементу значение, равное его индексу,
    умноженному на 3.
    */
    val d=Array(5) { 0 }

    for (index in d.indices) {
        d[index] = index*3
    }

    /*
    5. Создайте массив из 3 nullable строк. Инициализируйте его одним
    null значением и двумя строками.
    */
    val nullableStrings = arrayOf<String?>(null, "Kotlin", "Java")

    /*
    6. Создайте массив целых чисел и скопируйте его в новый массив
    в цикле.
    */
    val source=arrayOf(3, 6, 9, 12, 15)
    val copy=Array(5) { 0 }
    for (index in source.indices) {
        copy[index] = source[index]
    }

    //val m = Arrays.copyOf(source, source.size)

    /*
    7. Создайте два массива целых чисел одинаковой длины. Создайте третий
    массив, вычтя значения одного из другого. Распечатайте полученные
    значения.
    */
    val first = arrayOf(20, 30, 40, 50)
    val second = arrayOf(1, 2, 3, 4)
    val diff = Array(4) { 0 }

    for (index in first.indices) {
        diff[index] = first[index] - second[index]
        println(diff[index])
    }

    /*
    8. Создайте массив целых чисел. Найдите индекс элемента со значением 5.
    Если значения 5 нет в массиве, печатаем -1. Реши задачу через цикл while.
    */
    val numbersToSearch = arrayOf(2, 4, 5, 8, 10)
    var searchedIndex: Int=-1
    var searchPosition: Int =0

    while (searchPosition <= numbersToSearch.lastIndex && searchedIndex == -1) {
        if (numbersToSearch[searchPosition] == 5) {
            searchedIndex = searchPosition
        }
        searchPosition++
    }
    println(searchedIndex)

    /*
    9. Создайте массив целых чисел. Используйте цикл для перебора массива
    и вывода каждого элемента в консоль. Напротив каждого элемента должно
    быть написано “чётное” или “нечётное”.
    */
    val s = arrayOf(3, 8, 11, 14, 20)
    for (number in s) {
        if (number % 2 == 0) {
            println("$number — чётное")
        } else {
            println("$number — нечётное")
        }
    }

    /*
    10. Создай функцию, которая принимает массив строк и строку для поиска.
    Функция должна находить в массиве элемент, в котором принятая строка
    является подстрокой (метод contains()). Распечатай найденный элемент.
    */
    fun printString(stringArray: Array<String>, searchPart: String) {
        var found: Boolean= false
        var index: Int = 0

        while (index <= stringArray.lastIndex && !found) {
            if (stringArray[index].contains(searchPart)) {
                println(stringArray[index])
                found = true
            }
            index++
        }

    }


    //Работа со списками List

    /*
    1. Создайте пустой неизменяемый список целых чисел.
    */
    val emptyIntegerList: List<Int> = listOf()

    /*
    2. Создайте неизменяемый список строк, содержащий три элемента
    (например, "Hello", "World", "Kotlin").
    */
    val greetingWords: List<String> = listOf("Hello", "World", "Kotlin")

    /*
    3. Создайте изменяемый список целых чисел и инициализируйте его
    значениями от 1 до 5.
    */
    val mutableNumbers = mutableListOf(1, 2, 3, 4, 5)

    /*
    4. Имея изменяемый список целых чисел, добавьте в него новые элементы
    (например, 6, 7, 8).
    */
    mutableNumbers.add(6)
    mutableNumbers.add(7)
    mutableNumbers.add(8)

    /*
    5. Имея изменяемый список строк, удалите из него определенный элемент
    (например, "World").
    */
    val mutableGreetingWords = mutableListOf("Hello", "World", "Kotlin")
    mutableGreetingWords.remove("World")

    /*
    6. Создайте список целых чисел и используйте цикл для вывода каждого
    элемента на экран.
    */
    val numbersForPrinting = listOf(10, 20, 30, 40)

    for (number in numbersForPrinting) {
        println(number)
    }

    /*
    7. Создайте список строк и получите из него второй элемент,
    используя его индекс.
    */
    val wordsForIndexing = listOf("первый", "второй", "третий")
    val secondWord = wordsForIndexing[1]

    /*
    8. Имея изменяемый список чисел, измените значение элемента
    на определенной позиции (например, замените элемент с индексом 2
    на новое значение).
    */
    val mutableNumbersForUpdate = mutableListOf(10, 20, 30, 40)
    mutableNumbersForUpdate[2] = 99

    /*
    9. Создайте два списка строк и объедините их в один новый список,
    содержащий элементы обоих списков. Реши задачу с помощью циклов.
    */
    val one = listOf("кот", "пёс")
    val two = listOf("птица", "рыба")
    val newList = mutableListOf<String>()
    for (word in one) {
        newList.add(word)
    }

    for (word in two) {
        newList.add(word)
    }

    /*
    10. Создайте список целых чисел и найдите в нем минимальный
    и максимальный элементы используя цикл.
    */
    val listNumbers = listOf(12, -4, 25, 7, 0)
    var minimum = listNumbers[0]
    var maximum = listNumbers[0]

    for (number in listNumbers) {
        if (number < minimum) {
            minimum = number
        }

        if (number > maximum) {
            maximum = number
        }
    }


    /*
    11. Имея список целых чисел, создайте новый список, содержащий только
    четные числа из исходного списка используя цикл.
    */
    val evenList = listOf(1, 2, 3, 4, 5, 6, 7, 8)
    val evenNumbers = mutableListOf<Int>()

    for (number in evenList) {
        if (number % 2 == 0) {
            evenNumbers.add(number)
        }
    }


    //Работа с Множествами Set

    /*
    1. Создайте пустое неизменяемое множество целых чисел.
    */
    val emptyIntegerSet: Set<Int> = emptySet()

    /*
    2. Создайте неизменяемое множество целых чисел, содержащее три
    различных элемента (например, 1, 2, 3).
    */
    val threeNumbers: Set<Int> = setOf(1, 2, 3)

    /*
    3. Создайте изменяемое множество строк и инициализируйте его
    несколькими значениями (например, "Kotlin", "Java", "Scala").
    */
    val mutableLanguages = mutableSetOf("Kotlin", "Java", "Scala")

    /*
    4. Имея изменяемое множество строк, добавьте в него новые элементы
    (например, "Swift", "Go").
    */
    mutableLanguages.add("Swift")
    mutableLanguages.add("Go")

    /*
    5. Имея изменяемое множество целых чисел, удалите из него определенный
    элемент (например, 2).
    */
    val dd = mutableSetOf(1, 2, 3, 4)
    dd.remove(2)

    /*
    6. Создайте множество целых чисел и используйте цикл для вывода
    каждого элемента на экран.
    */
    val numbersForSetPrinting = setOf(5, 10, 15)

    for (number in numbersForSetPrinting) {
        println(number)
    }

    /*
    7. Создай функцию, которая принимает множество строк (set) и строку
    и проверяет, есть ли в множестве указанная строка. Нужно распечатать
    булево значение true если строка есть. Реши задачу через цикл.
    */
    fun printIfSetContains(setString: Set<String>, searchValue: String) {

        for (value in setString) {
            if (value == searchValue) {
                println(true)
                break
            }
        }

    }

    /*
    8. Создайте неизменяемое множество строк и конвертируйте его
    в изменяемый список строк с использованием цикла.
    */
    val immutableWords: Set<String> = setOf("Kotlin", "Java", "Scala")
    val mutableWordsFromSet = mutableListOf<String>()

    for (word in immutableWords) {
        mutableWordsFromSet.add(word)
    }

}