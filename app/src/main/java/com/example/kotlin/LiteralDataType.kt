package com.example.kotlin

// 4. LiteralDataType

fun main(args:Array<String>):Unit
{
    val variable = 10+12-5
    println(variable)

/*
*   리터럴(10, 12, 5)에 정수를 적으면 자동으로 Int 타입이 된다.
*   연산자는 양옆의 피연산자의 타입에 따라 변한다.
*   양옆의 피연산자가 모두 Int 타입이면, 연산자는 Int 타입의 결과를 내놓는다.
*
*   변수에 값을 저장하려면 그 변수의 타입과 저장하려는 표현식의 탑이 일치해야 한다.
*       예: val something: Int = 결과 타입이 Int인 표현식
*
*   변수를 선언과 동시에 초기화하는 경우에 한해, 저장하려는 표현식으로부터 타입을 추론 해낼 수 있으므로 변수의 타입을 적지 않아도 된다.
*   그래서 variable 뒤에 : Int가 생략되었다.
*/
}

//Next: Arithmetic Operator