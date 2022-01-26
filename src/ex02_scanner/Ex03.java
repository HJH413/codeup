package ex02_scanner;

/*
실수형(float)로 변수를 선언하고 그 변수에 실수값을 저장한 후
저장되어 있는 실수값을 출력해보자.

참고
float x;
scanf("%f", &x);
printf("%f", x);
와 같은 방법으로 가능하다.
 */

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float in = scan.nextFloat();
        System.out.printf("%f",in); // %f float입력
    }
}
