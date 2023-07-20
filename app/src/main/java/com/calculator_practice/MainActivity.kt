package com.calculator_practice

// calc 에 있는 when 을 main으로 넘김
// 메인에서 var operation 선언
// when 문 마지막에 else 넣음?
// when 문의 "+" -> println("${AddOperation.operate3(num1,num2)}")에서AddOperation()으로 변경.
// 출력하기 위해 메인에 result 상수 생성.


fun main() {
    val calc = Calc()
    val num1 = readLine()!!.toInt()
    val sign = readLine()!!.toString()
    val num2 = readLine()!!.toInt()
    var oper =
        when (sign) {
            "+" -> AddOperation()
            "-" -> SubOperation()
            "*" -> MulOperation()
            "/" -> DivOperation()
            else -> AddOperation()

        }
    val result = calc.operation(oper, num1, num2)
    println(result)
}

class Calc() {
    fun operation(A: AbstractOperation, num1: Int, num2: Int): Double {
        return A.operate(num1, num2)
    }
}

