package ex01_printf;
//특수한 형태의 출력문에 대한 연습을 해보자.
//
//        다음 문장을 출력하시오.
//
//        'Hello'
public class Ex04 {
    public static void main(String[] args) {
        System.out.printf("\'Hello\'");
    }
}

/*
printf( ) 함수로 따옴표 문자 ' 를 출력하기 위해서는 \' 로 입력해야 한다.

\' 는 작은따옴표 문자 자체 출력
\" 는 큰따옴표 문자 자체 출력 …  등.

작은따옴표나 큰따옴표는 문자나 문장을 나타내기 위한 기호들로 쓰이는데,
그렇게 쓰이는 의미가 아니라 따옴표 그 자체를 표현해 주기 위해서이다.

예시
printf("\'");
 */
