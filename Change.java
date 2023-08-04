import java.util.Arrays;
import java.util.Scanner;

public class Change {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[5];
       for(int i=0;i< arr.length;i++){
           arr[i]=sc.nextInt();
       }
       for(int j:arr){
           System.out.print(j+" ");
       }
//
        change(arr);
        System.out.println(Arrays.toString(arr));
    }

   static void change(int[] aarr1) {
        aarr1[0]=99;
    }
}
