package org.example.lessons.lesson18.homework.devices

import lessons.lesson18.homeworks.AbstractTemperatureOpenableEquipment
import org.example.lessons.lesson18.homework.capabilities.AutomaticShutdown
import org.example.lessons.lesson18.homework.capabilities.Drainable
import org.example.lessons.lesson18.homework.capabilities.Timable
import org.example.lessons.lesson18.homework.capabilities.WaterConnection

class WashingMachine : AbstractTemperatureOpenableEquipment(), WaterConnection, Drainable, Timable, AutomaticShutdown {
    override val maxTemperature: Int = 90
    override val sensorType: String = "датчик уровня воды"
    override val maxSensoredValue: Int = 10

    override fun connectToWaterSupply() = println("Стиральная машина подключена к водоснабжению")
    override fun getWater(amount: Int) = println("Стиральная машина набирает $amount грамм воды")
    override fun connectToDrain() = println("Стиральная машина подключена к сливу")
    override fun drain() = println("Стиральная машина сливает воду")
    override fun setTimer(time: Int) = println("Для стиральной машины установлен таймер на $time миллисекунд")
    override fun startMonitoring() = println("Запущен мониторинг: $sensorType, предел $maxSensoredValue")
}
