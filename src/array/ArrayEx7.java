package array;

import java.util.Scanner;

public class ArrayEx7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total = 0;

        System.out.print("입력 받을 숫자의 갯수를 입력하세요: ");
        int number = scanner.nextInt();
        int[] array = new int[number];

        System.out.println(number + "개의 정수를 입력하세요:");
        for (int i = 0; i < number; i++) {
            array[i] = scanner.nextInt();
            total += array[i];
        }
        double average = (double) total / array.length;
        System.out.println("입력한 정수의 합계: " + total);
        System.out.println("입력한 정수의 평균: " + average);
    }
}
