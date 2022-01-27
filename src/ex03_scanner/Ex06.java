package ex03_scanner;

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String[] A = a.split("\\.");

        System.out.printf("%s-%s-%s",A[2],A[1],A[0]);

    }
}
