package org.example.lessons.lesson18.homework.capabilities

interface AutomaticShutdown {
    val sensorType: String
    val maxSensoredValue: Int
    fun startMonitoring()
}
