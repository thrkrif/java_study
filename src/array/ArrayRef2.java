package array;

public class ArrayRef2 {
    public static void main(String[] args) {
        int[] students = new int[5];
        students[0] = 1;
        students[1] = 2;
        students[2] = 3;
        students[3] = 4;
        students[4] = 5;

        for(int i = 0; i < students.length; i++){
            System.out.println("학생 " + (i+1) + "의 등수: " + students[i]);
        }
    }
}
