package org.example.lessons.lesson18.homework.abstractdevices

import org.example.lessons.lesson18.homework.capabilities.Cleanable
import org.example.lessons.lesson18.homework.capabilities.Movable
import org.example.lessons.lesson18.homework.capabilities.Powerable
import org.example.lessons.lesson18.homework.capabilities.Programmable
import org.example.lessons.lesson18.homework.capabilities.Rechargeable

abstract class RobotVacuumBase : Powerable, Movable, Cleanable, Programmable, Rechargeable
