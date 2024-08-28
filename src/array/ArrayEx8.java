package array;

import java.util.Scanner;

public class ArrayEx8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("학생의 수를 입력하세요: ");
        int number = scanner.nextInt();

        int[][] score = new int[number][3];
        // String[] subject = { "국어", "영어", "수학"} 으로 작성하면 더 좋은 가독성



        for(int i = 0; i < number; i++){
            int total = 0;
            double average;
            System.out.println((i+1) + "번 학생의 성적을 입력하세요:");
            System.out.println("국어 점수: ");
            System.out.println("영어 점수: ");
            System.out.println("수학 점수: ");
            for(int j = 0; j < 3; j++){
                score[i][j] = scanner.nextInt();
                total += score[i][j];
            }
            average = (double)total / 3;
            System.out.println((i+1) + "번 학생의 총점: " + total + ", 평균: " +  average);

        }

    }
}
