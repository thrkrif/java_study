package loop;

public class WhileEx2 {
    public static void main(String[] args) {
        // 짝수 출력 while, for 각각
        // 1. while
        System.out.println("While문 이용");
        int count = 1;
        while(count <= 10){
            if (count % 2 == 0) {
                System.out.println(count);
            }
            count++;
        }

        //2. for
        System.out.println("for문 이용");
        for(int i = 1; i <= 20; i++){
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        //3. for  그닥 좋은 코드는 아니라고 생각한다. for 안에는 카운터 변수만 작성해 주면 좋을 것.
        System.out.println("for문에 여러개의 인자 이용");
        for(int i = 2, j = 1; j <= 10; i += 2, j++){
            System.out.println(i);
        }
    }
}
