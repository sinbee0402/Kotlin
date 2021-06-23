package com.example.kotlin

// 9. Trap of RealNumber

fun main(args: Array<String>): Unit{
    println(0.1f+0.1f+0.1f)
    println(0.1f+0.1f+0.1f+0.1f+0.1f+0.1f+0.1f+0.1f+0.1f+0.1f)
    println(0.1f*10)

/*
*   0.1을 3번 더했으므로 0.3이 올바르게 출력된다.
*   0.1을 10번 더했는데 1이 아니라 1.0000001이라는 엉뚱한 값이 출력된다. 이 점이 바로 실수 타입의 함정이다.
*
*   실수 값은 2진수로 표현되기 때문에 상황에 따라 정확한 값을 가리킬 수 없다.
*   10진수로 0.1이라는 값은, 2진수로 표현할 때 소수점이 정확히 나눠 떨어지지 않는 무한 소수가 되기 때문에
*   표현할 수 있는 가장 근사한 값인 0.10000001490116... 로 바뀌어 저장된다.
*   물론, 저장하려는 실수가 운 좋게 2진수 유효숫자로 정확히 표현할 수 있는 수라면 그 값이 온전히 저장되지만, 그렇지 못하면 잘못된 값을 저장하게 된다.
*
*   0.1에 10을 곱하는 2번째 println()과 같은 계산을 했으나 제대로 올바른 값이 나왔다.
*   10번 더하는 것은 오차가 10번 누적되고, 1번 곱하는 것은 오차가 1번 누적되기 때문에 결과가 온전히 나온 것이다.
*
*   항상 정확한 결과만을 산출해야 하는 컴퓨터의 이런 특성은 너무 치명적이기에
*   실수 계산을 할 때는 항상 대략적인 값만을 얻을 수 있다는 것을 염두에 두고, 꼭 실수 값을 처리해야 하는 상황이 아니라면 정수 타입만을 사용하는 편이 좋다.
*/
}

//Next: CharType