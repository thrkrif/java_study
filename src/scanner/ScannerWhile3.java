package scanner;

import java.util.Scanner;

public class ScannerWhile3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        while (true) {
            System.out.print("정수를 입력하세요: ");
            int num1 = scanner.nextInt();

            if (num1 == 0) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }
            sum += num1;
        }
        System.out.println("정수들의 총합: " + sum);
    }
}
