package method;

public class MethodEx1 {
    public static void main(String[] args) {

        System.out.println("평균값 : " + avr(1,2,3));
        System.out.println("평균값 : " + avr(4,5,6));

    }

    public static double avr(int a, int b, int c){
        int sum = a + b + c;
        return  sum / 3.0;

    }

}
