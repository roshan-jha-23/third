import java.util.Arrays;

public class numbersmaller {
    public static void main(String[] args) {
        int[] arr={7,4,5,8,9};
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(arr)));
    }
    static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] ans=new int[nums.length];
        int n=0;
        int count=0;
        while(n<nums.length){
            for(int i=0;i<nums.length;i++){
                if(nums[n]>nums[i]){
                    count++;
                }
            }
            ans[n]=count;
            count=0;
            n++;
        }
        return ans;
    }
}
