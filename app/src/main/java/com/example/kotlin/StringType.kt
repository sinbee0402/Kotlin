package com.example.kotlin

// 11. StringType

fun main(args: Array<String>): Unit{
//문자열: 문자(Char)들을 일렬로 나열한 것

    var str:String="Hello"      //String 타입의 변수 선언
    println(str)        // Hello 출력

/*
*   String: 문자열을 저장할 수 있는 타입
*   문자 여러 개를 큰 따옴표로 감사면 그 부분은 String타입이 된다.
*   문자 한 개가 문자열 한 칸에 들어간다. 또, 띄어쓰기도 문자 한 개로 취급된다.
*   각 문자에는 번호가 매겨져 있는데, 여기서 첫번째 문자가 1번이 아니라  0번이라는 것을 주의해야 한다.
*/

    str=str+"\nKotlin!"     //Hello + Kotlin!
    println(str)        //Hello
                        //Kotlin! 출력

/*
*    +연산자의 양 피연산자가 String 타입이면, 왼쪽 문자열과 오른쪽 문자열을 덧붙인다.
*    \n은 줄바꿈을 나타내는 특수문자이다. 큰따옴표 안에서 줄바꿈을 하면 오류가 나게 된다..
*
*    String 타입의 표현식 우측에 [](대괄호)를 적고 그 안에 Int값을 적으면,
*    그 번호에 맞는 문자를 Char 타입으로 꺼낼 수 있다.
*/

    println(str[8])     //t 출력
/*   즉, str은 String 타입이지만, str[8]은 Char 타입이다.
*    str의 8번째에 저장되어 있는 문자 t가 출력된다.
*    문자의 위치를나타내는 숫자를 인덱스(Index)라고 한다.
*/

    val num=10*5+3      //Int 타입 변수 선언, 변수를 10*5+3으로 초기화, num = 53 저장
    println(str+num)    //Hello
                        //Kotlin!53

/*
*    String과 String이 아닌 값을 +연산자로 연결하면,
*    String이 아닌 값을 String으로 변환한 뒤 서로 합친다.
*    num의 53이 문자열로 변하고 그대로 합쳐진다.
*/
}

//Next: Expression Into String