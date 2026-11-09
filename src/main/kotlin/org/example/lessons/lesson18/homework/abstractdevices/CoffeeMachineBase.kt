package org.example.lessons.lesson18.homework.abstractdevices

import org.example.lessons.lesson18.homework.capabilities.AutomaticShutdown
import org.example.lessons.lesson18.homework.capabilities.Programmable
import org.example.lessons.lesson18.homework.capabilities.WaterConnection
import org.example.lessons.lesson18.homework.capabilities.WaterContainer
import org.example.lessons.lesson18.homework.capabilities.Drainable
import org.example.lessons.lesson18.homework.capabilities.Powerable
import org.example.lessons.lesson18.homework.capabilities.Timable

abstract class CoffeeMachineBase : Powerable, WaterContainer, WaterConnection, Drainable, Timable, Programmable,
    AutomaticShutdown
