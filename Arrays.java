//import java.util.Arrays;

public class Arrays {
    public static void main(String[] args) {
        int[] marks = new int[3];

        marks[0] = 97;
        marks[1] = 98;
        marks[2] = 95;

        System.out.println(marks[2]);

        // length
        System.out.println(marks.length);

        // sort
        // Arrays.sort(marks);

        int[] marks1 = { 97, 98, 96 };

        int[][] finalMarks = { { 97, 98, 95 }, { 95, 95, 98 } };
        System.out.println(finalMarks[0][0]);
    }
}
