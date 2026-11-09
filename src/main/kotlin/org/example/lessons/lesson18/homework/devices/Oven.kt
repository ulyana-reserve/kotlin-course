package org.example.lessons.lesson18.homework.devices

import lessons.lesson18.homeworks.AbstractTemperatureOpenableEquipment
import org.example.lessons.lesson18.homework.capabilities.Timable

class Oven : AbstractTemperatureOpenableEquipment(), Timable {
    override val maxTemperature: Int = 250
    override fun setTimer(time: Int) = println("Для духовки установлен таймер на $time марсианских солов")
}
