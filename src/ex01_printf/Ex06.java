package ex01_printf;
//이번에는 특수문자 출력에 도전하자!!
//
//        다음 문장을 출력하시오.
//
//        "!@#$%^&*()"
//        (단, 큰따옴표도 함께 출력한다.)
public class Ex06 {
    public static void main(String[] args) {
        System.out.printf("\"!@#$%%^&*()\"");
    }
}
/*
참고
% 기호가 앞에 붙는 문자를 형식 지정자(format specifier)라고 하며,
그 위치에서 지정한 형식으로 값을 출력해 준다.
따라서, 퍼센트 문자 %를 출력하기 위해서는 %%로 출력해 주어야 한다.

예시
printf("%%");
 */