package casting;

public class Cast2 {
    public static void main(String[] args) {
        int intValue;
        long longValue;
        double doubleValue = 10L;
        longValue = (long)doubleValue;
        intValue = (int)doubleValue;    // 명시적 형변환
        System.out.println(intValue);
        System.out.println(longValue);
        System.out.println(doubleValue);

        double result = (double)2 / 3;  // 2.0 / 3.0
        double result1 = 2 / 3; //  2/3 = 0.xx 가 나올텐데 int형 이므로 0이 나옴. result1은 double이므로 자동 형변환 일어나서 0.0
        System.out.println(result);
        System.out.println(result1);
    }
}
