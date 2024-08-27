package array;

import java.util.Scanner;

public class ArrayEx2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = new int[5];
        System.out.println("5개의 정수를 입력하세요: ");
        for(int i = 0; i < 5; i++){
            array[i] = scanner.nextInt();
        }
        System.out.println("출력");
        for (int item : array) {
            System.out.print(item + ", ");
        }
    }
}
