package com.example.a5monthhomework7

import java.math.RoundingMode.valueOf

class Math {

    fun add(a: String, b: String): String {
        var result = ""

        if (a.isEmpty() || b.isEmpty()) {
            result = "Вы не заполнили одно из полей"

        } else if (intOrDouble(a)) {
            val numberA = a.toDouble()
            val numberB = b.toDouble()

            result = ((numberA + numberB).toString())
        } else if (a.intOrString()) {
            result = "Нельзя сложить строку"
        } else if (a.toInt() < 0 || a.toDouble() < 0.0) {
            if (!a.intOrString()) {
                result = "Нельзя складывать отрицательные числа"
            }
        } else {
            val numberA = a.toInt()
            val numberB = b.toInt()
            result = ((numberA + numberB).toString())

        }
        return result
    }

    fun String.intOrString(): Boolean {
        val v = this.toIntOrNull()
        return when (v) {
            null -> true
            else -> false
        }
    }

    private fun intOrDouble(str: String): Boolean {
        try {
            if (str.indexOf("") >= 0) {
                valueOf(str)
                return true
            } else {
                return false
            }

        } catch (e: NumberFormatException) {
            return false
        }
    }
}