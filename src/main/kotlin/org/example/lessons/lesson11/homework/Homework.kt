package org.example.lessons.lesson11.homework

/*
Задачи на сигнатуру метода

Напишите сигнатуру метода в которую входит модификатор доступа, название функции, список аргументов
с типами и возвращаемое значение. В теле метода можешь сделать возврат объекта нужного типа если
это требуется для устранения ошибок.
*/

/*
1. Не принимает аргументов и не возвращает значения.
*/
public fun example1(): Unit {
}

/*
2. Принимает два целых числа и возвращает их сумму.
*/
public fun example2(firstNumber: Int, secondNumber: Int): Int {
    return firstNumber + secondNumber
}

/*
3. Принимает строку и ничего не возвращает.
*/
public fun example3(text: String): Unit {
}

/*
4. Принимает список целых чисел и возвращает среднее значение типа Double.
*/
public fun example4(numbers: List<Int>): Double {
    var sum = 0
    for (number in numbers) {
        sum += number
    }

    return sum.toDouble() / numbers.size
}

/*
5. Принимает nullable строку и возвращает её длину в виде nullable целого числа
и доступна только в текущем файле.
*/
private fun example5(text: String?): Int? {
    if (text == null) {
        return null
    }
    return text.length
}

/*
6. Не принимает аргументов и возвращает nullable вещественное число.
*/
public fun example6(): Double? {
    return null
}

/*
7. Принимает nullable список целых чисел, не возвращает значения
и доступна только в текущем файле.
*/
private fun example7(numbers: List<Int>?): Unit {
}

/*
8. Принимает целое число и возвращает nullable строку.
*/
public fun example8(number: Int): String? {
    return null
}

/*
9. Не принимает аргументов и возвращает список nullable строк.
*/
public fun example9(): List<String?> {
    return listOf("строка", null)
}

/*
10. Принимает nullable строку и nullable целое число
и возвращает nullable булево значение.
*/
public fun example10(text: String?, number: Int?): Boolean? {
    return null
}

/*
Задачи на написание кода
Напишите валидную сигнатуру метода а так же рабочий код для задач.
*/

/*
11. Напишите функцию multiplyByTwo, которая принимает целое число
и возвращает его, умноженное на 2.
*/
public fun multiplyByTwo(number: Int): Int {
    return number * 2
}

/*
12. Создайте функцию isEven, которая принимает целое число и возвращает true,
если число чётное, и false в противном случае.
*/
public fun isEven(number: Int): Boolean {
    return number % 2 == 0
}

/*
13. Напишите функцию printNumbersUntil, которая принимает целое число n
и выводит на экран числа от 1 до n. Если число n меньше 1,
функция должна прекратить выполнение с помощью return без вывода сообщений.
*/
public fun printNumbersUntil(n: Int): Unit {
    if (n < 1) {
        return
    }
    for (number in 1..n) {
        println(number)
    }
}

/*
14. Создайте функцию findFirstNegative, которая принимает список целых чисел
и возвращает первое отрицательное число в списке. Если отрицательных чисел нет,
функция должна вернуть null.
*/
public fun findFirstNegative(numbers: List<Int>): Int? {
    for (number in numbers) {
        if (number < 0) {
            return number
        }
    }
    return null
}

/*
15. Напишите функцию processList, которая принимает список строк.
Функция должна проходить по списку и выводить каждую строку.
Если встречается null значение, функция должна прекратить выполнение
с помощью return без возврата значения.
*/
public fun processList(strings: List<String?>): Unit {
    for (string in strings) {
        if (string == null) {
            return
        }
        println(string)
    }
}