import java.util.Arrays;
import java.util.Scanner;

public class shufflearray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
//        for(int i=0;i<n;i++){
//            arr[i]=sc.nextInt();
//        }
//
//        System.out.println(Arrays.toString( shuffle(arr,n/2)));
        System.out.println(0%2==0);
   }

        static int[] shuffle(int[] nums, int n) {

            //Take two variables i and j start i from 0 and j from n
            int i = 0;
            int j = n;

            int ans[] = new int[nums.length];//to store the suffled array

            int k = 0;//to traverse in ans array

            while(k < nums.length){

                //If K is even than copy the element on the i'th index in nums array to ans array
                if(k % 2 == 0){
                    ans[k] = nums[i];
                    i++;
                    k++;
                }
                else{
                    //If K is odd than copy the element on the j'th index in nums array to ans array
                    ans[k] = nums[j];
                    k++;
                    j++;
                }
            }
            return ans;
    }
}
