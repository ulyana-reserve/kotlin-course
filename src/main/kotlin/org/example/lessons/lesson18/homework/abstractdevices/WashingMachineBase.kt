package org.example.lessons.lesson18.homework.abstractdevices

import org.example.lessons.lesson18.homework.capabilities.AutomaticShutdown
import org.example.lessons.lesson18.homework.capabilities.Openable
import org.example.lessons.lesson18.homework.capabilities.WaterConnection
import org.example.lessons.lesson18.homework.capabilities.Drainable
import org.example.lessons.lesson18.homework.capabilities.Powerable
import org.example.lessons.lesson18.homework.capabilities.Timable

abstract class WashingMachineBase : Powerable, Openable, WaterConnection, Drainable, Timable, AutomaticShutdown {
    abstract override val sensorType: String
    abstract override val maxSensoredValue: Int
}
