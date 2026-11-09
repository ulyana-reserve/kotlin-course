package lessons.lesson18.homeworks

import org.example.lessons.lesson18.homework.equipments.ProgrammableEquipment
import org.example.lessons.lesson18.homework.capabilities.Openable
import org.example.lessons.lesson18.homework.capabilities.TemperatureRegulatable

abstract class AbstractTemperatureOpenableEquipment : ProgrammableEquipment(), TemperatureRegulatable,
    Openable {
    protected var currentTemperature: Int? = null

    override fun setTemperature(temp: Int) {
        if (!isPoweredOn) {
            println("Нельзя установить температуру: оборудование выключено")
            return
        }
        if (temp !in 0..maxTemperature) {
            println("Температура должна быть от 0 до $maxTemperature °C")
            return
        }
        currentTemperature = temp
        println("Установлена температура: $temp °C")
    }

    override fun open() = println("Оборудование открыто")
    override fun close() = println("Оборудование закрыто")
}