package com.example.proxypattern

import org.junit.Assert.*
import org.junit.Test

class ProxyPatternTest {

    @Test
    fun `RealImage("Photo1") loadImageFromDisk 값은 Loading_Photo1 이어야 한다`() {

        val realImage = RealImage("Photo1")
        assert(realImage.loadImageFromDisk() == "Loading_Photo1")
    }

    @Test
    fun `RealImage("Photo1") displayImage 값은 Displaying_Photo1 이어야 한다`() {
        val realImage = RealImage("Photo1")
        assert(realImage.displayImage() == "Displaying_Photo1")
    }

    @Test
    fun `ProxyImage("Photo1") displayImage 값은 Displaying_Photo1 이어야 한다`() {

        val proxyImage = ProxyImage("Photo1")
        assert(proxyImage.displayImage() == "Displaying_Photo1")
    }


}