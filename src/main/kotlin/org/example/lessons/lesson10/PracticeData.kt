package org.example.lessons.lesson10


// График работы сотрудников: дни недели + списки сотрудниокв
val workSchedule: Map<String, List<String>> = mapOf()

//ключ- название предметов: список доступных курсов и описания
val workScheduleTwo: Map<String, MutableMap<String, String>> = mapOf()

// Список категорий предметов: множество дотсупных предметов в каждой категории
val inventory: Map<String, MutableSet<String>> = mapOf("Оружие" to mutableSetOf(), "броня" to mutableSetOf())

// Расписание транспорта  номера маршрута - расписание стринг
val transportSchedule: MutableMap<String, String> = mutableMapOf()




fun main() {
    val weapon = inventory["Оружие"]
    weapon?.add("меч программиста 1 ")

    inventory["Оружие"]?.add("меч программиста 2")
    inventory["Оружие"]?.remove("меч программиста 2")
    println(inventory)
}