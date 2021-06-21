package com.example.kotlin

// 7. Bitwise Operator

fun main(agrs: Array<String>): Unit{
//비트 연산자: 비트(bit) 단위로 논리 연산을 할 때 사용하는 연산자 / 비트 단위로 전체 비트를 왼쪽이나 오른쪽으로 이동시킬 때도 사용(시프트 - shl, shr, ushr)
/*
*   and: 15 and 7 => 15와 7을 비트 단위로 and 연산
*   or: 5 or 2 => 5와 2를 비트 단위로 or 연산
*   xor: 15 xor 5 => 15와 5를 비트 단위로 xor 연산
*   .inv(): 32767.inv() => 32767을 비트 단위로 반전
*   shl: 1 shl 3 => 1을 왼쪽으로 3칸 시프트
*   shr: 8 shr 1 => 8을 오른쪽으로 1칸 시프트
*   ushr: -17 ushr 2 => 부호를 유지한 채 -17을 오른쪽으로 2칸 시프트
*/

    println(15 and 7)   // 7
    println(5 or 2)     // 7
    println(15 xor 5)   // 10
    println(32767.inv())    // -32768
    println(1 shl 3)    // 8
    println(8 shr 1)    // 4
    println(-17 ushr 2)    // 1073741819
}

//Next: Integer & RealDataType