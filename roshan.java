import java.util.Arrays;
import java.util.Scanner;

public class roshan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        int[][] arr = new int[rows][];

        for (int r = 0; r < rows; r++) {
            System.out.print("Enter the number of columns for row " + r + ": ");
            int cols = sc.nextInt();
            arr[r] = new int[cols];

            for (int c = 0; c < cols; c++){
                System.out.print("Enter the value for row " + r + " column " + c + ": ");
                arr[r][c] = sc.nextInt();
            }
        }
             for (int r=0;r< arr.length;r++){
          System.out.println(Arrays.toString(arr[r]));
                    }
    }
}
