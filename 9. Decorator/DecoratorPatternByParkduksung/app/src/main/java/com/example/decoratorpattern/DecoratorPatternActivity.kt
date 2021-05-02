package com.example.decoratorpattern

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class DecoratorPatternActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}


class Shot(beverage: Beverage) : CondimentDecorator(beverage) {

    override fun cost(): Int {
        return super.cost() + 500
    }

    override fun getDescription(): String {
        return super.getDescription() + " Add Shot"
    }
}

class HouseBlend : Beverage() {
    override fun cost(): Int {
        return 4000
    }

    override fun getDescription(): String {
        return super.getDescription() + "HouseBlend"
    }
}


abstract class Beverage {

    private val description = ""

    open fun cost(): Int = 0
    open fun getDescription(): String = description

}

abstract class CondimentDecorator(private val beverage: Beverage) : Beverage() {

    override fun getDescription(): String {
        return beverage.getDescription()
    }

    override fun cost(): Int {
        return beverage.cost()
    }
}