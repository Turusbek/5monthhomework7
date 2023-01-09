package com.example.a5monthhomework7

import junit.framework.Assert.assertEquals
import org.junit.After
import org.junit.Before
import org.junit.Test

class MathTest {
    var math: Math? = null

    @Before
    fun install() {
        math = Math()
    }

    @Test
    fun simpleAddCase() {
        assertEquals("5", math?.add("2", "3"))
    }

    @Test
    fun checkEmpty() {
        assertEquals("Вы не заполнили одно из полей", math?.add("", "5"))
    }

    @Test
    fun checkNumber() {
        assertEquals("Нельзя сложить строку", math?.add("fsfs", "fsafs"))
    }

    @Test
    fun floatAddCase() {
        assertEquals("4.0", math?.add("2.0", "2.0"))
    }

    @Test
    fun simpleNegativeAddCase() {
        assertEquals("Нельзя складывать отрицательные числа", math?.add("-2", "-2"))
    }

    @After
    fun detach() {
        math = null
    }
}