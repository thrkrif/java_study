package loop;

public class WhileEx1 {
    public static void main(String[] args) {
        // 1~10까지 출력 while, for 각각
        // 1. while
        System.out.println("While문 이용");
        int count = 1;
        while(count <= 10){
            System.out.println(count);
            count++;
        }

        //2. for
        System.out.println("for문 이용");
        for(int i = 1; i <= 10; i++){
            System.out.println(i);
        }

    }
}
