package ex02_scanner;

//    정수형(int)으로 변수를 선언하고, 변수에 정수값을 저장한 후
//            변수에 저장되어 있는 값을 그대로 출력해보자.
//            예시
//            int main()
//            {
//            int n;
//            scanf("%d", &n);
//            printf("%d", n);
//
//            return 0;
//            }
//            와 같은 형태로 가능하다.
//          입력
//정수 1개가 입력된다.
//
//
//출력
//입력된 정수를 그대로 출력한다.
//
//
//입력 예시
//15
//
//출력 예시
//15
//

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        System.out.printf("%d",num); // printf 에서 %d는 정수형 호출
    }
}
