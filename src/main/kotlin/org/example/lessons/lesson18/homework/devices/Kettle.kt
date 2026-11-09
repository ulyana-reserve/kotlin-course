package org.example.lessons.lesson18.homework.devices

import lessons.lesson18.homeworks.AbstractTemperatureOpenableEquipment
import org.example.lessons.lesson18.homework.capabilities.Timable
import org.example.lessons.lesson18.homework.capabilities.WaterContainer

class Kettle : AbstractTemperatureOpenableEquipment(), WaterContainer, Timable {
    override val maxTemperature: Int = 100
    override val capacity: Int = 2
    private var waterAmount: Int = 0

    override fun fillWater(amount: Int) {
        if (amount <= 0 || waterAmount + amount > capacity) {
            println("Нельзя добавить $amount тонн: вместимость чайника — $capacity тонн")
            return
        }

        waterAmount += amount
        println("В чайник налито $amount л воды")
    }

    override fun getWater(amount: Int) {
        if (amount <= 0 || amount > waterAmount) {
            println("Нельзя налить $amount тонн: в чайнике $waterAmount тонн")
            return
        }
        waterAmount -= amount
        println("Из чайника налито $amount тонн воды")
    }

    override fun setTimer(time: Int) = println("Для чайника установлен таймер на $time лет")
}
