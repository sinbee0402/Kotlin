package com.example.kotlin

// 17. Comparison Operator

fun main(args: Array<String>): Unit{
//비교 연산자: 두 피연산자를 비교하는 연산자

/*
*   == : a==b => a와 b가 같으면 true, 다르면 false
*   != : a!=b => a와 b가 다르면 true, 같으면 false
*   > : a>b => a가 b보다 크면 true, 그렇지 않으면 false
*   < : a<b => a가 b보다 작으면 true, 그렇지 않으면 false
*   >= : a>=b => a가 b보다 크거나 같으면 true, 그렇지 않으면 false
*   <= : a<=b => a가 b보다 작거나 같으면 true, 그렇지 않으면 false
*
*   비교 연산자의 결과 타입은 Boolean이다.
*   Boolean 타입에는 true(참)과 false(거짓)이라는 특수값만 저장할 수 있다.
*/

    var isRight:Boolean = (10+70) > (3*25)
    println(isRight)

    isRight = false
    println(isRight)

    isRight = 30 == (10+20)
    println(isRight)

    isRight = 0.00001f == 0.005f * 0.002f
    println(isRight)

    isRight = 3.0 * 5+2.7 <= 16
    println(isRight)

}

//Next: Logical Operator