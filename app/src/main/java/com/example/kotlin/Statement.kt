package com.example.kotlin

// 16. Statement

fun main(args: Array<String>): Unit{
//문장: 독립적으로 실행할 수 있는 코틀린 코드 조각, 독립적인 코드 조각을 세는 단위
// 더 이상 다른 코드와 연결되지 않는 독립체를 뜻한다.

    val num:Int     //다른 줄과 연결되지 않은 독립된 코드 조각이므로 하나의 문장이다.
    num=15      //독립적인 코드 조각이므로 문장이다.

    println(
        num+7*3
    )       //사실상 하나로 이어져 있으므로 println(num+7*3) 전체가 한 문장이 된다.
            //의미 없는 빈 줄은 문장으로 인식되지 않는다.
}

//Next: Comparison Operator