package ex02_scanner;

/*
정수(int) 2개를 입력받아 그대로 출력해보자.

참고

int a, b;
scanf("%d%d", &a, &b);  //엔터/공백으로 입력 데이터가 구분되어 입력
printf("%d %d", a, b);

와 같은 방법으로 가능하다. */

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();

        System.out.printf("%d %d", a, b);

    }
}
