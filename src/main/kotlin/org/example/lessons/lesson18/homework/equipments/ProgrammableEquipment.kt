package org.example.lessons.lesson18.homework.equipments

import org.example.lessons.lesson18.homework.capabilities.Programmable

abstract class ProgrammableEquipment : PoweredEquipment(), Programmable {
    private var programmedAction: String? = null

    override fun programAction(action: String) {
        if (!isPoweredOn) {
            println("Как ты собираешься создавать режим при выключенном оборудовании ???")
            return
        }
        programmedAction = action
        println("Установлен режим: $action")
    }

    override fun execute() {
        if (!isPoweredOn) {
            println("Нельзя запустить режим: оборудование выключено, надо быть внимательным!")
            return
        }
        val action = programmedAction
        if (action == null) {
            println("Сначала задайте режим работы, а потом пользуйтесь!!!")
        } else {
            println("Выполняется режим: $action")
        }
    }
}