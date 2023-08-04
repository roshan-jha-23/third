import java.util.Arrays;
import java.util.Scanner;

public class swap {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr={
                1,2,3,4,5,6
        };
        swap(arr,1,3);
        System.out.println(Arrays.toString(arr));
    }
    static void swap(int[]arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
