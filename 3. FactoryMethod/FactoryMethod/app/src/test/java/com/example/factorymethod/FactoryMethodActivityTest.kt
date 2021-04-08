package com.example.factorymethod

import org.junit.After
import org.junit.Assert.*
import org.junit.Before
import org.junit.Test
import java.io.ByteArrayOutputStream
import java.io.PrintStream

class FactoryMethodActivityTest {

    private val standardOut: PrintStream? = System.out
    private val outputStreamCaptor: ByteArrayOutputStream = ByteArrayOutputStream()

    @Before
    fun setUp() {
        System.setOut(PrintStream(outputStreamCaptor))
    }

    @After
    fun tearDown() {
        System.setOut(standardOut)
    }

    @Test
    fun `타입이 product1 인 생성된 팩토리에서 operation 을 실행할때, 올바르게 출력된다`() {

        val creator: Creator = CreatorByType(type = "product1")
        creator.operation()

        assertEquals("operationProduct1", outputStreamCaptor.toString())
    }

}