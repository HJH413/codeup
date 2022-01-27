package ex03_scanner;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String[] A = a.split("\\."); // 배열선언 하고 배열 나눌 기준점
        System.out.printf("%s\n%s", A[0], A[1]); // 스트링 줄바꿈 스트링
    }
}
