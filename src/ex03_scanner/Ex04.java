package ex03_scanner;

import java.util.Scanner;

public class Ex04 { //for문 사용하기
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        int len = a.length();
        for (int i = 0; i < len ; i++) {
            System.out.printf("\'%c\'\n", a.charAt(i));//  ' char ' , 문자형을 char로 형변환
        }
    }
}
