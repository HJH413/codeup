package ex01_printf;
//다음과 같이 줄을 바꿔 출력해야 한다.
//
//        Hello
//        World
//        (두 줄에 걸쳐 줄을 바꿔 출력)
public class Ex03 {
    public static void main(String[] args) {
        System.out.printf("Hello\nWorld\n");
        System.out.printf("Hello\tWorld");
    }
}

/*
'\n'(new line을 의미)을 줄을 바꿀 위치에 넣어야 한다.
'\t'는 탭(tab),
'\c'은 캐리지리턴(carriage return, 그 줄의 맨 앞으로 커서를 보냄)
 */