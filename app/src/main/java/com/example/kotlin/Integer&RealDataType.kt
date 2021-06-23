package com.example.kotlin

fun main(args: Array<String>): Unit {
/*
*   정수 타입(정수를 저장할 수 있는 타입)
*       - Byte(1 Byte): -128 ~ 127
*       - Short(2 Byte): -3만 2768 ~ 3만 2767
*       - Int(4 Byte): -21억 4748만 3648 ~ 21억 4748만 3647
*       - Long(8 Byte): -922경 3372조 0368억 5477만 5808 ~ 922경 3372조 0368억 5477만 5807
*
*   실수 타입(실수를 저장할 수 있는 타입)
*       - Float(4 Byte): 1.410-45 ~ 3.40282351038
*       - Double(8 Byte): 4.910-324 ~ 1.797693134862315710308
*       - 실수 타입은 저장 가능 범위가 아니라 소수점 정밀도이다.
*/

    val a:Byte=125
    //Byte 타입의 변수 선언 - 표현식이 리터럴로만 이루어져 있고, 그 값이 Byte의 저장가능 범위 안에 있을 경우 저장 허용
    val b:Short=(100+200)*100
    //Short 타입의 변수 선언 - 위와 같은 이유로 Short의 저장가능 범위에 들어가기 때문에 30000이 저장된다.
    var c:Int=12_4354_6538
    //Int 타입의 변수 선언 - 리터럴 안의 _(언더스코어)를 넣어 숫자를 좀 더 보기 쉽게 표현
    // _(언더스코어)의 위치와 갯수는 마음대로 할 수 있으며, 실수 타입에도 적용 가능
    c=0xFF_88_88    //16진수 - 정수 리터럴이 0x로 시작하면서 16진수로 인식된다.
    c=0b01010010_01100011_01110101_01000101    //2진수 - 정수 리터럴이 0b로 시작하면서 2진수로 인식된다.
                                                //보통의 경우 0b로 시작하면 8진수로 인식되지만, 코틀린은 8진법 정수 리터럴을 지원하지 않는다.
    var d:Long=-543_7847_3984_7238_4723    //Long 타입의 변수 선언 - 정수 리터럴의 값이 Int 범위를 초과하면 자동으로 Long 타입이 된다.
                                            // -543_7847_3984_7238_4723은 Long 타입이다.
    c=a+b   //Byte+Short의 결과는 Short 타입이 아니라 Int 타입이 된다.
    d=c+10L     //Int 타입보다 작은 정수 타입들끼리 어떤 산술 연산을 해도 무조건 Int 타입이 나온다.
    //a=125, b=30000
    //c=a+b=125+30000=30125
    //정수 리터럴 뒤에 L을 붙이면 수의 크기에 상관없이 무조건 Long 타입이 된다.
    //c는 Int 타입, d는 Long 타입이므로 c+10L은 무조건 Long 타입이 된다.
    //Int 타입과 Long 타입을 계산하면 계산 결과가 Int의 범위를 넘을 수 있기 때문이다.
    //c=30125, d=30125+10=30135

    var e:Float=67.6f       //Float 타입의 변수 선언 - 실수 리터럴 뒤에 f를 붙이면 Float 타입이 된다.
                            //Float 타입에 Double 값을 저장할 수 없으므로 리터럴에 f를 붙였다.
    val f:Double=658.456    //Double 타입의 변수 선언
    e=(e+f).toFloat()       //e=67.6, f=658.456
                            //e=e+f=726.056
                        //726.056은 Double 타입이어서 Float 타입인 e에 저장할 수 없으므로, 뒤에 toFloat()를 붙여 Float 타입으로 변환한다.
                        //Float 타입으로 변환된 726.056을 e에 저장한다. 기존 e에 저장되어 있던 67.6은 지워지고 726.056이 새로 저장된다.
    println(e)
}