package org.example.lessons.lesson18.homework

import org.example.lessons.lesson18.homework.devices.Kettle
import org.example.lessons.lesson18.homework.devices.Oven
import org.example.lessons.lesson18.homework.devices.WashingMachine
import org.example.lessons.lesson18.homework.devices.Refrigerator

fun main() {
    val refrigerator = Refrigerator()
    val washingMachine = WashingMachine()
    val kettle = Kettle()
    val oven = Oven()

    // Оборулдование выключено
    refrigerator.setTemperature(4)
    refrigerator.programAction("Охлаждение")

    refrigerator.powerOn()
    refrigerator.setTemperature(4)
    refrigerator.programAction("Охлаждение")
    refrigerator.execute()
    refrigerator.open()
    refrigerator.close()
    refrigerator.powerOff()

    washingMachine.powerOn()
    washingMachine.connectToWaterSupply()
    washingMachine.getWater(30)
    washingMachine.connectToDrain()
    washingMachine.setTemperature(40)
    washingMachine.programAction("Хлопок")
    washingMachine.setTimer(60)
    washingMachine.startMonitoring()
    washingMachine.execute()
    washingMachine.drain()

    kettle.powerOn()
    kettle.fillWater(1)
    kettle.setTemperature(100)
    kettle.setTimer(9)
    kettle.programAction("Кипячение")
    kettle.execute()
    kettle.getWater(1)

    oven.powerOn()
    oven.open()
    oven.setTemperature(180)
    oven.programAction("Выпечка")
    oven.setTimer(35)
    oven.execute()
    oven.close()
}
