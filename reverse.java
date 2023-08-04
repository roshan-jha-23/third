import java.util.Arrays;
import java.util.Scanner;

public class reverse{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
       int[]arr=new int[n];
       for(int i=0;i<arr.length;i++){
           arr[i]=sc.nextInt();
       }
       reverse(arr);
    }
    static void reverse(int[]arr){
     int left=0;
     int right=arr.length-1;
     while(left<right){
         int temp=arr[left];
         arr[left]=arr[right];
         arr[right]=temp;//sir ne bhi toh bola tha ki swap karoge toh fal milega
         left++;
         right--;//just because isko bahar kar diye thee isliye chalta gaya.
     }

        System.out.println(Arrays.toString(arr));
    }

}