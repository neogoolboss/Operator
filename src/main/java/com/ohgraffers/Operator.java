package com.ohgraffers;

public class Operator {

    public static void main(String[] args) {

        // 연산자(Operator)

        // 산술 연산자
        // 연산에 필요한 값이나 변수가 두 개인 이항 연산자
        // 우선 순위에 따라 연산되어 결과가 산출 됨
        // 기본적인 피연산자들의 연산 반향은 왼쪽에서 오른쪽
        // %는 나누기를 하고 난 나머지가 구해지는 연산

        // *,  /,  %  연산자
//        int a = 10, b = 20, c = 0;
//        c = a * b;
//        c = a / b;
//        c = a % b;
//        c = a + b;
//        c = a - b;
//        System.out.println(c);

        // 복합 대입 연산자
        // 다른 연산자와 대입 연산자가 결합한 것
        // 자기 자신의 값과 연산 후 연산 결과를 자기 자신에게 누적 대입
        /*
        a += 10     ==     a = a + 10
        a -= 10     ==     a = a - 10
        a *= 10     ==     a = a * 10
        a /= 10     ==     a = a / 10
        a %= 10     ==     a = a % 10
        */
        // *증감 연산과 비슷해 보이지만 증감연산자(++, --)는 1씩 증감
        // 대입 연산자는 원하는 값을 증가시키고 그 변수에 저장 가능

        // 증감 연산자
        // 피연산자의 값에 1을 더하거나 빼는 연산자(++, --)로 위치에 따라 결과 값이 다르게 나타남

        // 전위 연산 : 먼저 전위 연산 후 다른 연산 실행
        // 후위 연산 : 다른 연산 우선 실행 후 후위 연산
        // (다른 연산이라는 것은 대입이나 println을 통한 출력을 의미)

        /*
            전위 연산자              후위 연산자
            int a = 10;            int a = 10;
            int b = ++a;           int b = a++;
        */

        // Q. 다음의 증감 연산자(전위, 후위)를 고려해서 주석의 결과를 추측해 보자.
//        int a = 11;
//        int b = -5;
//        int c = (a++) - b--;
//        int d = ++c + a--;
//        System.out.println("a : " + a);                          // 출력값 : 11
//        System.out.println("b : " + b);                          // 출력값 : -6
//        System.out.println("c : " + c);                          // 출력값 : 17
//        System.out.println("d : " + d);                          // 출력값 : 29
//        System.out.println("추가 연산 : " + (a++ - --b + ++c));    // 출력값 : 35

        // 비교 연산자
        // 데이터가 같은지, 다른지, 혹은 대소 비교를 할 때 사용
        // 항상 논리 값(true, false)이 결과 값
        // '=='과 '!='은 모든 자료형에 ㅅ용 가능
        // '=='과 '!='을 제외한 비교 연산자(> , >=, <, <=)는 기본형 boolean과 참조형(String)을 제외하고
        // 나머지 자료형에 모두 사용 가능
        /*
                '==' 연산자              '!=' 연산자
                int a = 10;             int a = 10;
                int b = 11;             int b = 11;
                boolean c = a ==b;      boolean c = a != b;
                c는 false                c는 ture

                '>=' 연산자              '<=' 연산자
                int a = 10;             int a = 10;
                int b = 10;             int b = 11;
                boolean c = a >= b;     boolean c = a <= b;
                c는 true                 c는 true
        */

        // 논리 연산자

        // 논리 값(true, false)를 취급하는 연산자
        // && : 두 피연산자가 모두 true일 때 true 반환 (AND)
        // || : 두 피연산자 중 하나만 true여도 true 반환 (OR)
        /*
                [a]         [b]         [a && b]        [a || b]
                true        true          ture            ture
                ture        false         false           true
                false       ture          false           ture
                false       false         false           false
        */

        // 논리 부정 연산자 : !
        // 논리 값을 부정하여 반대 값으로 변경
        // 제어문을 활용할 때 많이 쓰임
//         boolean bool1 = true;
//         boolean bool2 = !bool1;
//        System.out.println(bool2);

        // 삼항 연산자
        // 자바에서 유일하게 피연산자 항목이 3개인 연산자
        // 조건식 ? 식1 : 식2
        // 조건식의 결과 값에 따라 연산을 처리하는 방식으로 결과 값이 참일 경우 식1, 거짓일 경우 식2 수행
        // 삼항 연산자 안에 삼항 연산자를 중첩하여 쓰는 것도 가능

        /*
                                삼항 연산자
        int result1 = a > b ? a++ : b--;
        int result2 = a < b ? a++ : (b ==0 ? a-- : b++);
         */

//        int result1 = a > b ? ++a : b--;
//        int result2 = a < b ? a++ : (b ==0 ? a-- : b++);

        // Q : 다음 삼항 연산자들의 결과를 추측해 보자.
//        int res1 = 5 > 4 ? 50 : 40; // 출력값 : 50
//        System.out.println(res1);
//
//        int a = 2;
//        int b = 4;
//        int c = 2;
//
//        boolean res2 = a==b ? a <=c : b > c; // 출력값 : true
//        System.out.println(res2);
//
//        int d = 3;
//        int e = 6;
//
//        int res3 = true && false ? d*2 + e : d - e; // 출력값 : -3
//        System.out.println(res3);

        // Q : 다음의 연산식 결과가 어떻게 나올지 연산자 우선순위를 생각해서 추측해보자.
//
//        int a = 'Z';
//        System.out.println(!('A' <= a && a <= 'Z')); // 출력값 : false
//
//        int b = 3;
//        int c = 10;
//        System.out.println(c >= 5 || b < 0 && b > 2); // 출력값 : true


    }

}
