package org.example.lessons.lesson18.homework.equipments

import org.example.lessons.lesson18.homework.capabilities.Powerable

abstract class PoweredEquipment : Powerable {
    private var poweredOn = false

    protected val isPoweredOn: Boolean
        get() = poweredOn

    override fun powerOn() {
        poweredOn = true
        println("Оборудование почему-то включено")
    }

    override fun powerOff() {
        poweredOn = false
        println("Оборудование выключено - приходите завтра")
    }
}