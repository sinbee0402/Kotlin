package com.example.kotlin

// 6.Increment & Decrement Operator

fun main(args: Array<String>): Unit {
    var a = 10
    var b = 5

    println(a++ +b)
    println(a)
    println(--b)

/*
*   코틀린의 증감 연산자는 다른 언어의 증감 연산자와 비슷하다.
*   a++는 후위 증가 연산자이기 때문에 a++ +b => 10+5 = 15가 나온다.
*   후위 증가 연산자는 식이 끝나고나서 증가되기 때문에 바로 식을 계산했을 때는 증가하지 않는다.
*
*   a++에 의해 10+1 = 11이 출력된다.
*   --b는 전위 감소 연산자이기 때문에 --b => 5-1 = 4가 나온다.
*   전위 감소 연산자는 바로 감소하기 때문에 출력을 하면 1이 감소한 값이 출력된다.
*
*   전위: 식이 바로 계산된다. (예: ++a, --b)
*   후위: 식이 끝나고나서 계산된다. (예: a++, b--)
*/
}

//Next: Bitwise Operator