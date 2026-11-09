package org.example.lessons.lesson18.homework.devices

import lessons.lesson18.homeworks.AbstractTemperatureOpenableEquipment

class Refrigerator : AbstractTemperatureOpenableEquipment() {
    override val maxTemperature: Int = 8
}
