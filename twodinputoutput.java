import java.util.Arrays;
import java.util.Scanner;

public class twodinputoutput {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();
//        int col=sc.nextInt();
//        int[][] arr=new int[row][col];
//        for(int r=0;r< arr.length;r++){
//            for (int c=0;c<arr[r].length;c++){
//                arr[r][c]=sc.nextInt();
//            }
//
//        }  for (int r = 0; r < arr.length; r++) {
//            System.out.println(Arrays.toString(arr[r]));//is loop ke bina kaam nai hchalta babu
//        }b
        String[][] naam=new String[row][2];
        for(int r=0;r< naam.length;r++){
            for(int c=0;c<naam[r].length;c++){
                naam[r][c]=sc.next();
            }
        }
        for(int i=0;i< naam.length;i++){
            System.out.println(Arrays.toString(naam[i]));
        }

    }
}
