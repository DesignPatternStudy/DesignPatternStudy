package com.example.bridgepattern

interface Workshop {
    fun work(): String
}

class Produce : Workshop {
    override fun work(): String = "Produced"
}
