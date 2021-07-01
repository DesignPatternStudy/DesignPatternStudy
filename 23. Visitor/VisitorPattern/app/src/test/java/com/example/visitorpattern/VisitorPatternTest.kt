package com.example.visitorpattern

import org.junit.Assert.*
import org.junit.Test

class VisitorPatternTest {
    @Test
    fun `버스의 기름이 10이고 운전을 1번 했을때 값이 올바르게 나와야 한다`(){

        val bus = Bus(10).apply {
            drive()
        }

        assert(bus.getFuel() == 9)
        assert(bus.visit(CarViewVisitor()) == "현재 버스의 기름 상태 : 9")
    }
}