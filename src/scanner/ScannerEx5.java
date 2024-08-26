package scanner;

import java.util.Scanner;

public class ScannerEx5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("첫번째 숫자를 입력하세요: ");
        int num1 = scanner.nextInt();
        System.out.print("두번째 숫자를 입력하세요: ");
        int num2 = scanner.nextInt();

        int max = 0;
        if(num1 > num2){
            max = num1;
            System.out.print("두 숫자 사이의 모든 정수: ");
            while(num2 <= max){
                System.out.print(num2 + ", ");
                num2++;
            }
        }
        else{
            max = num2;
            System.out.print("두 숫자 사이의 모든 정수: ");
            while(num1 <= max){
                System.out.print(num1 + ", ");
                num1++;
            }
        }


    }
}
