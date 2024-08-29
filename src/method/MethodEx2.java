package method;

import java.util.Scanner;

public class MethodEx2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Hello world 출력 횟수를 입력하시오: ");
        int num = scanner.nextInt();
        printcount(num);

    }

    public static void printcount(int num){
        for(int i = 0; i < num; i++){
            System.out.println("Hello world");
        }
        return;
    }
}
