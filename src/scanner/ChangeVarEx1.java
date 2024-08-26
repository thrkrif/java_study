package scanner;

public class ChangeVarEx1 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int temp = 0;
        System.out.println("before a, b = " + a + ", " + b);
        temp = a;
        a = b;
        b = temp;
        System.out.println("after a, b = " + a + ", " + b);

    }
}
