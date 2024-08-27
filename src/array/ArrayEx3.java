package array;

import java.util.Scanner;

public class ArrayEx3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = new int[5];
        System.out.println("5개의 정수를 입력하세요: ");
        for(int i = 0; i < 5; i++){
            array[i] = scanner.nextInt();
        }
        System.out.println("역순으로 출력");
        for(int j = 4; j >=0; j--){
            System.out.print(array[j] + " ");
        }
    }
}
