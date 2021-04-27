package com.example.bridgepattern

class Car  : Vehicle(Produce(), Assemble()){
    override fun manufacture(): String = "Car" + _workshop1.work() + _workshop2.work()
}
