package ex02_scanner;



/*
문자형(char)으로 변수를 하나 선언하고, 변수에 문자를 저장한 후
변수에 저장되어 있는 문자를 그대로 출력해보자.

참고
char x;
scanf("%c", &x);
printf("%c", x);

와 같은 방법으로 가능하다.
 */
import java.util.Scanner;
public class Ex02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char in = scan.next().charAt(0); //.charAt(0) char 입력받을때 사용
        System.out.printf("%c",in); // %c char
    }
}
