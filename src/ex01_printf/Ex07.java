package ex01_printf;
//윈도우 운영체제의 파일 경로를 출력하는 연습을 해보자.
//
//        파일 경로에는 특수문자들이 포함된다.
//
//        다음 경로를 출력하시오.
//
//        "C:\Download\hello.cpp"
//        (단, 큰따옴표도 함께 출력한다.)
public class Ex07 {
    public static void main(String[] args) {
        System.out.printf(" \"C:\\Download\\hello.cpp\"");
    }
}
/*
참고
printf( ) 함수로 백슬래시 문자 \ 를 출력하기 위해서는 \\ 로 출력해야 한다.

예시
printf("\\");
 */