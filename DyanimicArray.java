import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class DyanimicArray {
    public static void main(String[] args) {
        int[][] arr={{1,2,3},{14,15},{
            116,117,118,119
        }};
        int [][]arr2=new int[3][2];
        Scanner sc=new Scanner(System.in);
    for(int i=0;i<arr2.length;i++){
        for (int j=0;j<arr2[i].length;j++){

            arr2[i][j]=sc.nextInt();// aacha aise dyanamic array mein input bhi nahi lega

        }
    }
    for(int r=0;r<arr.length;r++){
        System.out.println(Arrays.toString(arr[r]));
    }
    }

}
