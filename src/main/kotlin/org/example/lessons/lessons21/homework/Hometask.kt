package org.example.lessons.lessons21.homework

class Hometask {
    /*
Задача 1

Напишите функцию analyzeDataType, принимающую параметр типа Any.
Функция должна определить тип аргумента и вывести соответствующее сообщение:
- Для строки: "Это строка: [значение]".
- Для любого числа: "Это число: [значение]".
- Для списка: "Это список, количество элементов: [количество]".
- Для словаря: "Это словарь, количество пар: [количество]".
- Для остальных типов: "Неизвестный тип данных".
Используйте оператор is для проверки типов.
*/
    fun analyzeDataType(data: Any) {
        when (data) {
            is String -> println("Это строка: $data")
            is Number -> println("Это число: $data")
            is List<*> -> println("Это список, количество элементов: ${data.size}")
            is Map<*, *> -> println("Это словарь, количество пар: ${data.size}")
            else -> println("Неизвестный тип данных")
        }
    }

    /*
    Задача 2

    Создайте функцию safeCastToList, принимающую параметр типа Any
    и возвращающую размер списка, если аргумент можно безопасно привести к типу List.
    В случае неудачного приведения функция должна возвращать -1.
    Используйте as? для безопасного приведения типа.
    */
    fun safeCastToList(data: Any): Int {
        val list = data as? List<*>
        return list?.size ?: -1
    }

    /*
    Задача 3

    Создайте функцию getStringLengthOrZero, которая принимает параметр типа Any?
    и возвращает длину строки, если аргумент можно привести к типу String.
    В случае, если аргумент равен null или не является строкой, функция должна возвращать 0.
    */
    fun getStringLengthOrZero(data: Any?): Int {
        val string = data as? String
        return string?.length ?: 0
    }

    /*
    Задача 4

    Создайте функцию-расширение класса Any toSquare.
    Функция вызывается у числа или у строки с числом и возвращает квадрат этого числа.
    Если пришло число, возведите его в квадрат.
    Если пришла строка, преобразуйте её в число через toDouble() и возведите в квадрат.
    */
    fun Any.toSquare(): Double {
        return when (this) {
            is Number -> {
                val number = toDouble()
                number * number
            }
            is String -> {
                val number = toDouble()
                number * number
            }
            else -> 0.0
        }
    }

    /*
    Задача 5

    Напишите функцию sumIntOrDoubleValues, которая принимает список элементов типа Any
    и возвращает сумму всех целочисленных (Int) и вещественных (Double) значений в списке.
    Все остальные типы должны быть проигнорированы.
    */
    fun sumIntOrDoubleValues(values: List<Any>): Double {
        var sum: Double = 0.0

        for (value in values) {
            when (value) {
                is Int -> sum += value
                is Double -> sum += value
            }
        }

        return sum
    }

    /*
    Задача 6

    Создайте функцию tryCastToListAndPrint, которая принимает параметр типа Any
    и пытается привести его к типу List<*>. Если приведение успешно, функция должна
    напечатать все строки из списка. Если элемент не является строкой — вывести
    предупреждение. Если приведение неудачно, вывести сообщение об ошибке,
    не прерывая выполнение программы.
    */
    fun tryCastToListAndPrint(data: Any) {
        val list = data as? List<*>

        if (list == null) {
            println("Ошибка: объект не является списком")
            return
        }

        for (element in list) {
            if (element is String) {
                println(element)
            } else {
                println("Предупреждение: элемент $element не является строкой")
            }
        }
    }
}