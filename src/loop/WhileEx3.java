package loop;

public class WhileEx3 {
    public static void main(String[] args) {
        // max의 크기, 총합 출력하기.
        int max = 1, sum = 0;
        while(max <= 100){
            sum += max;
            max++;
        }
        System.out.println("//max="+ (max-1));
        System.out.println(sum);

    }
}
