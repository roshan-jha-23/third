import java.util.Scanner;

public class max {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[5];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        max(arr);
        System.out.println(max(arr));
    }
    static int max(int[]arr){
        int maxval=arr[0];
        for(int i=0;i<arr.length;i++){
            if(maxval<arr[i]){
                maxval=arr[i];
            }

        }  return maxval;
    }
}
