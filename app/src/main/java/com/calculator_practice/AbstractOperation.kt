package com.calculator_practice

abstract class AbstractOperation (num1:Int,num2:Int){
    abstract var sign : String
    abstract fun add()
    abstract fun sub()
    abstract fun mul()
    abstract fun div()
    }


class Operation (private val num1: Int, private val num2: Int, override var sign: String) :AbstractOperation(num1,num2) {
    override fun add() {
        println("${num1+num2}")
    }
    override fun sub() {
        println("${num1-num2}")
    }
    override fun mul() {
        println("${num1*num2}")
    }
    override fun div() {
        println("${num1/num2}")
    }
}


