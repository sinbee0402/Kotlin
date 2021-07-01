package com.example.kotlin

// 13. Type Alias

typealias Number = Int

fun main(args: Array<String>): Unit{
    val a:Number = 10
    println(a)      // 10 출력

/*
*   typealias 별명 = 타입(Int, float, Double, Char, String)
*   위와 같이 작성하면 타입에 새로운 이름을 붙일 수 있다.
*
*   Number는 Int와 같은 타입이다.
*   a는 Number 타입이므로 Int 타입이 된다.
*
*   타입 별명은 타입 이름이 너무 길 때, 타입 이름을 줄이는 용도로 사용하면 좋다.
*/
}

//Next: Comment