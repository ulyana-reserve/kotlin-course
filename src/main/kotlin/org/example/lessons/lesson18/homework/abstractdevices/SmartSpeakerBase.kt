package org.example.lessons.lesson18.homework.abstractdevices

import org.example.lessons.lesson18.homework.capabilities.Powerable
import org.example.lessons.lesson18.homework.capabilities.Programmable
import org.example.lessons.lesson18.homework.capabilities.SoundEmitting

abstract class SmartSpeakerBase : Powerable, SoundEmitting, Programmable
