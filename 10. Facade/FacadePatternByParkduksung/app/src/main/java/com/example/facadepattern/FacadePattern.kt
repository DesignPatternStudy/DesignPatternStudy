package com.example.facadepattern

class FacadePattern {

    private val triangle : Shape = Triangle()
    private val circle : Shape = Circle()
    private val rhombus : Shape = Rhombus()

    fun runTriangle() : String{
       return  triangle.run()
    }

    fun runCircle() : String{
        return circle.run()
    }

    fun runRhombus() : String{
        return rhombus.run()
    }

}

interface Shape {
    fun run() : String
}

class Circle : Shape{

    override fun run(): String {
        return "RunCircle"
    }
}

class Triangle : Shape{

    override fun run(): String {
        return "RunTriangle"
    }
}
class Rhombus : Shape{

    override fun run(): String {
        return "RunRhombus"
    }
}
