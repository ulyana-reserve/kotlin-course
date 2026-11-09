package org.example.lessons.lesson18.homework.abstractdevices

import org.example.lessons.lesson18.homework.capabilities.Openable
import org.example.lessons.lesson18.homework.capabilities.Powerable
import org.example.lessons.lesson18.homework.capabilities.TemperatureRegulatable

abstract class RefrigeratorBase : Powerable, Openable, TemperatureRegulatable {
    abstract override val maxTemperature: Int
}
