package com.calculator_practice





fun main () {
    val num1 = readLine()!!.toInt()
    val sign = readLine()!!.toString()
    val num2 = readLine()!!.toInt()
    val operation = Operation(num1,num2,sign)
    when (sign){
        "+" -> operation.add()
        "-" -> operation.sub()
        "*" -> operation.mul()
        "/" -> operation.div()
    }
}

