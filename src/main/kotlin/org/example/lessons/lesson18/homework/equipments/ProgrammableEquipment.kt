package org.example.lessons.lesson18.homework.equipments

import org.example.lessons.lesson18.homework.capabilities.Programmable

abstract class ProgrammableEquipment : PoweredEquipment(), Programmable {
    protected var programmedAction: String? = null

    override fun programAction(action: String) {
        if (!isPoweredOn) {
            println("Нельзя задать режим: оборудование выключено")
            return
        }
        programmedAction = action
        println("Установлен режим: $action")
    }

    override fun execute() {
        if (!isPoweredOn) {
            println("Нельзя запустить режим: оборудование выключено")
            return
        }
        val action = programmedAction
        if (action == null) {
            println("Сначала задайте режим работы")
        } else {
            println("Выполняется режим: $action")
        }
    }
}