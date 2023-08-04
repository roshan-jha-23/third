import java.util.Arrays;
import java.util.Scanner;

public class ConcatenationofArray {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
    int [] arr=new int[n];
    for(int i=0;i< arr.length;i++){
        arr[i]=sc.nextInt();
    }
    int [] ans=getconcentration(arr);
        System.out.println(Arrays.toString(ans));
    }
    static int[] getconcentration(int[]num){
int [] ans=new int[2*(num.length)];
for(int j=0;j< num.length;j++){
    ans[j]=num[j];
    ans[j+num.length]=num[j];
}
   return ans; }
}
