import java.util.Arrays;
import java.util.Scanner;

public class permutationarray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
int [] atisha=new int[6];
for(int j=0;j<atisha.length;j++){
    atisha[j]=sc.nextInt();
}//[0,2,1,5,3,4]
buildarray(atisha);
        System.out.println(Arrays.toString(buildarray(atisha)));
    }//[5,0,1,2,3,4]
    static int[] buildarray(int []arr){
        int[] ans=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            ans[i]=arr[arr[i]];
        }
        return ans;
    }
}
