package com.example.kotlin

// 14. Comment

fun main(args: Array<String>): Unit{
//주석: 소스코드에 달아 놓는 메모로, 코드의 동작을 자연어로 설명할 수 있도록 해준다.

    //Apple을 화면에 출력한다.
    println(/*이 부분은 컴파일러가 통째로 무시한다.*/"Apple"/*이
    부
    분
    도
    */)

/*
*   //로 시작하는 부분이 주석이다. (한줄에서만)
*   /**/은 구간 주석이다. //은 한 줄 전체가 주석이 되는 것과 달리, 이 주석은 시작과 끝을 지정할 수 있다.
*   주석은 코드에 설명을 다는 역할이지만, 특정 코드를 임시로 비활성화할 때 사용하기도 한다.
*/
}

//Next: Assignment Operator