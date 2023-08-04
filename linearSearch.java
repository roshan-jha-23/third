import java.util.Scanner;

public class linearSearch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int []arr=new int[10];

        System.out.println("enter the element of matrix");
        for(int i=0;i<10;i++) {
            arr[i] = sc.nextInt();}
        System.out.println("enter your target element");
        int target=sc.nextInt();
        int ans=searching(arr,target);
        System.out.println(ans);

    }

 static int searching(int[] arr, int target) {
        if(arr.length==0){
            return -1;
        }
        //now using for loop to go through every elemnt to check wheather it matches our target elemnet or not
     for(int i=0;i<arr.length;i++){
         if(arr[i]==target){
             return i;
         }
     }
     return -1;
    }
}
