package scanner;

import java.util.Scanner;

public class ScannerWhileEx3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        double avg = 0L;
        int count = 0;
        System.out.println("숫자를 입력하세요. 입력을 중단하려 -1을 입력하세요: ");
        while(true) {
            int num = scanner.nextInt();
            if(num == -1){
                System.out.println("입력한 숫자들의 합계: " + sum);
                System.out.println("입력한 숫자들의 평균: " + ((double)sum / count));
                break;
            }
            sum += num;
            count++;

        }


    }
}
