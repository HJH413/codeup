package ex02_scanner;

//년, 월, 일을 입력받아 지정된 형식으로 출력하는 연습을 해보자.

import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        String[] strA = str.split("\\.");  // split 나누다 (기준)을 정해서 입력받은 string 을 배열로 나눔 \\.

        String stra = strA[0]; // split 으로 나눈 값들을 배열로 저장
        int a = Integer.parseInt(stra); // int형으로 형변환
        String strb = strA[1];
        int b = Integer.parseInt(strb);
        String strc = strA[2];
        int c = Integer.parseInt(strc);

        System.out.printf("%04d.%02d.%02d", a, b, c); // %02d 2칸을 사용해서 int 를 출력하는데, 한 자리 수인 경우 앞에 0을 붙힘
    }
}
