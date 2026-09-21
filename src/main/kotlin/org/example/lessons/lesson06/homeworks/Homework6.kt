package org.example.lessons.lesson06.homeworks

class Homework6 {
    /*
    Задание 1: "Определение сезона"
Напишите функцию, которая на основе
 номера месяца распечатывает сезон года. Номера месяцев начинаются с единицы.
     */
    fun printSeason(month: Int) {

        when (month) {
            1, 2, 12 -> println("Winter")
            in 3..5 -> println("Spring")
            in 6..8 -> println("Summer")
            in 9..11 -> println("Fall")
            else -> println("Invalid month number")
        }
    }

    /*
    Задание 2: "Расчет возраста питомца"
Создайте функцию, которая преобразует возраст собаки в
 "человеческие" годы. До 2 лет каждый год собаки равен 10.5 человеческим годам,
после - каждый год равен 4 человеческим годам.
 Результат распечатай в консоль.
     */

    fun convertDogAge(dogAge: Int) {
        if (dogAge < 0) {
            println("Incorrect age value")
        } else if (dogAge <= 2) {
            println(dogAge * 10.5)
        } else {
            println(2 * 10.5 + (dogAge - 2) * 4)
        }
    }

    /*
Задание 3: "Определение способа перемещения"

Напишите функцию, которая печатает в консоль, какой способ перемещения лучше
использовать, исходя из длины маршрута. Если маршрут до 1 км — "пешком",
до 5 км — "велосипед", иначе — "автотранспорт".
*/
    fun printTransportType(distance: Double) {
        if (distance < 0) {
            println("Incorrect distance value")
        } else if (distance <= 1) {
            println("Пешком")
        } else if (distance <= 5) {
            println("Велосипед")
        } else {
            println("Автотранспорт")
        }
    }

    /*
    Задание 4: "Расчет бонусных баллов"

    Клиенты интернет-магазина получают бонусные баллы за покупки.
    Напишите функцию, которая принимает сумму покупки и печатает в консоль
    количество бонусных баллов: 2 балла за каждые 100 рублей при сумме покупки
    до 1000 рублей и 3 балла за каждые 100 рублей при сумме свыше этого.
    */
    fun printBonusPoints(purchaseAmount: Int) {
        if (purchaseAmount < 0) {
            println("Incorrect purchase amount")
        } else if (purchaseAmount <= 1000) {
            println(purchaseAmount / 100 * 2)
        } else {
            println(purchaseAmount / 100 * 3)
        }
    }

    /*
    Задание 5: "Определение типа документа"

    В системе хранения документов каждый файл имеет расширение.
    Напишите функцию, которая на основе расширения файла печатает в консоль
    его тип: "Текстовый документ", "Изображение", "Таблица"
    или "Неизвестный тип".
    */
    fun printDocumentType(extension: String) {
        when (extension.lowercase()) {
            "txt", "doc", "docx" -> println("Текстовый документ")
            "jpg", "jpeg", "png" -> println("Изображение")
            "xls", "xlsx", "csv" -> println("Таблица")
            else -> println("Неизвестный тип")
        }
    }

    /*
    Задание 6: "Конвертация температуры"

    Создайте функцию, которая конвертирует температуру из градусов Цельсия
    в Фаренгейты и наоборот в зависимости от указанной единицы измерения (C/F).
    Единицу измерения нужно передать вторым аргументом функции.
    Несколько аргументов передаются через запятую.
    Распечатай в консоль результат конвертации с добавлением единицы измерения.
    Чтобы добавить единицу измерения после результата используй функцию печати
    без переноса строки print("C") или print("F").
    */
    fun convertTemperature(temperature: Double, unit: String) {
        when (unit.uppercase()) {
            "C" -> {
                print(temperature * 9 / 5 + 32)
                print("F")
            }

            "F" -> {
                print((temperature - 32) * 5 / 9)
                print("C")
            }

            else -> println("Incorrect temperature unit")
        }
    }

    /*
    Задание 7: "Подбор одежды по погоде"

    Напишите функцию, которая на основе температуры воздуха рекомендует
    тип одежды: "куртка и шапка" при температуре ниже +10,
    "ветровка" от +10 до +18 градусов включительно и
    "футболка и шорты" при температуре выше +18 градусов.
    При температурах ниже -30 и выше +35 рекомендуйте не выходить из дома.
    */
    fun printClothingRecommendation(temperature: Int) {
        if (temperature < -30 || temperature > 35) {
            println("Не выходить из дома")
        } else if (temperature < 10) {
            println("Куртка и шапка")
        } else if (temperature <= 18) {
            println("Ветровка")
        } else {
            println("Футболка и шорты")
        }
    }

    /*
    Задание 8: "Выбор фильма по возрасту"

    Кинотеатр предлагает фильмы разных возрастных категорий.
    Напишите функцию, которая принимает возраст зрителя и возвращает доступные
    для него категории фильмов: "детские" (от 0 до 9),
    "подростковые" (от 10 до 18), "18+" для остальных.
    */
    fun getMovieCategory(age: Int): String {
        return when (age) {
            in 0..9 -> "Детские"
            in 10..18 -> "Подростковые"
            in 19..Int.MAX_VALUE -> "18+"
            else -> "Incorrect age value"
        }
    }
}

fun main() {
    val homework = Homework6()

    println("Задание 1:")
    homework.printSeason(1)
    homework.printSeason(5)
    homework.printSeason(8)
    homework.printSeason(11)
    homework.printSeason(13)

    println("Задание 2:")
    homework.convertDogAge(1)
    homework.convertDogAge(2)
    homework.convertDogAge(3)
    homework.convertDogAge(-1)

    println("Задание 3:")
    homework.printTransportType(0.5)
    homework.printTransportType(1.0)
    homework.printTransportType(3.0)
    homework.printTransportType(5.0)
    homework.printTransportType(10.0)
    homework.printTransportType(-1.0)

    println("Задание 4:")
    homework.printBonusPoints(500)
    homework.printBonusPoints(1000)
    homework.printBonusPoints(1500)
    homework.printBonusPoints(-100)

    println("Задание 5:")
    homework.printDocumentType("txt")
    homework.printDocumentType("PNG")
    homework.printDocumentType("xlsx")
    homework.printDocumentType("pdf")

    println("Задание 6:")
    homework.convertTemperature(0.0, "C")
    println()

    homework.convertTemperature(32.0, "F")
    println()

    homework.convertTemperature(20.0, "X")
    println()

    println("Задание 7:")
    homework.printClothingRecommendation(-31)
    homework.printClothingRecommendation(-10)
    homework.printClothingRecommendation(10)
    homework.printClothingRecommendation(18)
    homework.printClothingRecommendation(25)
    homework.printClothingRecommendation(36)

    println("Задание 8:")
    println(homework.getMovieCategory(5))
    println(homework.getMovieCategory(15))
    println(homework.getMovieCategory(25))
    println(homework.getMovieCategory(-1))
}