package org.example.lessons.practice

class ATM {

    private var balance: Double = 0.0
    private var pin: String = "0000"

    fun getBalance(pin: String): Double {
        if (this.pin == pin) {
            return balance
        }
        return 0.0
    }
}