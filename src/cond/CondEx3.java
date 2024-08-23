package cond;

public class CondEx3 {
    public static void main(String[] args) {
        int rating = 9;
        String str = switch (rating) {
            case 9 -> "어바웃 타임";
            case 8 -> "어바웃 타임2";
            default -> "어바웃 타임3";
        };
        System.out.println(str);
    }
}
