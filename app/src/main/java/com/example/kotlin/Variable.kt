package com.example.kotlin

// 3. Variable

fun main(args: Array<String>): Unit
{
    var total:Int
    total=0

    val a:Int=10+53-7
    println(a)

    val b:Int=43+75+a
    println(b)

    total=a+b
    println(total)

/*
*   변수: 값을 저장해놓는 공간
*   var은 뒤에오는 total이 변수임을 나타내는 키워드이다.
*   키워드: 코틀린 문법 상으로 정해놓은 단어
*   식별자: 임의로 지어낸 이름(total)
*          키워드를 제외한 영문자, 숫자, _(언더스코어)로만 지을 수 있다.
*          숫자는 맨 앞에 오면 안된다.
*          공백을 허용하지 않는다.
*
*       여러 단어로 된 식별자 짓기(편법)
*           -낙타 표기법(Camel Case): anyVariableName / 주로 사용함
*           -파스칼 표기법(Pascal Case): AnyVariableName
*           -뱀 표기법(Snake Case): any_variable_name
*
*   선언: 식별자가 무엇을 의미하고, 그 특징이 무엇인지 기술하는 것
*   var total:Int = 0 / 선언과 동시에 초기화: 한 줄로 쓰는 형태
*   var: 일반 변수-값이 변할 수 있다., val: 불변 변수-값이 변하지 않는다.
*/
}

//Next: LiteralDataType