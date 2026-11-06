package org.example.lessons.lesson17.homework.gameMachine

class GameMachine(
    val color: String,
    val model: String,

    private val pinCode: String,

    games: List<String>,
) {
    private var isOn: Boolean = false
    private var osLoaded: Boolean = false
    private val installedGames: List<String> = games.toList()
    private var cashBalance: Double = 0.0
    private var sessionPaid: Boolean = false
    val hasJoystick: Boolean = false
    val supportPhone: String = ""
    val sessionPrice: Double = 0.0
    private var owner: String = ""

    fun turnOn() {
        isOn = true
        loadOs()
    }

    fun turnOff() {
        finishOs()
        isOn = false
    }

    fun loadOs(): Boolean {
        if (!isOn) return false
        osLoaded = true
        return true
    }

    fun finishOs() {
        osLoaded = false
    }

    fun showGames(): List<String> = installedGames.toList()

    fun launchGame(game: String): Boolean {
        if (!isOn || !osLoaded || !sessionPaid || game !in installedGames) return false
        sessionPaid = false
        return true
    }

    fun payForSession(amount: Double): Boolean {
        if (amount < sessionPrice) return false
        cashBalance += sessionPrice
        sessionPaid = true
        return true
    }


    fun collectCash(enteredPin: String): Double? {
        if (enteredPin != pinCode) return null
        return openSafeAndDispenseCash()
    }

    private fun openSafeAndDispenseCash(): Double {
        val amount = cashBalance
        cashBalance = 0.0
        return amount
    }
}
