package com.example.kotlin

// 12. Expression Into String

fun main(args: Array<String>): Unit{
// +연산자를 사용하는 대신에 좀 더 간결하게 표현식의 값을 문자열에 포함시키는 법

    val a = 10      //변수 a에 10 저장
    val b = 20      //변수 b에 20 저장

    // $: 뒤에 변수 이름을 적으면 해당 부분은 변수의 값으로 대체된다.
    // 변수의 값이 아닌 표현식의 값을 문자열에 포함한다. / ${표현식}

    println("a의 값:$a")      //a의 값:10 출력
    println("b의 값:$b")      //b의 값:20 출력

    println("a + b = ${a + b}")     //a + b = 30 출력

    // $를 출력하려면 \$를 사용하면 된다.

    println("a의 값:\$a")     //a의 값:$a 출력

}

//Next: Type Alias