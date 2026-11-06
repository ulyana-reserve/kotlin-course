package org.example.lessons.practice

import java.lang.classfile.instruction.NewMultiArrayInstruction

class GameConsole {
    fun startGame(gameName: String) {
        loadGame(gameName)
    }

    private fun initializeHardware() {
        println("Im ready!")
    }

    private fun loadGame(gameName: String) {
        initializeHardware()
        println("Game started!!")
    }
}

fun main() {
    val gameConsole = GameConsole()
    gameConsole.startGame("myGameName")
}