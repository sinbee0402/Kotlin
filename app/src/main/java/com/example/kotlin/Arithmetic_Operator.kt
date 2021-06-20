package com.example.kotlin

fun main(args: Array<String>): Unit{
//산술 연산자: 가감승제를 수행하는 연산자 / 가감승제: 더하기, 빼기, 곱하기, 나누기
/*
*   + : a+b => a와 b를 더한 값
*   - : a-b => a에서 b를 뺀 값
*   * : a*b => a와 b를 곱한 값
*   / : a/b => a를 b로 나눈 값
*   % : a%b => a를 b로 나눈 나머지
*
*   코틀린은 수학의 사칙연산 법칙을 따른다.
*
*   Int: 정수 값을 저장할 수 있는 타입
*   Double: 실수 값을 저장할 수 있는 타입
*
*   Int끼리 계산하면 소수점 뒷부분이 사라지게 된다.
*/

    val num:Int = 15-4*3
    val num2:Int = 65%7
    val num3:Double = 7.5/5+22.25
    val num4:Double = num.toDouble()/num2+0.7
    // num의 변수 타입 자체가 변화하는 것은 아니며, num.toDouble() 부분만이 Double로 인식되는 것뿐이다.
    // toDouble()도 함수의 일종.

    println(num)
    println(num2)
    println(num3)
    println(num4)
}