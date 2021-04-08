package com.example.factorymethod

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import java.lang.Exception

class FactoryMethodActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val creator1: Creator = Creator1()
        creator1.operation()


        val creator2: Creator = CreatorByType("product1")
        creator2.operation()
    }
}

interface Product {
    fun operation()
}

abstract class Creator : Product {

    private lateinit var product: Product

    override fun operation() {

        if (!::product.isInitialized) {
            product = factoryMethod()
        }

        product.operation()
    }

    protected abstract fun factoryMethod(): Product
}

class Creator1 : Creator() {

    override fun factoryMethod(): Product {
        return Product1()
    }
}

class Product1 : Product {
    override fun operation() {
        print("operationProduct1")
    }
}

//타입을 생성자로 받아서 만드는 경우.
class CreatorByType(private val type: String) : Creator() {

    override fun factoryMethod(): Product {

        return when (type) {
            "product1" -> {
                Product1()
            }

            else -> {
                throw Exception()
            }
        }
    }
}

