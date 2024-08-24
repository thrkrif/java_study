package loop;

public class ForEx3 {
    public static void main(String[] args) {
        int max = 1, sum = 0;
        for(max = 1; max <= 10; max++){
            sum += max;
        }
        System.out.println("//max="+ (max-1));
        System.out.println(sum);
    }
}
