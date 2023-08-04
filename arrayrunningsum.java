import java.util.Arrays;
import java.util.Scanner;

public class arrayrunningsum {
    public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
int []arr=new int[5];
for(int i=0;i<5;i++){
    arr[i]=sc.nextInt();
}
        System.out.println(Arrays.toString(runningsum(arr)));
    }
    static  int[] runningsum(int[]arr){
        int [] ans=new int[arr.length];
        ans[0]=arr[0];
        for(int i=1;i<arr.length;i++){
            ans[i]=ans[i-1]+arr[i];
        }return ans;
    }
}
