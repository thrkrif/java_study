package casting;

public class Cast1 {
    public static void main(String[] args) {
        int intValue = 10;
        long longValue;
        double doubleValue;
        longValue = intValue;
        doubleValue = intValue;
        System.out.println(intValue);
        System.out.println(longValue);
        System.out.println(doubleValue);    // 자동 형변환, 묵시적 형변환
    }
}
