package com.example.kotlin

// 15. Assignment Operator

fun main(args: Array<String>): Unit{
//배정 연산자: 변수에 값을 저장할 때 사용하는 연산자

    val a: Int
    var b: Int      //Int 타입 변수 a, b 선언

    a = 10 + 5      // =연산자는 우선순위가 매우 낮기 때문에 10+5가 먼저 계산된다.
    b = 10

    b += a      //b에 a의 값을 누적, b=10+a와 같다.
    println(b)  //25 출력

    b %= 3      //b를 3으로 나눈 나머지를 b에 저장
    println(b)  //1 출력
}

//Next: Statement