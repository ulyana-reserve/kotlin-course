package org.example.lessons.lesson18.homework.abstractdevices

import org.example.lessons.lesson18.homework.capabilities.LightEmitting
import org.example.lessons.lesson18.homework.capabilities.Powerable
import org.example.lessons.lesson18.homework.capabilities.Programmable

abstract class SmartLampBase : Powerable, LightEmitting, Programmable
