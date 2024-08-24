package loop;

public class Break2 {
    public static void main(String[] args) {
        int sum = 0;
        for(int i = 1; i <= 10; i++){
            sum += i;
            System.out.println("i = " + i);
            System.out.println("sum = " + sum);
            if(sum >= 10){
                break;
            }
        }
    }
}
