package array;

public class Array1 {
    public static void main(String[] args) {
        int[][] numbers = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        for (int[] row : numbers){
            for (int number : row) {
                System.out.print(number + " ");
            }
            System.out.println();
        }

    }
}
