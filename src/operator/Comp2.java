package operator;

public class Comp2 {
    public static void main(String[] args){
        String str1 = "문자열1";
        String str2 = "문자열2";

        // 문자열 비교는 == 이 아니라 equals() 이용한다.
        boolean result1 = "hello".equals("hello");  // 리터럴, 리터럴 비교
        boolean result2 = "hello".equals(str1);  // 리터럴, 문자열 비교
        boolean result3 = str1.equals(str2);    // 문자열, 문자열 비교
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
    }
}
