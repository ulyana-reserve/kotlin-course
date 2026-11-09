package org.example.lessons.lesson18.homework.equipments

import org.example.lessons.lesson18.homework.capabilities.Powerable

abstract class PoweredEquipment : Powerable {
    var isPoweredOn: Boolean = false
        protected set

    override fun powerOn() {
        isPoweredOn = true
        println("Оборудование включено")
    }

    override fun powerOff() {
        isPoweredOn = false
        println("Оборудование выключено")
    }
}