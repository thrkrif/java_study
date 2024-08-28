package array;

import java.util.Scanner;

public class ArrayEx7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("입력 받을 숫자의 갯수를 입력하세요: ");
        int number = scanner.nextInt();
        int[] array = new int[number];

        System.out.println(number + "개의 정수를 입력하세요:");
        for(int j = 0; j < number; j++){
            array[j] = scanner.nextInt();
        }

        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if(array[i] < min){
                min = array[i];
            }
        }
        System.out.println("가장 작은 정수: " + min);


        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if(array[i] > max){
                max = array[i];
            }
        }
        System.out.println("가장 큰 정수: " + max);
    }
}
